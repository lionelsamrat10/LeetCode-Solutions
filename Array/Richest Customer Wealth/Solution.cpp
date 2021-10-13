class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int n=accounts.size();int m=0,s=0;
        for(int i=0;i<n;i++)
        {s=0;
         for(int j=0;j<accounts[i].size();j++)
             s+=accounts[i][j];
         m=max(m,s);
        }
        
        return m;
        
    }
};
