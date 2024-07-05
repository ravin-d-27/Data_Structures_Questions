def first_and_last(arr, target):
    ans = []
    
    if arr==[target]*len(arr):
        return [0,len(arr)-1]
    
    for i in range(len(arr)):
        if arr[i]==target:
            ans.append(i)
            while i+1<len(arr) and arr[i+1]==target:
                i+=1
            ans.append(i)
            return ans
    
    
    return [-1,-1]

print(first_and_last([2,5,5,5,5,5,5,5,5,5], 5))
            