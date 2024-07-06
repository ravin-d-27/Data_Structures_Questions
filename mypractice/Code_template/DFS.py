def dfs(graph, start, visited=None):
    if visited is None:
        visited = set()
    
    visited.append(start)
    
    for neighbor, is_connected in enumerate(graph[start]):
        if is_connected and neighbor not in visited:
            dfs(graph, neighbor, visited)


graph = [
    [0, 1, 1, 0],
    [0, 0, 1, 0],
    [1, 0, 0, 1],
    [0, 0, 0, 1]
]

visited_nodes = dfs(graph, 0)
print("Visited nodes:", visited_nodes)
