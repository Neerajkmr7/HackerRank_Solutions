import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num;
        for(int i=0;i<n;i++){
            num = scan.nextInt();
            if(num == 1){
                System.out.println("Not prime"); 
            }else{
               isPrime(num); 
            }
            
        }
        scan.close();
    }
    public static void isPrime(int num){
        for(int x=2;x<=num/2;x++){
           if(num % x == 0){
               System.out.println("Not prime");
               return;
           } 
        }
       System.out.println("Prime"); 
    }
}
