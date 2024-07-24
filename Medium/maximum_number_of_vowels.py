class Solution(object):

    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        vowels = {'a', 'e', 'i', 'o', 'u'}
        max_vowels = 0
        current_vowels = 0
        
        for i in range(k):
            if s[i] in vowels:
                current_vowels += 1
        max_vowels = current_vowels
    
        for i in range(k, len(s)):
            if s[i] in vowels:
                current_vowels += 1
            if s[i - k] in vowels:
                current_vowels -= 1
            max_vowels = max(max_vowels, current_vowels)
        
        return max_vowels

if __name__=="__main__":
    print(Solution().maxVowels("weallloveyou",7))
        
        