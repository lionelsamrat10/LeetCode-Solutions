//pascal's triangle solution
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> pascal(numRows);
        for(int i=0;i<numRows;i++)
        {
            pascal[i].resize(i+1);
            pascal[i][0]=pascal[i][i]=1;
            
            //as the first and last ele of row is always 1
            //now we know that the element of array is sum of it's previos two ele in  
            //previous row
            
            for(int j=1;j<i;j++)
            {
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
            
            
        }
        
        return pascal;
    }
        
};
