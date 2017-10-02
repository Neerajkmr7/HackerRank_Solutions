import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        solve();
    }
    
    public static void solve() {
        int n = s.nextInt();
        int m = s.nextInt();
        Map<Integer, Long> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int k = s.nextInt();
            put(a, k, map);
            put(b+1, -k, map);
        }
        long max = 0;
        long curr = 0;
        for (Integer x : map.keySet()) {
            curr += map.get(x);
            if (max < curr) {
                max = curr;
            }
        }
        System.out.println(max);
    }
    
    public static void put(int x, int k, Map<Integer, Long> map) {
        if (!map.containsKey(x)) {
            map.put(x, (long) k);
        } else {
            map.put(x, map.get(x) + k);
        }
    }
    }

