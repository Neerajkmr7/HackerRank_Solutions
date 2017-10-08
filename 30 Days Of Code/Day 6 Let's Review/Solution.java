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
        for(int i = 0; i<n;i++){
          String input=  scan.next();
          printStringEvenOdd(input); 
        }
    }
    public static void printStringEvenOdd(String input){
        StringBuilder stringeven = new StringBuilder();
        StringBuilder stringodd = new StringBuilder();
        for(int x=0;x<input.length();x++){
           if(x%2==0){
             stringeven = stringeven.append(input.charAt(x));   
           }else{
             stringodd = stringodd.append(input.charAt(x));   
           }
        }
        System.out.println(stringeven+" "+stringodd);
    }
}