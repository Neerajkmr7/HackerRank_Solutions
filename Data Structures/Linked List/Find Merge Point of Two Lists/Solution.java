/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    Set<Node> nodes = new HashSet<Node>();

    while (headA != null) {
      nodes.add(headA);
      headA = headA.next;
    }

    while (headB != null) {
      if (nodes.contains(headB))
        return headB.data;
      headB = headB.next;
    }

    return -1;
}
