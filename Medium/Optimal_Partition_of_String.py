class Solution(object):
    
    
    def partitionString(self, s):
        
        # s = "abacaba"
        lst = []
        x = ""
        for i in range(len(s)):
            
            if s[i] in x:
                lst.append(x)
                x = ""
                x+=s[i]
            else:
                x+=s[i]
        lst.append(x)
        
        return len(lst)
    
if __name__=="__main__":
    s = Solution()
    print(s.partitionString("ssssss"))
    
            