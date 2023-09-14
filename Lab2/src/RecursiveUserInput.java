import java.util.Scanner;

public class RecursiveUserInput {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = getUserInput();
		System.out.println("User entered "+ userInput);
	}
	
	public static int getUserInput() {
		try {
			System.out.println("Please enter an integer between 0 and 10");
			int userInput = Integer.parseInt(input.nextLine());
			if(userInput>10 || userInput<0) {
				System.out.println("User Input must be between 0 and 10");
				return getUserInput();
			}
			return userInput;
		} catch(Exception err) {
			System.out.println("User input must be an Integer");
			return getUserInput();
		}
	}
	

}
