	static void levelOrder(Node root){
      //Write your code here
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = queue.remove();
            System.out.print(n.data+" ");
            if(n.left != null){
               queue.add(n.left); 
            }
            if(n.right != null){
               queue.add(n.right); 
            }
        }
      
      
    }