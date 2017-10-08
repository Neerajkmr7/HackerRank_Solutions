public class Solution {
    // Write your code here.
    Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack<Character>();
    
    public void pushCharacter(Character c){
       stack.push(c); 
    }
    
    public void enqueueCharacter(Character c){
       queue.add(c);
    }
    
    public Character popCharacter(){
        return stack.pop();
    }
    
    public Character dequeueCharacter(){
        return queue.poll();
    }