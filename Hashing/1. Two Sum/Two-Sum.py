'''
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 
'''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
#         creating a dictionary to track the occurrences of the elements
        n = len(nums)
        for i in range(n):
#           checking for the occurrence of 'target - nums[i]'
              if target - nums[i] in dic:
                return [ dic[ target - nums[i]],i ]
            dic[nums[i]] = i        
                
                
