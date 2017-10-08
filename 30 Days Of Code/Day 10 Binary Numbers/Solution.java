import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
        public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        
    String binaryString = "";
    int max = 0, consecOnes = 0;
        
    while (n > 0) {
        int remainder = n % 2;
        n = n / 2;
           
        if (remainder == 1) {
            consecOnes++;
        } else {
            consecOnes = 0;
        }
         
        if (consecOnes > max) {
            max = consecOnes;
        }
    }
        
    System.out.println(max);
}
    
   
}
