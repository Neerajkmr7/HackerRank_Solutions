	// Add your code here
public Difference(int[] arr){
    this.elements = arr;
}
public void computeDifference(){
  int min = elements[0];
    int max = elements[0];
for(int x: elements){
   min = Math.min(min,x);
    max = Math.max(max,x);
}
maximumDifference = max-min;
}
