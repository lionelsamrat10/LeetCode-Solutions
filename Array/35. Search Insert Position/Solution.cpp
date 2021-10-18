class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        nums.insert(nums.end(),target);
        sort(nums.begin(),nums.end());
        auto it = find(nums.begin(), nums.end(), target);
        int index;
        if (it != nums.end())
        {

            index = it - nums.begin();
        }
        return index;
    }
};
