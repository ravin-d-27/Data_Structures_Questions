from typing import List
import heapq
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:

        sorted_scores = sorted([(s, i) for i, s in enumerate(score)], reverse=True, key=lambda x: x[0])
        ans = [""] * len(score)
        
        for rank, (s, i) in enumerate(sorted_scores):
            if rank == 0:
                ans[i] = "Gold Medal"
            elif rank == 1:
                ans[i] = "Silver Medal"
            elif rank == 2:
                ans[i] = "Bronze Medal"
            else:
                ans[i] = str(rank + 1)
        
        return ans
if __name__=="__main__":
    x = Solution()
    print(x.findRelativeRanks([5,4,3,2,1]))
    print(x.findRelativeRanks([10,3,8,9,4]))
    
