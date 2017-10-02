/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
     boolean checkBST(Node root){
	
	return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

}

/* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
	  
public boolean isBSTUtil(Node root, int min, int max){

/* an empty tree is BST */
	if(root == null){
		return true;
	}
	
	/* false if this node violates the min/max constraints */
	if(root.data <= min || root.data >= max){
		return false;
	}
	
	 /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
	return(isBSTUtil(root.left,min,root.data) && isBSTUtil(root.right,root.data,max));

}
