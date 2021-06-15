class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort the boxtype based on decreasing order of units
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        
        int units = 0;
        
        for(int i = 0; i < boxTypes.length; i++){
            int[] box = boxTypes[i];
            
            int numOfBox = Math.min(box[0], truckSize);
            
            //append units
            units += (numOfBox * box[1]);
            
            //decrement trucksize
            truckSize -= numOfBox;
            
            //no need to check further
            if(truckSize == 0) break;
        }
        
        return units;
    }
}
