class Node:
    
    def __init__(self, data):
        self.data = data
        self.right = None
        self.left = None
    

class BinarySearchTree:
    
    def __init__(self):        
        self.root = None
    
    def insert(self,x):
        if self.root is None:
            self.root = Node(x)
        else:
            self._insertNode(x,self.root)
    
    def _insertNode(self,x,root):
        if x<root.data:
            if root.left is None:
                root.left = Node(x)
            else:
                self._insertNode(x,root.left)
        else:
            if root.right is None:
                root.right = Node(x)        
            else:
                self._insertNode(x,root.right)
                
    def display(self):
        if self.root is None:
            return
        else:
            self._display(self.root)
            
    def _display(self,root):
        if root is not None:
            self._display(root.right)
            print(root.data)
            self._display(root.left)
    
                
                
                