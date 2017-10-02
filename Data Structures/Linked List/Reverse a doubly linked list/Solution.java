/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head.next == null){
        return head;
    }else{
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
            
        }
        return prev;
    }
}
