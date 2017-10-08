import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] charSet = new int[256];
        
        for(int i=0; i<first.length(); i++)
            charSet[first.charAt(i)]++;
        
        for(int i=0; i<second.length(); i++)
            charSet[second.charAt(i)]--;
        
        int numberNeeded = 0;
        for(int i=0; i<256; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        return numberNeeded;
     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}