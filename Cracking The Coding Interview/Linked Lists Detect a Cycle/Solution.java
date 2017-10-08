/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<Node> st = new HashSet<>();
    Node current = head;
    boolean result = false;
    while(current != null){
        if(!st.contains(current)){
            st.add(current);
        }
        else{
            result = true;
            break;
        }
        current = current.next;
    }

    return result;
}
