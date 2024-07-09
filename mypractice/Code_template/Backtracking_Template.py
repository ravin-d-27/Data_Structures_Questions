
def backtrack(n,str,curr, combins):
    if len(curr)==n:
        combins.append(curr)
        return
    else:
        for i in range(len(str)):
            backtrack(n,str[:i]+str[i+1:],curr+str[i],combins)

class Solution: #This is for Combination Sum
    def _perm(self,n,lst,target,combins):
        if sum(lst)==target:
            combins.append(lst)
        else:
            for i in range(len(n)):
                if sum(lst)+n[i]<=target:
                    self._perm(n[i:],lst+[n[i]],target,combins)
                    
                     

res = []
backtrack(3,"123","",res)
print(res)    

    