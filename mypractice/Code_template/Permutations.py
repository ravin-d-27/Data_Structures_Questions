

def perm(n,str, comb, combins):
    if len(comb)==n:
        combins.append(comb)
    else:
        for i in range(len(str)):
            perm(n, str[:i]+str[i+1:], comb+str[i], combins)
    return combins   


print(perm(3,"123","", []))