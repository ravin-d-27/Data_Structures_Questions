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
        
        
    def visitNeighbours(self, neighbor):
        for i in self.graph[neighbor]:
            print(i.dest)
        
    def DFS(self, start):
        visited = set()
        stack = [start]
        
        while stack:
            vertex = stack.pop()
            if vertex not in visited:
                visited.add(vertex)
                print(vertex)
                
                for x in self.graph[vertex]:
                    stack.append(x.dest)

if __name__=="__main__":
    V = 5
    
    grph = Graph(V)
    
    grph.insert(0,1,5)
    grph.insert(1,0,5)
    grph.insert(1,2,1)
    grph.insert(1,3,3)
    grph.insert(2,1,1)
    grph.insert(2,3,1)
    grph.insert(2,4,2)
    grph.insert(3,2,1)
    grph.insert(3,1,3)
    grph.insert(4,2,2)
    
    grph.visitNeighbours(2)

    print("\nDFS Traversal")
    grph.DFS(0)