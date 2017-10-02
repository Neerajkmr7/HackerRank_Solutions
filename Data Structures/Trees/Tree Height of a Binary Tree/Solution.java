	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        if(root == null){
            return -1;
        }else{
            int leftDepth = height(root.left);
            int rightDepth = height(root.right);
            
            if(leftDepth > rightDepth){
                return leftDepth+1;
            }else{
                return rightDepth+1;
            }
        }
    }
