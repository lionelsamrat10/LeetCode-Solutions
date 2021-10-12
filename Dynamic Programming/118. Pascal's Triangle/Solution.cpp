class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> res;
       for(int i=0;i<numRows;i++)
       {
           vector<int>v(i+1,1); //i+1 elements filled with 1
           for(int j=1;j<i;j++)
           {
               v[j]=res[i-1][j-1]+res[i-1][j];
               
           }
           res.push_back(v);
           
       }
        return res;
    }
};
