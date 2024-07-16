def fibo_rec(num, mem):
    if num == 0:
        return 0
    elif num == 1:
        return 1
    elif mem[num] is not None:
        return mem[num]
    else:
        val = fibo_rec(num - 1, mem) + fibo_rec(num - 2, mem)
        mem[num] = val
        return val

num=6
mem = [None] * (num + 1)  
print(fibo_rec(num, mem))

