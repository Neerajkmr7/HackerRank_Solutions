import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyQueue<Integer> q = new MyQueue<>();
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            switch(type){
                case 1:
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.deque();
                    break;
                case 3:
                    System.out.println(q.peek());
                    break;
                    
            }
        }
    }
    
   
}


 class MyQueue<T> {
        Stack<Integer> s1,s2;
        
        public MyQueue(){
            s1 = new Stack<Integer>();
            s2 = new Stack<Integer>();
        }
        
        public void enqueue(int x){
            s1.push(x);
        }
        
        public int peek(){
            if(!s2.isEmpty()){
                return s2.peek();
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
        
        public int deque(){
            if(!s2.isEmpty()){
                return s2.pop();
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }