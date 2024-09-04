def find_anagrams_togather(lst):
    arr = [-1]*len(lst)
    arr[0] = 0
    
    
    for i in range(1,len(arr)):
        for j in range(len(arr)):
            if set(list(lst[i]))==set(list(lst[j])):
                arr[j] = i
                
    unique = list(set(arr))
    
    for k in unique:
        for i in range(len(lst)):
            if arr[i] == k:
                print(lst[i],end=" ")
        print()
                
        
    
find_anagrams_togather(['act','god','cat','dog','tac'])
    