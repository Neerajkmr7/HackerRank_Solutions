import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            String s = scan.next();
            if(map.get(s) != null){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1); 
            }
        }
        int q = scan.nextInt();
        for(int x=0;x<q;x++){
            String s = scan.next();
          if(map.get(s) != null){
              System.out.println(map.get(s));
        }else{
              System.out.println("0");
          }
    }
}
}