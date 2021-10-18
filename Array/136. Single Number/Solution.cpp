class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int count=0,ans;
        map<int,int>counter;
        for(int i=0;i<nums.size();i++)
        {
            counter[nums[i]]++;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(counter[nums[i]]==1)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
};
