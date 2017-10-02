import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        in.close();
        //One method
        for(int x=d;x<a.length;x++){
            System.out.print(a[x]+" ");
        }
        for(int x=0;x<d;x++){
            System.out.print(a[x]+" ");
        }
		
		//the other method
		/*for(int x=0;x<n;x++){
            System.out.print(a[(d+x)%n]+" ");
        }*/

        
    }
}
