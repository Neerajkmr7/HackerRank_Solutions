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
        int type = 0;
        int k=0;
        String prev = "";
        Stack<String> stack = new Stack<>();
        stack.push("");
        for(int i=0;i<n;i++){
            type = scan.nextInt();
            switch(type){
                case 1:
                   prev = stack.peek(); 
                    stack.push(prev+scan.next());
                   break;
                case 2:
                    prev = stack.peek();
                    k = scan.nextInt();
                    stack.push(prev.substring(0,prev.length()-k));
                   break;
                case 3:
                   prev = stack.peek();
                    k = scan.nextInt(); 
                    System.out.println(prev.charAt(k-1));
                    break;
                case 4:
                    stack.pop();
                    break;
            }
        }
    }
}