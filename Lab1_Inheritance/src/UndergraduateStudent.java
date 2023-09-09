
public class UndergraduateStudent extends Student{

	public UndergraduateStudent(int studId, String lastName) {
		super(studId, lastName);
		// TODO Auto-generated constructor stub
		setTuitionFee();
	}

	@Override
	public void setTuitionFee() {
		// TODO Auto-generated method stub
		this.tuitionFee =4000.00;
	}

}
