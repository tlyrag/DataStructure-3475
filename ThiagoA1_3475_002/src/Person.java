
public class Person {
	String name;
	String email;
	String location;
	LList<Person> friendList = new LList<>();
	
	Person(String name,String email, String location) {
		this.name=name;
		this.email=email;
		this.location=location;
	}
	
	Person(String name) {
		this.name = name;
	}
	
	public void addFriend(Person friend) {
		this.friendList.add(friend);
	}
	
	/**
	 * @author tlyra
	 * 
	 * @param Create a string with all the existing friend name in the Friend list
	 * */
	
	public String concFriends() {
		StringBuilder friends = new StringBuilder();
		for(int i =0; i<friendList.listSize;i++) {
			friends.append(friendList.getEntry(i).name+ " ");
		}
		return friends.toString();
	}

	
	/**
	 * @author tlyra
	 * 
	 * @param Overriding equals method to compare if the Person has the same name or email
	 * */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if(person.email.equals(this.email) || person.name.equals(this.name )) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @author tlyra
	 * 
	 * @param Override the toString method to display the properties of the person
	 * */
	@Override
	public String toString() {
		StringBuilder personInfo = new StringBuilder();
		
		personInfo.append("Name: " + this.name + "\n");
		personInfo.append("Email: " + this.email+ "\n");
		personInfo.append("Location: " + this.location+ "\n");
		personInfo.append("Friend List: " + concFriends()+ "\n");
		
		return personInfo.toString();
	}
}


