
public class StudentAtLarge extends Student{

	public StudentAtLarge(int studId, String lastName) {
		super(studId, lastName);
		setTuitionFee();
	}

	@Override
	public void setTuitionFee() {
		// TODO Auto-generated method stub
		this.tuitionFee=2000.00;
	}

}
