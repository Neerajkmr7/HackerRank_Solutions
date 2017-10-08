class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification,int[] testScores){
		super(firstName,lastName,identification);
        this.testScores = testScores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        char c = 'x';
        int Sum = 0;
        for(int x : testScores){
            Sum += x;
        }
        int Avg = Sum/testScores.length;
        if(Avg >= 90 && Avg <= 100){
          c = 'O';  
        }else if(Avg >= 80 && Avg < 90){
           c = 'E'; 
    }else if(Avg >= 70 && Avg < 80){
           c = 'A'; 
    }else if(Avg >= 55 && Avg < 70){
           c = 'P'; 
    }else if(Avg >= 40 && Avg < 55){
           c = 'D'; 
    }else if(Avg < 40){
          c = 'T';  
        }
        return c;
}
}