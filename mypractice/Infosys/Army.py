from collections import deque

def min_moves_to_reduce_to_one(N):
    if N == 1:
        return 0

    
    queue = deque([(N, 0)])
    
    visited = set()
    visited.add(N)

    while queue:
        soldiers, moves = queue.popleft()

        
        next_states = [soldiers - 1]
        if soldiers % 2 == 0:
            next_states.append(soldiers // 2)
        if soldiers % 3 == 0:
            next_states.append(soldiers // 3)

        for next_soldiers in next_states:
            if next_soldiers == 1:
                return moves + 1
            if next_soldiers > 0 and next_soldiers not in visited:
                visited.add(next_soldiers)
                queue.append((next_soldiers, moves + 1))

    return -1  

if __name__ == "__main__":
    N = int(input())
    print(min_moves_to_reduce_to_one(N))
