def backtrack(n,string,comb,combins):
    if len(comb)==n:
        combins.append(comb)
    else:
        for i in range(len(string)):
            backtrack(n,string[:i]+string[i+1:],comb+string[i], combins)
            
combins = []
backtrack(3,"123","",combins)
print(combins)