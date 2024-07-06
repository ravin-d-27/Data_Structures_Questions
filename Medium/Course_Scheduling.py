
def dfs(graph, vertex, path, order, visited):
    path.add(vertex)
    for neighbor in graph[vertex]:
        if neighbor in path:
            return False
        if neighbor not in visited:
            visited.add(neighbor)
            if not dfs(graph, neighbor, path, order, visited):
                return False
    path.remove(vertex)
    order.append(vertex)
    
    return True

def course_schedule(n, prerequs):
    
    graph = [[] for i in range(n)]
    for pre in prerequs:
        graph[pre[1]].append(pre[0])
    
    
    visited = set()
    path = set()
    
    order = []
    
    for course in range(n):
        if course not in visited:
            visited.add(course)
            if not dfs(graph, course, path, order, visited):
                return False
        
    return True

n = 4
prerequisites = [[1, 0], [2, 1], [3, 2]]
print(course_schedule(n, prerequisites))  # Output: True