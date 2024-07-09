
def backtrack(n,str,curr, combins):
    if len(curr)==n:
        combins.append(curr)
        return
    else:
        for i in range(len(str)):
            backtrack(n,str[:i]+str[i+1:],curr+str[i],combins)
            

res = []
backtrack(3,"123","",res)
print(res)    

    