class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int>count;
        for(int i=0;i<nums.size();i++)
        {
            count[nums[i]]++;
        }
        for(auto it=count.begin();it!=count.end();it++)
        {
            if(it->second>floor(nums.size()/2))
                return it->first;
        }
        return 0;
    }
};
