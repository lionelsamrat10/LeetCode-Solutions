class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        {
           int m=text1.length();
           int n=text2.length();
    int DP[m+1][n+1];
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(i==0||j==0)
            {
                DP[i][j]=0;
            }
            else if(text1[i-1]==text2[j-1])
            {
                DP[i][j]=DP[i-1][j-1]+1;
            }
            else
            {
                DP[i][j]=max(DP[i-1][j],DP[i][j-1]);
            }
        }
    }
    int ind=DP[m][n];
    char lcs[ind+1];
    lcs[ind]='\0';
    int i=m,j=n;
    while(i>0&&j>0)
    {
        if(text1[i-1]==text2[j-1])
        {
           lcs[ind-1] = text1[i-1]; 
            i--;
            j--;
            ind--;
        }
        else if(DP[i-1][j]>DP[i][j-1])
        {
            i--;
        }
        else
            j--;
    }
    int len=strlen(lcs);
    return len;
}
    }
};
