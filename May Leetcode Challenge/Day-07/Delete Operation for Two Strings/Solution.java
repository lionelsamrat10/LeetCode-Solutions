class Solution {
    Integer[][] dp ;
    public int minDistance(String word1, String word2) {
        dp=new Integer[word1.length()+1][word2.length()+1];
        return helper(word1,word2,0,0);
        
    }
    int helper(String first,String second,int i,int j){
        if(i>=first.length() && j>=second.length())
            return 0;
        else if(i>=first.length())
            return second.length()-j;
        else if(j>=second.length())
            return first.length()-i;
        if(dp[i][j]!=null) return dp[i][j];
        if(first.charAt(i)==second.charAt(j))
            return dp[i][j]=helper(first,second,i+1,j+1);
        else
            return dp[i][j]=1+Math.min(helper(first,second,i+1,j),helper(first,second,i,j+1));
    }
}
