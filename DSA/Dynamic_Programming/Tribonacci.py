def tribo_recurse(num,mem):
    if num==0:
        return 0
    elif num==1 or num==2:
        return 1
    elif mem[num] is not None:
        return mem[num]
    else:
        val =  tribo_recurse(num-1,mem)+tribo_recurse(num-2,mem)+tribo_recurse(num-3,mem)
        mem[num] = val
        return val

num = 7
print(tribo_recurse(num,[None]*(num+1)))