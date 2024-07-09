class Solution:
    def _perm(self,n,lst,target,combins):
        if sum(lst)==target:
            combins.append(lst)
        else:
            for i in range(len(n)):
                if sum(lst)+n[i]<=target:
                    self._perm(n[i:],lst+[n[i]],target,combins)
                    
                    
def combinationSum(nums, target):
    combins = []
    solution = Solution()
    solution._perm(nums, [], target, combins)
    return combins

if __name__=="__main__":
    nums = [2, 3, 6, 7]
    target = 7
    result = combinationSum(nums, target)
    print(result)