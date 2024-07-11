class Node:
    def __init__(self, src, dst, weight) -> None:
        self.src = src
        self.dest = dst
        self.weight = weight
    
    
class Graph:
    def __init__(self,V) -> None:
        self.graph = dict()
        for i in range(V):
            self.graph[i] = []
            
    def insert(self, src, dest, weight):
        self.graph[src].append(Node(src,dest,weight))
    
    def hasPath(self,src,dest,visited):
        if src == dest:
            return True
        visited[src] = True
        for i in self.graph[src]:
            if (not visited[i.dest] and self.hasPath(i.dest,dest,visited)):
                return True
        return False
    
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
    
    
    print(grph.hasPath(0, 4, [False] * V))