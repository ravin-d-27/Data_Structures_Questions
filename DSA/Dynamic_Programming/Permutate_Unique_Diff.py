def permute(n,arr, comb, combins):
    if len(comb) == n:
        combins.append(tuple(comb))
        return
    
    for i in range(len(arr)):
        permute(n,arr[:i] + arr[i+1:], comb + [arr[i]], combins)

results = []
ans = []

permute(3, [1,1,2], [], results)
for i in set(results):
    ans.append(list(i))
    
print(ans)
