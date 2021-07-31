class Solution {
    
    public int trap(int[] height) {
        
        //base condition
        if(height.length==0)
            return 0;
        
        int volume = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        
        maxLeft = createMaxLeft(height,maxLeft);
        maxRight = createMaxRight(height,maxRight);
        
        //calculate volume at each bar using formule : min(maxLeft,maxRight)-height
        for(int i=1;i<height.length-1;i++){
            int barVolume = Math.min(maxLeft[i],maxRight[i])-height[i];
            if(barVolume>0)
                volume += barVolume;
        }
        
        return volume;
    }
    
    //Dynamic Programming to calculate left max array
    private int[] createMaxLeft(int[] height, int[] maxLeft){
        maxLeft[0] = 0;
        for(int i=1;i<height.length;i++)
           maxLeft[i] = Math.max(height[i-1],maxLeft[i-1]); 
        return maxLeft;
    }
    
     //Dynamic Programming to calculate right max array
    private int[] createMaxRight(int[] height, int[] maxRight){
        int n = height.length-1;
        maxRight[n] = 0;
         for(int i=n-1;i>=0;i--)
           maxRight[i] = Math.max(height[i+1],maxRight[i+1]); 
        return maxRight;
        
    }
}
