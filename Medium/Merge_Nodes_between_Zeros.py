
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
class Solution(object):
    def mergeNodes(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        ans = []
        curr = head.next
        
        sums = head.val
        
        while curr!=None:
            if curr.val==0:
                sums+=curr.val
                ans.append(sums)
                sums = 0
            
            sums+=curr.val
            curr = curr.next
        
        
        ansNode = ListNode(ans[0])
        curr2 = ansNode
        
        for i in ans[1:]:
            curr2.next = ListNode(i)
            curr2 = curr2.next
            i+=1
        
        return ansNode
    
        
    

    
if __name__=="__main__":
    
    lst = [0,3,1,0,4,5,2,0]
    head = ListNode(0)
    node1 = ListNode(3)
    node2 = ListNode(1)
    node3 = ListNode(0)
    node4 = ListNode(4)
    node5 = ListNode(5)
    node6 = ListNode(2)
    node7 = ListNode(0)

    head.next = node1
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = None
    print(Solution().mergeNodes(head))