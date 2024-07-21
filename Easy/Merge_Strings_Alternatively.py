class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        
        i = 0
        j = 0
        
        new = ""

        while (i<len(word1) and j<len(word2)):
            new+=word1[i]+word2[j]
            i+=1
            j+=1
        
        new+=word1[i:]+word2[j:]
        return new
    
if __name__=="__main__":
    print(Solution().mergeAlternately("ab","pqrs"))