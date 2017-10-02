/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
boolean hasCycle = false;

    if (head == null || head.next == null){
        hasCycle = false;
    }
    
    Node slow = head;
    Node fast = head;
    
    while(slow != null && fast != null){
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            hasCycle = true;
            break;
        }
    }
    
    return hasCycle;
} 

