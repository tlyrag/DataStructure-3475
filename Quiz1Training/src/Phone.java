
public abstract class Phone {
	String phoneNumber;
	double callPrice;
	
	Phone (String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.callPrice=0.0;
	}
	
	public void setPrice(double price) {
		this.callPrice=price;
	}
	
	public abstract String getPhone();
	public abstract double getPriceCall();
	public abstract void getInfo();
	
}
