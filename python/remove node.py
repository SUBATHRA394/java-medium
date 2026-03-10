class Solution(object):
    def removeNthFromEnd(self, head, n):
        # Dummy node handles the edge case of removing the head node
        dummy = ListNode(0, head)
        fast = slow = dummy  
        # Move fast pointer n steps ahead
        for _ in range(n):
            fast = fast.next      
        # Move both until fast reaches the last node
        while fast.next:
            fast = fast.next
            slow = slow.next     
        # Skip the nth node
        slow.next = slow.next.next  
        return dummy.next
