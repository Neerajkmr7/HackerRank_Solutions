import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int nS = scan.nextInt();
        int nQ = scan.nextInt();
        int lastAnswer = 0;
        int type,x,y,seq;
        ArrayList<Integer>[] seqList = new ArrayList[nS];
        for(int i=0;i<nQ;i++){
            type = scan.nextInt();
            switch(type){
                case 1:
                   seq =  (scan.nextInt()^lastAnswer) % nS;
                    if(seqList[seq] == null){
                      ArrayList<Integer> myList = new ArrayList<Integer>();
                        myList.add(scan.nextInt());
                        seqList[seq] = myList;
                    }else{
                       seqList[seq].add(scan.nextInt()) ;
                    }
                    break;
                case 2:
                     seq =  (scan.nextInt()^lastAnswer) % nS;
                    lastAnswer = seqList[seq].get((scan.nextInt()%seqList[seq].size()));
                    //System.out.println("xx--"+seqList[seq]);
                    System.out.println(lastAnswer);
                    break;
            }
        }
    }
}