class Solution(object):
    def findDuplicate(self, nums):
        count={}
        
        for i in nums:
            if i not in count:
                count[i]=1
            else:
                count[i]+=1
        
        for i in range(0,len(nums)):
            if count[nums[i]]>1:
                return nums[i]
                break
