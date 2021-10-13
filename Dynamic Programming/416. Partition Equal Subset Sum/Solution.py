class Solution:
    def canPartition(self, nums: List[int]) -> bool:
       
        my_sum = sum(nums)
       
        if my_sum % 2 != 0:
            return False
       
        checksum = my_sum // 2
       
        t = [[False]*(checksum+1) for _ in range(len(nums)+1)]
       
        for i in range(len(t)):
           
            t[i][0] = True
           
        for i in range(1,len(t)):
           
            for j in range(1,len(t[0])):
               
                if nums[i-1] <= checksum:
                   
                    t[i][j] = t[i-1][j-nums[i-1]] or t[i-1][j]
                   
                else:
                   
                    t[i][j] = t[i-1][j]
                   
        return t[len(nums)][checksum]
