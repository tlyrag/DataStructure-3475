import java.util.Scanner;
public class SocialMediaApp {
	
	static Scanner input = new Scanner(System.in);
	static LList<Person> appList =  new LList<Person>();
	static LList<String> appNameList =  new LList<String>();
	static LList<String> appEmailList =  new LList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DisplayMainMenu();
	}
	
	
	
	/**
	 * @author tlyra
	 * @param 
	 * 
	 * Display the main Menu and possible options
	 * Treat any incorrect entry that isn't between 1 or 10
	 * Call the proper method based on selected option
	 * 
	 * */
	public static void DisplayMainMenu() {
		/// ------Creating the Enumerator of options using Linked List-----
		LList<Integer> menuOptions = new LList<>();
		for(int i =1;i<=10;i++) {
			menuOptions.add(i);
		}
		
		/// ------Printing The Main Menu-----
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
		
		/// ------Treating User Choice-----
		try {
			int choice =Integer.parseInt(input.nextLine()) ;
			
			if(!menuOptions.contains(choice)) {
				throw new Exception();
		/// ------If user Choice Is OK Call the Method-----
			}  else {
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
					displayList();
					break;
				case 6:
					searchForPerson();
					DisplayMainMenu();

					break;
				case 7:
					addOrRemoveFriend();
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
			}
			
		///----- Recursion to call the main Menu in case an invalid option is provided-------	
		} catch (Exception e) {
			System.out.println("Invalid Menu Option");
			DisplayMainMenu();
		}
		
	}
	/**
	 * @author tlyra
	 * @param 
	 * Prompt information about a person.
	 * The person Object is added to App List
	 * The name of the person is added to Name List
	 * The email of the person is added to Email List
	 * Ask if friend should be added, and keep asking for it as long as Y is pressed.
	 * After method end, calls DisplayMainMenu method so the program go back to main menu
	 * */
	public static void addPerson() {
		
		// --- Prompting user Information----
		System.out.println("Please Enter Person Name:");
		String name = input.nextLine();
		System.out.println("Please Enter Person Email");
		String email = input.nextLine();
		System.out.println("Please Enter Person Location");
		String location = input.nextLine();
		
		//---Creating Person Object with user Input----
		Person newPerson = new Person(name, email, location);
		
		//---Loop to prompt for Friend names and add the ----
		System.out.println("Do you want to add a Friend List to this person? Enter Y or N" );
		String userChoice = input.nextLine().toLowerCase();
		
		while(!userChoice.equals("y") && !userChoice.equals("n")) {
			System.out.println("Please enter Y or N" );
			userChoice = input.nextLine().toLowerCase();
			
			
		}
		
		
		while(userChoice.equals("y")) {
			addFriend(newPerson);
			System.out.println("Do you want to add another Friend? Enter Y or N" );
			userChoice = input.nextLine().toLowerCase();
			
			while(!userChoice.equals("y") && !userChoice.equals("n")) {
				System.out.println("Please enter Y or N" );
				userChoice = input.nextLine().toLowerCase();
				
				
			}
		}
		
		
		// --- Adding Person, name and email to all lists---
		appList.add(newPerson);
		appNameList.add(newPerson.name);
		appEmailList.add(newPerson.email);
		
		// --- Printing Output and going back to main menu----
		System.out.println("***********************************");
		System.out.println(newPerson.name + " Added to the App List");
		System.out.println("***********************************");
		
		DisplayMainMenu();
	}
	
	/**
	 * @author tlyra
	 * @param 
	 * Asks for user to input a position
	 * Get a valid position input to be used in add methods
	 * */
	public static int getInputListPosition() {
		System.out.println("Please Enter Position:");
		//--- Getting user Input, if it fails will go to catch---
		try {
			int position  = Integer.parseInt(input.nextLine());
			if(position>appList.getLength()) {
				throw new Exception();
			}
			return position;
			
			//---Inform the proper length that can be passed in the user Input---
		} catch (Exception e) {
			System.out.println("Position should be between " + 0 + " and " + (appList.getLength()-1));
			return getInputListPosition();
	
		}
	}
	
	
	/**
	 * @author tlyra
	 * @param 
	 * Call getInputListPostion to get a valid user Position
	 * Gets the Person information and prompt the output informing who was removed
	 * Remove Person from all Lists
	 * Go back to main Menu
	 * */
	public static void removePerson() {
		int position = getInputListPosition();
		System.out.println("***********************************");
		Person person = appList.getEntry(position);
		System.out.println(person.name+" was removed from the list");
		System.out.println("***********************************");
		appList.remove(position);
		appNameList.remove(position);
		appEmailList.remove(position);
		DisplayMainMenu();
	}
	
	/**
	 * @author tlyra
	 * @param 
	 * Prompt User to confirm if want to clear the list or not
	 * Only Accepts Y or N answer (lower or capital case)
	 * Remove Person from all Lists if confirmed
	 * Go back to main Menu
	 * If other result than Y or N is provided Recursion to call the method again
	 * */
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
				appNameList.clear();
				appEmailList.clear();
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
	
	
	/**
	 * @author tlyra
	 * @param 
	 * Prompt information about a person.
	 * Call the GetInputListPosition method to validate the Position to be added
	 * The person Object is added to App List in the correct position 
	 * The name of the person is added to Name List in the correct position
	 * The email of the person is added to Email List in the correct position
	 * Ask if friend should be added, and keep asking for it as long as Y is pressed.
	 * After method end, calls DisplayMainMenu method so the program go back to main menu
	 * 
	 * */
	
	public static void addPersonInPosition() {
	
		
		// --- Prompting user Information----
		System.out.println("Please Enter Person Name:");
		String name = input.nextLine();
		System.out.println("Please Enter Person Email");
		String email = input.nextLine();
		System.out.println("Please Enter Person Location");
		String location = input.nextLine();
		
		//---- Method to validate Position-----
		int position = getInputListPosition();

		// --- Create new Person Object----
		Person newPerson = new Person(name, email, location);
		
		//---Loop to prompt for Friend names and add the ----
		System.out.println("Do you want to add a Friend List to this person? Enter Y or N" );
		String userChoice = input.nextLine().toLowerCase();
		
		while(!userChoice.equals("y") && !userChoice.equals("n")) {
			System.out.println("Please enter Y or N" );
			userChoice = input.nextLine().toLowerCase();
			
			
		}
		
		
		while(userChoice.equals("y")) {
			addFriend(newPerson);
			System.out.println("Do you want to add a Friend List to this person? Enter Y or N" );
			userChoice = input.nextLine().toLowerCase();
			
			while(!userChoice.equals("y") && !userChoice.equals("n")) {
				System.out.println("Please enter Y or N" );
				userChoice = input.nextLine().toLowerCase();
				
				
			}
		}
		//--- Add data to Lists and prompt output---
		appList.add(position,newPerson);
		appNameList.add(position,newPerson.name);
		appEmailList.add(position,newPerson.email);
		System.out.println("***********************************");
		System.out.println(newPerson.name + " Added to the App List at position " +position  );
		System.out.println("***********************************");
		
		// --- Goes back to main menu
		DisplayMainMenu();
	}
	/**
	 * @author tlyra
	 * @param
	 * Call list method to print the correct length of the list
	 * Prompt the number output
	 * Goes back to main menu
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
	 * @param
	 * Call the list isEmpty method
	 * Prompt proper output based on result
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
	/**
	 * @author tlyra
	 * @param
	 * Ask for user input
	 * Search in both NameList and emailList for the person
	 * Return the Person if it is found in the list
	 * Prompt proper output based on result
	 * */
	public static Person searchForPerson() {
		System.out.println("Please enter person name or email");
		String key = input.nextLine();
		Person searchP = new Person(key,key,key);
		System.out.println("***********************************");
		
		// Get index in both list
		//int nameIndex = appNameList.contains(searchP.name);
		//int emailIndex = appEmailList.contains(searchP.email);
		if(appList.contains(searchP)) {
			return searchP;
		} else {
			return null;
		}
		/*
		if( nameIndex !=-1) {
			searchP = appList.getEntry(nameIndex);
			System.out.print(searchP);
			System.out.println("***********************************");
			return searchP;
		}else if (emailIndex!=-1) {
			searchP = appList.getEntry(nameIndex);
			System.out.print(searchP);
			System.out.println("***********************************");
			return searchP;
		} else {
			System.out.println(key + " was not found in the list of Persons in this app");
			System.out.println("***********************************");
			return null;
		}
		*/
	}
	
	
	/**
	 * @author tlyra
	 * @param 
	 * Call the searchForPerson Method to check if the person exist
	 * Display the Menu and possible options
	 * Treat any incorrect entry that isn't between 1 or 3
	 * Call the proper method based on user Choice
	 * If invalid choice is made, use recursion to call the function again
	 * */
	
	public static void addOrRemoveFriend() {
		//----- Try to find the Person------
		Person searchP  = searchForPerson();
		//----- Prompt option if person is found------		
		if(searchP!=null) {
			System.out.println("***********************************");
			System.out.println("Do you want to remove or add a Friend?");
			System.out.println("1. Add a Friend to List");
			System.out.println("2. Remove a Friend from List");
			System.out.println("3. Back to Main menu");
			System.out.println("***********************************");
		//----- Create Enumerator using linked list for menu options ------
			LList<Integer> menuOptions = new LList<>();
			for(int i =1;i<=3;i++) {
				menuOptions.add(i);
			}
		//--- Treat the options based on user input-------------
			try {
				int userOption = Integer.parseInt(input.nextLine());
				
				if(!menuOptions.contains(userOption)) {
					throw new Exception();
				} else {
		// --- Call the correct method based on user choice-----
					switch (userOption) {
					case 1:
						addFriend(searchP);
						DisplayMainMenu();
						break;
					case 2:
						removeFriend(searchP);
						DisplayMainMenu();
						
					default:
						break;
					}
				}
		// --- Recursion if invalid option is entered-----
			} catch (Exception e) {
				System.out.println("Please enter a valid option");
				addOrRemoveFriend();
			}
		// --- Go back to main menu if no user is found-----
		} else {
			DisplayMainMenu();
		}
	}
	
	/**
	 * @author tlyra
	 * @param 
	 * Prompts User to enter friend name
	 * Use contains LinkedList method to find the input in the friends list
	 * if the input is different from -1
	 * The user is removed and the output is prompted
	 * Otherwise, a prompt advising no friend was found is prompted
	 * 
	 * */
	
	public static void removeFriend(Person person) {
		System.out.println("Please enter Friends Name");
		String key = input.nextLine();
		//int index = person.friendList.contains(key);
		
		/*
		if(index!=-1) {
			System.out.println("***********************************");
			System.out.println(person.friendList.getEntry(index)+" was removed from "+person.name+ " Friends list");
			System.out.println("***********************************");
			person.friendList.remove(index);
			
		} else {
			System.out.println("***********************************");
			System.out.println("Friend wasn't found in the list");
			System.out.println("***********************************");
		}
		*/
		
	}
	
	
	/**
	 * @author tlyra
	 * @param 
	 * Prompts User to enter friend name
	 * use the add method from linkedlist to add the Friends name into the list
	 * Prompt confirming that the name was added
	 * 
	 * */
	public static void addFriend(Person person) {
		System.out.println("Please enter Friends Name");
		String key = input.nextLine();
		person.friendList.add(key);
		
		System.out.println("***********************************");
		System.out.println(key +" was added into " + person.name + " Friends list");
		System.out.println("***********************************");
	}
	
	/**
	 * @author tlyra
	 * @param 
	 * Call the toArray linkedlist method if the list isn't empty
	 * Traverse through the array to print each person
	 * 
	 * */
	public static void displayList() {
		if(!appList.isEmpty()) {
			Object[] appArr = appList.toArray();
			for(int i=0;i<appArr.length;i++) {
				System.out.println(appArr[i]);
			}
		} else {
			System.out.println("List is currently Empty");	
		}
	
		
		DisplayMainMenu();
	}

}

