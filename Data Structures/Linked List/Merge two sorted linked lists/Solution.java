/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    if(headA == null || headB == null){
        return (headA == null)? headB : headA;
    }
   
        Node head = null;
        if(headA.data < headB.data ){
           head = headA;
            headA = headA.next;
        }else{
            head = headB;
            headB = headB.next;
        }
    
          Node newList = head;
        while(headA !=null && headB != null){
            if(headA.data < headB.data){
               newList.next = headA;
                headA = headA.next;
            }else{
                newList.next = headB;
                headB = headB.next;
            }
            newList = newList.next;
        }
    
        if(headA == null){
          newList.next = headB;  
        }else{
            newList.next = headA;
        }
       return head;
   

}
