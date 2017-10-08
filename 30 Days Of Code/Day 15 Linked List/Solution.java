    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
    }
