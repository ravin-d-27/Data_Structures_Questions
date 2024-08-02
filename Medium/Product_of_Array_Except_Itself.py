def findProd(arr):
    ans = 1
    for i in arr:
        ans*=i
    return ans

def Product_of_Array(arr):
    n = len(arr)
    newArr = []
    for i in range(n):
        x = arr.pop(i)
        newArr.append(findProd(arr))
        arr.insert(i, x)
    
    return newArr

if __name__=="__main__":
    print(Product_of_Array([10, 3, 5, 6, 2]))
        