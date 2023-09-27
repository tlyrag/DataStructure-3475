
public class OutgoingCall extends Phone{
	
	double minutes;
	OutgoingCall(String phoneNumber , double minutes) {
		super(phoneNumber);
		
		// TODO Auto-generated constructor stub
		this.minutes=minutes;
		setPrice(0.04*this.minutes);
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
		info.append("Rate: " + 0.04 + "\n");
		info.append("Price Call: " + getPriceCall() + "\n");
		System.out.println(info.toString());
	}

}
