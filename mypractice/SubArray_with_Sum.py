
def findSubarray(arr,target):
    
    start = 0
    end = 1
    
    for i in range(len(arr)):
        if (sum(arr[start:end])<target):
            end+=1
        elif(sum(arr[start:end])>target):
            start+=1
        else:
            print(arr[start:end])
            break
    


if __name__=="__main__":
    arr = [10,3,5,8,6,12,20,15,31]
    target = 31
    
    findSubarray(arr,target)