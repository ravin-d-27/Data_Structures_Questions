def generate(n):
    
    def recurse(n, diff, comb, combins):
        if diff<0:
            return
        elif n==0:
            if diff==0:
                combins.append("".join(comb))
        else:
            comb.append('(')
            recurse(n-1, diff+1, comb, combins)
            comb.pop()
            comb.append(')')
            recurse(n-1, diff-1, comb, combins)
            comb.pop()
    
    combs = []
    recurse(2*n, 0, [], combs)
    
    return combs

print(generate(1))
print(generate(3))

# gas = [1,5,3,3,5,3,1,3,4,5]
# print(gas[3::]+gas[:3+1])