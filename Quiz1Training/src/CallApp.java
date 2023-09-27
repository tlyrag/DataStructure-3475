
public class CallApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phones = new Phone[8];
		generateRandomPhones(phones,0,7);
		displayArr(phones,0,7);
		
	}
	
	public static void generateRandomPhones (Phone[] phones,int first,int last) {
		
		
		IncomeCall newCall = new IncomeCall("123" +first + last);
		phones[last] =	newCall;
		
		if(first!=last) {
			generateRandomPhones(phones, first, last-1);
		}

	}
	public static void displayArr(Phone[] phones, int first, int last) {
		
		phones[last].getInfo();
		if(first!= last) {
			displayArr(phones, first, last-1);
		}
	}

}
