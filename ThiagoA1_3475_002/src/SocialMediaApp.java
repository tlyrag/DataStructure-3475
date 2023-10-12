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
			
			if(menuOptions.contains(choice)==-1) {
				throw new Exception();
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
		
		Person newPerson = new Person(name, email, location);
		
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
		
		
		
		appList.add(newPerson);
		appNameList.add(newPerson.name);
		appEmailList.add(newPerson.email);
		
		
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
		appNameList.remove(position);
		appEmailList.remove(position);
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
		appList.add(position,newPerson);
		appNameList.add(position,newPerson.name);
		appEmailList.add(position,newPerson.email);
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
	
	public static Person searchForPerson() {
		System.out.println("Please enter person name or email");
		String key = input.nextLine();
		Person searchP = new Person(key,key,key);
		
		System.out.println("***********************************");
		int nameIndex = appNameList.contains(searchP.name);
		int emailIndex = appNameList.contains(searchP.email);
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
			System.out.print(key + " was not found in the least of Person in this app");
			System.out.println("***********************************");
			return null;
		}
		
	}
	
	public static void addOrRemoveFriend() {
		Person searchP  = searchForPerson();
		
		if(searchP!=null) {
			System.out.println("***********************************");
			System.out.println("Do you want to remove or add a Friend?");
			System.out.println("1. Add a Friend to List");
			System.out.println("2. Remove a Friend from List");
			System.out.println("3. Back to Main menu");
			System.out.println("***********************************");
			
			LList<Integer> menuOptions = new LList<>();
			for(int i =1;i<=3;i++) {
				menuOptions.add(i);
			}
			try {
				int userOption = Integer.parseInt(input.nextLine());
				
				if(menuOptions.contains(userOption) ==-1) {
					throw new Exception();
				} else {
					
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
				
			} catch (Exception e) {
				System.out.println("Please enter a valid option");
				addOrRemoveFriend();
			}
		} else {
			DisplayMainMenu();
		}
	}
	
	public static void removeFriend(Person person) {
		System.out.println("Please enter Friends Name");
		String key = input.nextLine();
		int index = person.friendList.contains(key);
		
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
		
	}
	public static void addFriend(Person person) {
		System.out.println("Please enter Friends Name");
		String key = input.nextLine();
		person.friendList.add(key);
		
		System.out.println("***********************************");
		System.out.println(key +" was added into " + person.name + " Friends list");
		System.out.println("***********************************");
	}
	
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
