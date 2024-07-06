
def fact(n):
    ans = 1
    for i in range(n,1,-1):
        ans*=i
    return ans

def k_th_perm(n,k):
    perm = []
    unused = [i for i in range(1,n+1)]
    k-=1
    while n>0:
        part_length = fact(n)//n
        i = k//part_length
        perm.append(unused[i])
        unused.pop(i)
        n = n-1
        k = k%part_length
    
    return "".join(map(str,perm))


print(k_th_perm(4,15)) # length = 4, perm = 15
        
