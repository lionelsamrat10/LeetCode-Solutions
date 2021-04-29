class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] strg = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<strg.length;i++) Arrays.fill(strg[i],-1);
        return answer(obstacleGrid,0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,strg);
    }
    public static int answer(int[][] arr,int cr,int cc,int er,int ec,int[][] strg){
       if( cr>er || cc>ec || arr[cr][cc]==1 ) return 0;  // if move goes out of array or the cell is blocked return 0
        if(cr==er && cc==ec) return 1;
        
        
        if(strg[cr][cc]!=-1) return strg[cr][cc];  // memoization use
        
        int r=0,d=0;
        
         r +=answer(arr,cr,cc+1,er,ec,strg); // move right
         d += answer(arr,cr+1,cc,er,ec,strg); //move down
        
        return strg[cr][cc]=r+d; // total moves 
        
        
    }
}
