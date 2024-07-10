class Node:
    
    def __init__(self,s,d,w):
        self.src = s
        self.dest = d
        self.weight = w
    


if __name__=="__main__":
    V = 5
    # Adjacency List can be implemented using dictionary
    
    graph = dict()
    
    for i in range(V):
        graph[i] = []
    
    graph[0].append(Node(0,1,5))
    graph[1].append(Node(1,0,5))
    graph[1].append(Node(1,2,1))
    graph[1].append(Node(1,3,3))
    graph[2].append(Node(2,1,1))
    graph[2].append(Node(2,3,1))
    graph[2].append(Node(2,4,2))
    graph[3].append(Node(3,2,1))
    graph[3].append(Node(3,1,3))
    graph[4].append(Node(4,2,2))
    
    
    #To visit Vertex 2 Neighbours:
    
    for i in graph[2]:
        print(i.dest)
    