
public class MainAPp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 5;
		System.out.println(a.getClass());
		MyList<Integer> list = new MyList<>();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.shift(0);
		list.insert(99, 1);
		list.display();
	}

}
