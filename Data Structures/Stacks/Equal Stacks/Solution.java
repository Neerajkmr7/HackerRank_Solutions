import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        
        int sum1=getSum(h1);
        int sum2=getSum(h2);
        int sum3=getSum(h3);
        int i1=0;
        int i2=0;
        int i3=0;
        
        while(true){
            if(sum1>sum2 || sum1>sum3){
               sum1 = sum1 - h1[i1++];
            }else if(sum2>sum1 || sum2>sum3){
                 sum2 = sum2 - h2[i2++];;
            }else if(sum3>sum1 || sum3>sum2){
               sum3 = sum3 - h3[i3++];;  
            }else if(sum1 == 0 || sum2==0|| sum3==0){
                break;
            }else{
                break;
            }
        }
        System.out.println(sum1);
    }
    public static int getSum(int a[]){
        int sum=0;
        for(int z=0;z<a.length;z++){
            sum = sum+a[z];
        }
        return sum;
    }
}
