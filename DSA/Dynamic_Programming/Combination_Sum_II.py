
from typing import List

class Solution:
    
    
    def _backtracking(self,arr,target,sumArr,combins,start):
        if target==0:
            combins.append(sumArr)
        elif target<0:
            return 
        for i in range(start,len(arr)):
            if i > start and arr[i] == arr[i - 1]:
                continue
            self._backtracking(arr,target-arr[i],sumArr+[arr[i]],combins,i+1)
        
    
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        combins = []
        candidates = sorted(candidates)
        self._backtracking(candidates,target,[],combins,0)
        
        return combins
if __name__=="__main__":
    print(Solution().combinationSum2([10,1,2,7,6,1,5],8))