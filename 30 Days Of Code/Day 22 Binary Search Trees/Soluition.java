	public static int getHeight(Node root){
      //Write your code here
        if(root == null){
            return -1;
        }else{
            int leftdepth = getHeight(root.left);
            int rigthdepth = getHeight(root.right);
            
            if(leftdepth > rigthdepth){
                return leftdepth+1;
            }else{
                return rigthdepth+1;
            }
        }
    }
