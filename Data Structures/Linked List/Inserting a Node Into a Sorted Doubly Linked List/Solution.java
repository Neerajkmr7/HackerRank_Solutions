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

Node SortedInsert(Node head,int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;
    node.prev = null;
    
    
    if(head == null){
        return node;
    }else if(data <head.data){
        node.next = head;
        head.prev = node;
        return node;
    }else{
        Node current = head;
        Node prev = null;
       while(current != null && data > current.data){
        prev = current;
        current = current.next;
    }
        if(current == null){
            prev.next = node;
            node.prev = prev; 
        }else{
            prev.next = node;
            current.prev = node;
            node.next = current;
           node.prev = prev;
        }
    }
    
  return head;
}
