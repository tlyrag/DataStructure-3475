/**
 * MyListApp class
 * @author mbashir1
 *
 */
public class MyListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListInterface<String> list = new MyList<>();
		list.add("yyy");
		list.add("zzz");
		list.add(1,"AAA");
		Object[] arr = list.toArray();
		for(Object s : arr)
			System.out.println(s);
		list.replace(0, "DC");
		
		System.out.println("\nList after replacing element at index 0");
		arr = list.toArray();
		for(Object s : arr)
			System.out.println(s);
		
		System.out.println("\ncheck if particular element is in the array");
		System.out.println(list.contains("DC"));
		
		System.out.println("\ncheck if array is empty");
		System.out.println(list.isEmpty());
		
		System.out.println("\nList of integer items");
		
		MyListInterface<Integer> iList = new MyList<>();
		iList.add(456);
		iList.add(666);
		iList.add(1,000);
		arr = iList.toArray();
		for(Object s : arr)
			System.out.println(s);
	}

}
