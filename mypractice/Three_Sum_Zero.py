def threeSumTriplets(arr):
    arr_sorted = sorted(arr)
    for i in range(0,len(arr)-2):
        l = i+1
        r = len(arr)-1
        
        while (l<r):
            val = -arr_sorted[i]
            if (arr_sorted[l]+arr_sorted[r])>val:
                r-=1
            elif (arr_sorted[l]+arr_sorted[r])<val:
                l+=1
            else:
                print([arr_sorted[i],arr_sorted[l],arr_sorted[r]])
                l+=1
                r-=1



if __name__=="__main__":
    arr=[0,-2,7,2,4,-6]
    threeSumTriplets(arr)