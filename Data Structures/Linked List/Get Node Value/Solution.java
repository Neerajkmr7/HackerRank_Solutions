/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
Node runner = head;
    for(int i=0;i<n;i++){
        runner = runner.next;
    }
    Node node = head;
    while(runner.next != null){
        runner = runner.next;
        node = node.next;
    }
    return node.data;
}
