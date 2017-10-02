import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0; i<n; i++){
            int query = scan.nextInt();
            switch(query){
                case 1:
                    int num = scan.nextInt();
                    stack.push(num);
                    if(maxStack.isEmpty() || maxStack.peek() <= num){
                    maxStack.push(num);
                    }
                    break;
                case 2:
                int rem = stack.pop();
                    if(rem == maxStack.peek()){
                      maxStack.pop();  
                    }
                    //stack.pop();
                    break;
                case 3:
                System.out.println(maxStack.peek());
                    break;
                default:
                break;
            }
            
        }
        scan.close();
    }
}