package AppTraining;

public class Student {
	
	int id;
	String major;
	String CGPA;
	
	public Student(int id,String major, String CGPA) {
		this.id=id;
		this.major=major;
		this.CGPA = CGPA;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Id:"+this.id+"\n");
		str.append("Major:"+this.major+"\n");
		str.append("CGPA:"+this.CGPA+"\n");
		return str.toString();
	}
}
