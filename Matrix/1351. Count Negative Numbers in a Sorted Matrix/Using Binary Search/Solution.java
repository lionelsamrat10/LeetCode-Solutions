class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            count += binarySearchNegatives(grid[i]);
        }
        return count;
    }
    
    public int binarySearchNegatives(int[] array) {
        int low = 0, high = array.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(array[mid] >= 0) low = mid + 1;
            else high = mid - 1;
        }
        return array.length - low;
    }
}
