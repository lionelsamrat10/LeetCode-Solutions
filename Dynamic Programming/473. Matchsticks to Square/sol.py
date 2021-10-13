class Solution:
    def makesquare(self, nums: List[int]) -> bool:
        
        self.sums = [0]*4
        
        if sum(nums)%4 != 0 or len(nums) == 0:
            return False
        
        self.possible = sum(nums)/4
        
        nums.sort()
        
        return self.dfs(nums,len(nums))
    
    def dfs(self,nums,n):
        
        if n == 1:
            
            return self.sums[0] == self.sums[1] == self.sums[2] == self.possible
        
        for i in range(4):
            
            if self.sums[i] + nums[n-1] <= self.possible:
                
                self.sums[i] += nums[n-1]
                if self.dfs(nums,n-1):
                    return True
                self.sums[i] -= nums[n-1]
                
        return False
                
        
