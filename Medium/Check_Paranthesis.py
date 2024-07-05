
def chk_paranthesis(string):
    diff = 0
    for i in string:
        if (i=="("):
            diff+=1
        else:
            if diff==0:
                return False
            else:
                diff-=1
    
    return diff == 0

print(chk_paranthesis("((()))()"))
            