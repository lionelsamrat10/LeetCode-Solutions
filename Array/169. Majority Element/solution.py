'''
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
 
'''

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        curMaj = nums[0]
        count = 1
        n = len(nums)
        for i in range(1,n):
            if nums[i] == curMaj:count += 1
            else: count -= 1
            if count == 0:
                curMaj = nums[i]
                count = 1
        return curMaj
        
