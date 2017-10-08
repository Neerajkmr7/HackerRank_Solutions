//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneList = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneList.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            String res = "";
            if(phoneList.containsKey(s)){
                int result = phoneList.get(s); 
                 res = s+"="+result;
            }else{
               res = "Not found"; 
            }
            System.out.println(res);
        }
        in.close();
    }
}
