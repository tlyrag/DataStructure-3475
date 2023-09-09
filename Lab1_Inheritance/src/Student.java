
public abstract class Student {
	private int studID;
	private String lastName;
	protected double tuitionFee;
	
	public Student(int studId, String lastName) {
		this.studID= studId;
		this.lastName= lastName;
	}
	
	public int getStudID() {
		return this.studID;
	}
	public String getLastName() {
		return this.lastName;
	}
	public double getTuitionFee() {
		return this.tuitionFee;
	}
	
	public void setStudID(int studId) {
		this.studID=studId;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public abstract void setTuitionFee();
	@Override
	public String toString() {
		StringBuilder std = new StringBuilder();
		std.append("Student ID:" + this.studID +" \n");
		std.append("Last Name:" + this.lastName +" \n");
		std.append("Tuition Fee:" + this.tuitionFee +" \n");
		return std.toString();
	}
}
