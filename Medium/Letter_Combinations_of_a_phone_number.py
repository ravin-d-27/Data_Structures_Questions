class Solution(object):
    def _backtrack(self,n,string,curr,combins, d):
        if (len(curr)==len(string)):
            combins.append(curr)
            return
        else:
            for i in d[string[n]]:
                self._backtrack(n+1,string,curr+i,combins,d)

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        results = []
        d = {'2':'abc', '3':'def','4':'ghi','5':'jkl','6':'mno','7':'pqrs','8':'tuv','9':'wxyz'}
        if digits=="":
            return []
        else:
            self._backtrack(0,digits,"",results,d)
        
        return results
        
        