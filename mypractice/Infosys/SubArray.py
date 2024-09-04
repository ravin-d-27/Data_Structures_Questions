def count_good_subarrays(N, K, A):
    MOD = 10**9 + 7
    good_subarrays_count = 0

    # Iterate over all possible starting points of the subarray
    for start in range(N):
        frequency = {}
        # Iterate over all possible ending points of the subarray
        for end in range(start, N):
            element = A[end]
            # Update the frequency of the current element
            if element in frequency:
                frequency[element] += 1
            else:
                frequency[element] = 1

            # Check if the current subarray is good
            good = True
            for key in frequency:
                if frequency[key] != 0 and frequency[key] != K:
                    good = False
                    break

            if good:
                good_subarrays_count = (good_subarrays_count + 1) % MOD

    return good_subarrays_count

# Input reading with validation
N = int(input("Enter N (length of array): "))
K = int(input("Enter K (frequency to check for): "))
A = list(map(int, input(f"Enter {N} integers separated by space: ").split()))

# Validate the length of the array
if len(A) != N:
    print(f"Error: The number of elements provided ({len(A)}) does not match N ({N}).")
else:
    # Function call and result output
    result = count_good_subarrays(N, K, A)
    print(result)