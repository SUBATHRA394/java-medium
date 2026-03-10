class Solution(object):
    def swapPairs(self, head):
        # Dummy node points to the head to handle the start of the list easily
        dummy = ListNode(0)
        dummy.next = head
        current = dummy        
        # Ensure there are at least two nodes left to swap
        while current.next and current.next.next:
            first = current.next
            second = current.next.next            
            # The actual swap logic:
            # 1. Point 'current' to the second node
            # 2. Point 'first' to whatever comes after 'second'
            # 3. Point 'second' back to 'first'
            current.next = second
            first.next = second.next
            second.next = first            
            # Move 'current' two steps forward (to the end of the swapped pair)
            current = first            
        return dummy.next
