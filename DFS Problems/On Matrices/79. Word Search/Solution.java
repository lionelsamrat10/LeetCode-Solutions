class Solution {
    public boolean exist(char[][] board, String word) {
        
        char arr[]=word.toCharArray();
        
        //we don't want to check (i,j) if it already considered before
        //to do so using boolean array
        boolean f[][]=new boolean[board.length][board[0].length];
        
        //try to search for given word from each possible indices...(i,j)
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //is here at this index
                if(check(i,j,0,board,arr,f))
                        return true;//return true if it is
            }
        }
        //after checking all the indices we didn't found given word 
        //returning false;
        return false;
    }
    public boolean check(int i,int j,int index,char board[][],char arr[],boolean f[][]){
        //we have reached at last char of given word
        //hence we found entire word 
        //return true
        if(index==arr.length)
            return true;
        //cheking (i,j) is out of bound?
        //if we have already checked (i,j) in this search  
        //word's char is not matching
        //return false
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || arr[index]!=board[i][j] || f[i][j])
            return false;
        
        f[i][j]=true;//doing so we won't come here next time as it is already checked
        
        //check for next char of word in surrounding
        boolean flag=false;
        
        flag = flag || check(i-1,j,index+1,board,arr,f);
        if(flag){//if we find the word then no need to check further 
            f[i][j]=false;
            return true;
        }
        flag = flag || check(i+1,j,index+1,board,arr,f);
        if(flag){
            f[i][j]=false;
            return true;
        }
        flag = flag || check(i,j-1,index+1,board,arr,f);
        if(flag){
            f[i][j]=false;
            return true;
        }
        flag = flag || check(i,j+1,index+1,board,arr,f);
        
        f[i][j]=false;
        return flag;
    }
}
