class Solution(object):
    def findMaxAverage(self, nums, k):
        curr = sum(nums[:k])
        maxi = curr

        for i in range(k,len(nums)):
            curr+=nums[i]-nums[i-k]

            if curr>maxi:
                maxi = curr

        return maxi/float(k)
            
             
        