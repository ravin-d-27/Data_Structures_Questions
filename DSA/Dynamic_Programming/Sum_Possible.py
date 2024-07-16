def sum_possible_recurse(arr, target, s, used):
    if s == target:
        return True
    else:
        for i in range(len(arr)):
            if arr[i] not in used:
                used.add(arr[i])
                if sum_possible_recurse(arr, target, s + arr[i], used):
                    return True
                used.remove(arr[i])
    return False

print(sum_possible_recurse([1, 2, 3, 4], 9, 0, set()))