
public class Person {
	String name;
	String email;
	String location;
	LList<String> friendList = new LList<>();
	
	Person(String name,String email, String location) {
		this.name=name;
		this.email=email;
		this.location=location;
	}
	
	public void addFriend(String friendsName) {
		this.friendList.add(friendsName);
	}
	
	public String concFriends() {
		StringBuilder friends = new StringBuilder();
		for(int i =0; i<friendList.listSize;i++) {
			friends.append(friendList.getEntry(i)+ " ");
		}
		return friends.toString();
	}


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


