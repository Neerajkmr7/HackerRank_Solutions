 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
   
    Node newNode = new Node();
    newNode.data = value;
    if(root == null){
         return newNode;
    }else{
   if(value<= root.data){
     root.left=Insert(root.left,value);  
   } 
   else{
    root.right=Insert(root.right,value);   
   } 
   return root;
   
}
}

