class Solution(object):
    
    def _gcd(self,a,b):
        while b!=0:
            a,b= b,a%b
        return a
    
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        
        if (str1+str2!=str2+str1):
            return ""
        
        gcd = self._gcd(len(str1),len(str2))
        return str1[:gcd]

        
    
if __name__=="__main__":
    print(Solution().gcdOfStrings("ABABAB","ABAB"))
                
            