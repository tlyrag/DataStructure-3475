package thiagoA2_3475_002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PriorityApp {
	static Scanner input = new Scanner(System.in);
	static MaxHeap<assignment> priorityQueue = new MaxHeap<>();
	static ArrayList<Integer> menuOptions = new ArrayList<>();
	public static void main(String[] args) {
		
		displayMenuOptions();
		
	}
	/**
	 * @author tlyra
	 * @param Propts a menu with user options,
	 * if an invalid option is selected triggers an error and recall the method 
	 * 
	 */
	public static void displayMenuOptions() {

		for(int i =1;i<=5;i++) {
			menuOptions.add(i);
		}
		
		System.out.println("***********************************");
		System.out.println("Please chose one of the options below");
		System.out.println("1. Add Course");
		System.out.println("2. Remove Course");
		System.out.println("3. View Courses");
		System.out.println("4. View Course with highest priority");
		System.out.println("5. Exit");
		System.out.println("***********************************");
		System.out.print("Enter Choice:");
		
		/// ------Treating User Choice-----
		try {
			int choice =Integer.parseInt(input.nextLine()) ;
					
			if(!menuOptions.contains(choice)) {
				throw new Exception();
				/// ------If user Choice Is OK Call the Method-----
			}  else {
					switch (choice) {
						case 1:
							AddCourse();
							displayMenuOptions();
							break;
						case 2:
							removeCourse();
							break;
						case 3:
						priorityQueue.displayHeap();
						displayMenuOptions();
							break;
						case 4:
						System.out.println(priorityQueue.getMax());
						displayMenuOptions();
							break;
						case 5:
							System.out.println("Quitting Application");
							break;

						default:
							break;
						}
				}
					
		} catch (Exception e) {
			System.out.println("Invalid Menu Option");
			displayMenuOptions();
		}
	}
	/**
	 * @author tlyra
	 * @param Prompts user information, create assignment object and add it to the heap
	 * 
	 */
	
	public static void AddCourse() {
		try {
			System.out.println("Enter course name: ");
	        String course = input.nextLine();
	
	        System.out.println("Enter assignment task: ");
	        String task = input.nextLine();
	
	        System.out.println("Enter due date (dd/mm/yyyy): ");
	        String dateString = input.nextLine();
	        Date dueDate =  new SimpleDateFormat("dd/mm/yyyy").parse(dateString);
	        assignment newAssignment = new assignment(course, task, dueDate);
	        priorityQueue.add(newAssignment);
	        
	        System.out.println("Do you want to add another assignment? (yes/no)");
            String answer = input.nextLine().toLowerCase();
            
            while(!answer.equals("yes")  && !answer.equals("no")) {
            	 System.out.println("Please answer yes or no.");
                 answer = input.nextLine();
            }
            
            if(answer.equals("yes")) {
            	AddCourse();
            } else {
            	return;
            }
            
		} catch (ParseException e) {
			System.out.println("Invalid Date format, please enter data again");
			AddCourse();
			return;
		}
	}
	
	/**
	 * @author tlyra
	 * @param Removes the course with the lowest due date from the MaxHeap
	 * 
	 */
	public static void removeCourse() {
		System.out.println("This is the course with the earliest Due Date: ");
        System.out.println(priorityQueue.getMax());

        System.out.println("Do you want to Remove this Course ? (yes/no)");
        String answer = input.nextLine().toLowerCase();
        
        while(!answer.equals("yes")  && !answer.equals("no")) {
        	 System.out.println("Please answer yes or no.");
             answer = input.nextLine();
        }
        
        if(answer.equals("yes")) {
        	priorityQueue.removeMax();
        	System.out.print("Course Removed");
        	displayMenuOptions();
        } else {
        	displayMenuOptions();
        }
	}
}
