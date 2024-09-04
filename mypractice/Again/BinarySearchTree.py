class Node:
    
    def __init__(self, data):
        self.data = data
        self.right = None
        self.left = None
        
class BinarySearchTree:
    
    def __init__(self):
        self.root = None
        
    
    def insert(self,data):
        if self.root is None:
            self.root = Node(data)
        else:
            self._insert(data, self.root)
    
    def _insert(self, data, root):
        if data<root.data:
            if root.left is None:
                root.left = Node(data)
            else:
                self._insert(data, root.left)
        else:
            if root.right is None:
                root.right = Node(data)
            else:
                self._insert(data, root.right)
    
    def display(self):
        arr = []
        if self.root is not None:
            self._display(self.root, arr)
        
        return arr
    
    def _display(self, root, arr):
        if root is None:
            return
        self._display(root.left, arr)
        arr.append(root.data)
        self._display(root.right, arr)
        
    def symmetric(self):
        if not self.root:
            return True
        return self._ismirror(self.root.left, self.root.right)
    
    def _ismirror(self,tree1,tree2):
        if not tree1 and not tree2:
            return True
        if not tree1 or not tree2:
            return False

        return (tree1.data!=None and tree2.data!=None) and self._ismirror(tree1.right, tree2.left) and self._ismirror(tree1.left, tree2.right)
    

if __name__=="__main__":
    
    tree = BinarySearchTree()
    tree.insert(10)
    tree.insert(30)
    tree.insert(20)
    tree.insert(50)
    tree.insert(40)
    tree.insert(70)
    tree.insert(60)
    
    print(tree.display())
    
    print(tree.symmetric())
            
            
            