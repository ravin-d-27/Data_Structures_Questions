class Solution(object):
    def _perm(self, n, string, comb, combins):
        if len(comb)==n:
            combins.append(comb)
        if len(combins)>1:
            return combins
        else:
            for i in range(len(string)):
                self._perm(n,string[:i]+string[i+1:], comb+string[i], combins)
        return combins

    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        s = ""
        for i in nums:
            s+=str(i)
        x = self._perm(len(s), s, "", [])
        lst = []
        for i in x[-1]:
            lst.append(i)
        
        return lst
    
    def _chk(self, number, substrings):
        number_str = str(number)
        for i in number_str:
            if int(i) in substrings:
                pass
            else:
                return False
            
        for i in substrings:
            if str(i) in number_str:
                pass
            else:
                return False
            
        return True
    
    def nextPermEfficient(self, nums):
        
        ans = ""
        curr = ""
        
        for i in nums:
            curr+=str(i)
        
        x = sorted(nums)
        
        mini = ""
        for i in x:
            mini+=str(i)
            
        x.reverse()
        maxi = ""
        
        for i in x:
            maxi+=str(i)
            
            
        print(maxi, mini, curr)
            
        if (int(curr)==int(maxi)):
            ans = mini
        else:
            for i in range(int(curr)+1, int(maxi)+1):
                if (self._chk(i,nums)==True):
                    ans = str(i)
                    break
        
        lst = []
        for a in ans:
            lst.append(a)
            
        return lst
                    
            
        
if __name__=="__main__":
    nums = [1, 3, 2]
    solution = Solution()
    print(solution.nextPermEfficient(nums))