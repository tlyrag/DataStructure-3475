import java.util.Scanner;
public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws ScoreException {
		// TODO Auto-generated method stub
	
		int[] studId = {1,2,3,4,5};
		int[] studGrades = new int[studId.length];
		studGrades= addStudGrades(studId);
		displayGrades(studId, studGrades);
	}
	
	public static int getUserInput() throws ScoreException{
		
		try {
			System.out.println("Please enter a student grade");
			int userInput = Integer.parseInt(input.nextLine());
			
			if(userInput>=100) {
				throw(new ScoreException());
			}
			return userInput;
		} catch(ScoreException err){
			System.out.println("Error: "+ err.getMessage());
			return 0;
		}
	} 
	public static int[] addStudGrades(int[] studId) throws ScoreException {
		int[] studGrades = new int[studId.length];
		
		for(int i =0;i<studId.length;i++) {
			studGrades[i] = getUserInput();
		}
		
		return studGrades;
	}
	public static void displayGrades(int[] studID, int[] StudGrades) {
		for (int i =0;i<studID.length;i++) {
			System.out.println("Student ID " + studID[i] +" Student Grade: " + StudGrades[i]);
		}
	}
}
