class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort (horizontalCuts);
        Arrays.sort (verticalCuts);
        
        int maximumWidth = verticalCuts[0];
        int maximumHeight = horizontalCuts[0];
        
        for (int i = 1; i <= horizontalCuts.length; i++) {
            int height = (i == horizontalCuts.length ? h : horizontalCuts[i]) - horizontalCuts[i - 1];
            maximumHeight = Math.max (maximumHeight, height);
        }
        
        for (int i = 1; i <= verticalCuts.length; i++) {
            int width = (i == verticalCuts.length ? w : verticalCuts[i]) - verticalCuts[i - 1];
            maximumWidth = Math.max (maximumWidth, width);
        }
        
        return (int) ((long) maximumWidth * maximumHeight % 1000_000_007);
    }
}
