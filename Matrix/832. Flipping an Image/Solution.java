class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        // Flipping
        for(int i=0; i<row; i++) {
            int start = 0, end = col - 1;
            while(start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        // Inverting
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }
}
