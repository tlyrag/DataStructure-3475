
public class GraduateStudent extends Student{

	public GraduateStudent(int studId, String lastName) {
		super(studId, lastName);
		// TODO Auto-generated constructor stub
		setTuitionFee();
	}

	@Override
	public void setTuitionFee() {
		this.tuitionFee =6000.00;
		
	}

}
