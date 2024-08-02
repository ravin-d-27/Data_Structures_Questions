class Solution(object):
    def longestOnes(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        max_ones = 0
        curr_ones = 0
        
        for i in nums:
            if i==1:
                curr_ones+=1
        
        max_ones = curr_ones
        
        for i in range(k,len(nums)):
            if nums[i]==1:
                curr_ones+=1
            if nums[i-k]==1:
                curr_ones-=1
            
            max_ones = max(curr_ones,max_ones)
            
        return max_ones
    

if __name__=='__main__':
    print(Solution().longestOnes([1,1,1,0,0,0,1,1,1,1,0],2))