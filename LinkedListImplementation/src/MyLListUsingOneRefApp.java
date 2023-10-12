
public class MyLListUsingOneRefApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create an empty list");
		MyListInterface<String> myLList = new MyLListUsingOneRef<>();
		System.out.println("Test isEmpty method " + myLList.isEmpty());
		
		System.out.println("Testing add to the end");
		System.out.println("Testing add to end: ");
		myLList.add("Vancouver");
		myLList.add("Burnaby");
		myLList.add("Coquitlam");
		myLList.add("Surrey");
	      
		System.out.println("\n\nList should contain\n Vancouver Burnaby Coquitlam Surrey ");
		displayList(myLList);
		
	}
	
	 public static void displayList(MyListInterface<String> list)
	 {
	      System.out.println("The list contains " + list.getLength() +
	                         " string(s), as follows:");
	      Object[] listArray = list.toArray();
	      for (int index = 0; index < listArray.length; index++)
	      {
	         System.out.print(listArray[index] + " ");
	      } // end for
	      
	      System.out.println();
	 } // end displayList

}
