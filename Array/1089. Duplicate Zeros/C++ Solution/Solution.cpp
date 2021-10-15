Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9

class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        int sz = arr.size(), i = sz - 1;
        while (i >= 0)
        {
            int val = arr[i];
            if (val)
            {
                
            }
            else
            {
                arr.insert(arr.begin() + i, 0);
                arr.pop_back();
            }
            --i;
        }
    }
};
