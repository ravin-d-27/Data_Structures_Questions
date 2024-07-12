class Node:
    
    def __init__(self,s,d,w):
        self.src = s
        self.dest = d
        self.weight = w
        
class Graph:
    
    def __init__(self,V) -> None:
        self.graph = dict()
        for i in range(V):
            self.graph[i] = []
            
    def insert(self, src, dest, weight):
        self.graph[src].append(Node(src,dest,weight))
        
        
    def floydWarshall(self):
        V = len(self.graph)
        dist = [[float('inf')] * V for _ in range(V)]
        
        for i in range(V):
            for node in self.graph[i]:
                dist[node.src][node.dest] = node.weight
        
        for k in range(V):
            for i in range(V):
                for j in range(V):
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
        
        return dist
    
if __name__ == "__main__":
    # Create a graph
    graph = Graph(4)
        
        # Insert edges
    graph.insert(0, 1, 5)
    graph.insert(0, 3, 10)
    graph.insert(1, 2, 3)
    graph.insert(2, 3, 1)
        
    # Run Floyd-Warshall algorithm
    result = graph.floydWarshall()
        
    # Print the distance matrix
    for row in result:
        print(row)