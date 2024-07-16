from typing import List

class Solution:
    
    def _permute(self,arr,lst,combins,used):
        if (len(lst)==len(arr)):
            combins.append(lst.copy())
            return
        
        for i in range(len(arr)):
            if used[i] or (i>0 and arr[i]==arr[i-1] and not used[i-1]):
                continue
            
            used[i] = True
            self._permute(arr,lst+[arr[i]],combins,used)
            used[i] = False
            
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        combins = []
        nums = sorted(nums)
        self._permute(nums,[],combins,[False]*(len(nums)))
        
        return combins
    
if __name__=="__main__":
    print(Solution().permuteUnique([1,1,2]))