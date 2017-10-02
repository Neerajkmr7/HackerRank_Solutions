/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
   printLefts(root.left);
   System.out.print(root.data+" ");
   printRights(root.right);
}
void printLefts(Node root){
    if(root.left != null){
        printLefts(root.left);
    }
    System.out.print(root.data+" ");
}

void printRights(Node root){
    System.out.print(root.data+" ");
    if(root.right != null){
        printRights(root.right);
    }
   
}