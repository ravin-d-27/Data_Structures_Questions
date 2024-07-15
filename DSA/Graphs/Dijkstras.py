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
        
    
    