class Node:
    def __init__(self, val):
        self.val = val
        self.right = None
        self.left = None

class BST:
    def __init__(self):
        self.root = None
    
    def insert(self,x):
        if self.root is None:
            self.root = Node(x)
        else:
            self._insertVal(x, self.root)
    
    def _insertVal(self, x, root):
        if x<root.val:
            if root.left is None:
                root.left = Node(x)
            else:
                self._insertVal(x, root.left)
        else:
            if root.right is None:
                root.right = Node(x)
            else:
                self._insertVal(x, root.right)
                
    def display(self):
        arr = []
        if self.root is not None:
            self._display(self.root, arr)
        return arr
        
        
    def _display(self, root, arr):
        if (root is not None):
            self._display(root.left, arr)
            arr.append(root.val)
            self._display(root.right, arr)
            
    def isSymmetric(self):
        if not self.root:
            return True
        return self._isMirror(self.root.left, self.root.right)
    
    def _isMirror(self, t1, t2):
        if not t1 and not t2:
            return True
        if not t1 or not t2:
            return False
        
        return (t1.val!=None and t2.val!=None) and self._isMirror(t1.right, t2.left) and self._isMirror(t1.left, t2.right)

if __name__=="__main__":
    bst = BST()
    elements = [4, 2, 6, 1, 3, 5, 7]

    for elem in elements:
        bst.insert(elem)
    
    print("BST In-order Traversal:", bst.display())
    print("Is the BST symmetric?", bst.isSymmetric())
    