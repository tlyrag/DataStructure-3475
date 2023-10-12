import java.util.Scanner;
public class SocialMediaApp {
	
	static Scanner input = new Scanner(System.in);
	static LList<Person> appList =  new LList<Person>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DisplayMainMenu();
	}
	
	
	
	/**
	 * @author tlyra
	 * 
	 * Display the main Menu and possible options
	 * Treat any incorrect entry 
	 * Call the proper method based on selected option
	 * 
	 * */
	public static void DisplayMainMenu() {
		LList<Integer> menuOptions = new LList<>();
		for(int i =1;i<=9;i++) {
			menuOptions.add(i);
		}
		System.out.println("***********************************");
		System.out.println("Please chose one of the options below");
		System.out.println("1. Add Person to the List");
		System.out.println("2. Add Person to a specific position");
		System.out.println("3. Remove a Person");
		System.out.println("4. Clear List");
		System.out.println("5. Retrieve List Information");
		System.out.println("6. Search Person by Name or by Email");
		System.out.println("7. Add or Remove a friend to friends list");
		System.out.println("8. Count the amount of people on the list");
		System.out.println("9. Check if the list is empty");
		System.out.println("10.Exit");
		System.out.println("***********************************");
		System.out.print("Enter Choice:");
		try {
			int choice =Integer.parseInt(input.nextLine()) ;
			
			if(!menuOptions.contains(choice)) {
				throw new Exception();
			} 
			
			switch (choice) {
			case 1:
				addPerson();
				break;
			case 2:
				addPersonInPosition();
				break;
			case 3:
				removePerson();
				break;
			case 4:
				clearAllList();
				break;
			case 5:
				//searchForPerson
				break;
			case 6:
				//Add friend to person List
				break;
			case 7:
				addPerson();
				break;
			case 8:
				countList();
				break;
			case 9:
				checkEmpty();
				break;
			case 10:
				System.out.println("Quitting Application");
				break;
			

			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid Menu Option");
			DisplayMainMenu();
		}
		
	}
	/**
	 * @author tlyra
	 * Prompt information about a person and add it to the list
	 * */
	public static void addPerson() {
		System.out.println("Please Enter Person Name:");
		String name = input.nextLine();
		System.out.println("Please Enter Person Email");
		String email = input.nextLine();
		System.out.println("Please Enter Person Location");
		String location = input.nextLine();
		//System.out.println("Do you want to add a Friend List to this person? Enter Y or N" );
		//String hasFriend = input.nextLine().toLowerCase();
		Person newPerson = new Person(name, email, location);
		
		appList.add(newPerson);
		
		
		System.out.println("***********************************");
		System.out.println(newPerson.name + " Added to the App List");
		System.out.println("***********************************");
		
		DisplayMainMenu();
	}
	
	/**
	 * @author tlyra
	 * 
	 * Get a valid position input to be used in add methods
	 * */
	public static int getInputListPosition() {
		System.out.println("Please Enter Position:");
		try {
			int position  = Integer.parseInt(input.nextLine());
			if(position>appList.getLength()) {
				throw new Exception("Position should be between " + 0 + " and " + (appList.getLength()-1));
			}
			return position;
		} catch (Exception e) {
			System.out.println("Please enter a valid Number");
			return getInputListPosition();
	
		}
	}
	
	public static void removePerson() {
		int position = getInputListPosition();
		System.out.println("***********************************");
		Person person = appList.getEntry(position);
		System.out.println(person.name+" was removed from the list");
		System.out.println("***********************************");
		appList.remove(position);
		DisplayMainMenu();
	}
	
	
	public static void clearAllList() {
		System.out.println("Are you sure you want to clear the list? Y/N");
		
		try {
			String answer = input.nextLine().toLowerCase();
			if(answer.equals("n")) {
				System.out.println("***********************************");
				System.out.println("List not Cleared");
				System.out.println("***********************************");
				DisplayMainMenu();
			} else if(answer.equals("y")) {
				appList.clear();
				System.out.println("***********************************");
				System.out.println("List Cleared");
				System.out.println("***********************************");
				DisplayMainMenu();
			} else {
				throw new Exception("Please enter Y or N");
			}
		} catch (Exception e) {
			clearAllList();
		}
		
		
		
	}
	public static void addPersonInPosition() {
	
		System.out.println("Please Enter Person Name:");
		String name = input.nextLine();
		System.out.println("Please Enter Person Email");
		String email = input.nextLine();
		System.out.println("Please Enter Person Location");
		String location = input.nextLine();
		int position = getInputListPosition();
		//System.out.println("Do you want to add a Friend List to this person? Enter Y or N" );
		//String hasFriend = input.nextLine().toLowerCase();
		Person newPerson = new Person(name, email, location);
		appList.add(position,newPerson);
		System.out.println("***********************************");
		System.out.println(newPerson.name + " Added to the App List at position " +position  );
		System.out.println("***********************************");
		
		DisplayMainMenu();
	}
	/**
	 * @author tlyra
	 * Return the number of People in the List
	 * */
	public static void countList() {
		int i =appList.getLength(); 
		System.out.println("***********************************");
		System.out.println("Number of people in the APP list is: " +i);
		System.out.println("***********************************");
		DisplayMainMenu();
		
	}
	/**
	 * @author tlyra
	 * Return the number of People in the List
	 * */
	public static void checkEmpty() {
		boolean isEmpty = appList.isEmpty(); 
		System.out.println("***********************************");
		if(isEmpty) {
			System.out.println("List is currently Empty");	
		} else {
			System.out.println("List is not Empty");
		}
		
		System.out.println("***********************************");
		DisplayMainMenu();
		
	}

}

