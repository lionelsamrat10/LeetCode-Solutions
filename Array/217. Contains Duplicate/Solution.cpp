PROBLEM LINK:https://leetcode.com/problems/contains-duplicate/
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int flag=0;
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i]==nums[i+1])
                flag=1;
            
                
        }
       if(flag==1)
           return true;
        else
            return false;
    }
};
