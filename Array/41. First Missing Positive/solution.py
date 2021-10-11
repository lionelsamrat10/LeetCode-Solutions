"""
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
"""

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        for i in range(n):
            if nums[i] < 0 or nums[i] > n:
                nums[i]=0
        p = 0
        q = n-1
        while p < q:
            if nums[p] == 0 and nums[q] !=0:
                nums[p],nums[q] = nums[q],nums[p]
                q -= 1
                p += 1
            if nums[p] != 0:
                p += 1
            if nums[q] ==0 :
                q -= 1
        if 0 in nums: zi = nums.index(0)
        else:zi = n
        for i in range(zi):
            nums[abs(nums[i])-1] = - abs(nums[abs(nums[i])-1])
        ans = zi+1
        for i in range(zi):
            if nums[i] >0:return i +1
        return ans
