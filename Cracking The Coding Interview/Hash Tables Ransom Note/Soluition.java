import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        String[] magArr = magazine.split(" ");
        String[] noteArr = note.split(" ");
        
        magazineMap = new HashMap<>();
        for(int i=0;i<magArr.length;i++){
            if(magazineMap.get(magArr[i]) != null){
                magazineMap.put(magArr[i],magazineMap.get(magArr[i])+1);
            }else{
                magazineMap.put(magArr[i],1);
            }
        }
       // getMapValueCount(magazineMap,magArr);
        noteMap = new HashMap<>();
        for(int i=0;i<noteArr.length;i++){
            if(noteMap.get(noteArr[i]) != null){
                noteMap.put(noteArr[i],noteMap.get(noteArr[i])+1);
            }else{
                noteMap.put(noteArr[i],1);
            }
        }
       // getMapValueCount(noteMap,noteArr);
    }
    
    public boolean solve() {
        Set<String> stringSet = noteMap.keySet();
        for(String s: stringSet){
            if(!(noteMap.get(s) <= magazineMap.get(s))){
                return false;
            }
        }
        return true;
    }
    public void getMapValueCount(Map<String, Integer> map,String[] str){
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
