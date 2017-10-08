import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(getMaxGlass(arr));
    }
    //Code
    public static int getMaxGlass(int arr[][]){
        int currSum ;
        int maxSum = -10000;
        for(int x=0;x<4;x++){
            
            for(int y=0;y<4;y++){
                   currSum = 0;
                   currSum += arr[x][y]+ arr[x][y+1]+arr[x][y+2];
                   currSum += arr[x+1][y+1];
                   currSum += arr[x+2][y]+ arr[x+2][y+1]+arr[x+2][y+2];
              
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
        //
}
