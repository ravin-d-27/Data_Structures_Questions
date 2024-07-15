
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        
class Solution(object):
    def BinaryTree(self, descriptions):
        """
        :type descriptions: List[List[int]]
        :rtype: Optional[TreeNode]
        """

        ans = set()
        nodes = dict()


        for parent, child, isLeft in descriptions:
            if parent not in nodes:
                nodes[parent] = TreeNode(parent)
            if child not in nodes:
                nodes[child] = TreeNode(child)
            
            if isLeft==1:
                nodes[parent].left = nodes[child]
            else:
                nodes[parent].right = nodes[child]

            ans.add(child)

        # Returning the Root of the tree

        root = None
        for parent, child, isLeft in descriptions:
            if parent not in ans:
                root = nodes[parent]

        return root
    
    def traverse(self,root):
        if root is None:
            return []
        return [root.val]+self.traverse(root.left)+self.traverse(root.right)
    
    def createBinaryTree(self, descriptions):
        root = self.BinaryTree(descriptions)

        ans = self.traverse(root)
        return ans
    
if __name__=="__main__":
	
	x = Solution()
	desc = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
	
	print(x.createBinaryTree(desc))
	
