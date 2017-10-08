import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        if(expression.length() %2 !=0){
           return false;
        }else{
            Stack<Character> theStack = new Stack<Character>();
           // Queue<Character> queue = new PriorityQueue<Character>();
            
            for (int j = 0; j < expression.length(); j++) { 
            char ch = expression.charAt(j);
            switch (ch) {
            case '{':
            case '[':
            case '(':
                    theStack.push(ch);
                    break;
            case '}':
            case ']':
            case ')':
                    if (!theStack.isEmpty()) {
                        char stackContent = theStack.pop();
                        if ((ch == '}' && stackContent != '{') 
                                || (ch == ']' && stackContent != '[')
                                || (ch == ')' && stackContent != '(')){
                           // System.out.println("Mismatch found: " + ch + " at " + j);
                            return false;
                        }
                    } else {
                        //System.out.println("Mismatch found: " + ch + " at " + j);
                        return false;
                    }
                    break;
            default: break;
            }
        }
        if (!theStack.isEmpty()){
            //System.out.println("Error: missing right delimiter");
            return false;
        }
        }
        return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
