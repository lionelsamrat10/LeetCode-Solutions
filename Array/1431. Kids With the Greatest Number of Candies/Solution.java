class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> solution = new ArrayList<>(candies.length);
        int maxInArray = max(candies);
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= maxInArray){
                solution.add(true);
            }else {
                solution.add(false);
            }
        }
        return solution;
    }
    public int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
}
