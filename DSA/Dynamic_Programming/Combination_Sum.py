from typing import List

class Solution:
    
    def _backtrack(self, arr, target, sumArr, combins, start):
        if sum(sumArr) == target:
            combins.append(sumArr)
            return
        if sum(sumArr)>target:
            return
        
        for i in range(start, len(arr)):
            self._backtrack(arr, target, sumArr + [arr[i]], combins, i)
                    
        
    
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        answer = []
        candidates = sorted(candidates)
        self._backtrack(candidates,target,[],answer,0)
        
        return answer
if __name__=="__main__":
    x = Solution()
    print(x.combinationSum([2,3,6,7],7))