/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(position == 0){
        head = head.next;
        return head;
    }else{
        Node current = head;
        for(int i=0; i< position-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

}

