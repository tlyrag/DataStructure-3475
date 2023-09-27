
public class IncomeCall extends Phone{

	IncomeCall(String phoneNumber) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
		setPrice(0.02);
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return this.phoneNumber;
	}

	@Override
	public double getPriceCall() {
		// TODO Auto-generated method stub
		return this.callPrice;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		StringBuilder info = new StringBuilder();
		info.append("Phone Number: " + getPhone() + "\n");
		info.append("Rate: " + getPriceCall() + "\n");
		info.append("Price Call: " + getPriceCall() + "\n");
		System.out.println(info.toString());
	}

}
