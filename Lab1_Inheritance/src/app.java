
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stds = new Student[6];
		stds = generateRandomStudents(stds);
		displayStds(stds);
		
		
	}
	public static Student[] generateRandomStudents(Student[] stds) {
		Student[] tempStds = new Student[stds.length];
		for(int i =0; i<tempStds.length;i++) {
			int randomNum = (int)(Math.random() *3);
			
			switch(randomNum) {
				case 0:
					tempStds[i] = new GraduateStudent(i, "Test " + randomNum +i);
					break;
				case 1:
					tempStds[i] = new UndergraduateStudent(i, "Test " + randomNum+i);
					break;
				case 2:
					tempStds[i] = new StudentAtLarge(i, "Test " + randomNum);
					break;
			}
		}
		return tempStds;
	}
	public static void displayStds(Student[] stds) {
		for(int i =0; i<stds.length;i++) {
			System.out.println(stds[i]);
			System.out.println("------------");
		}
	}

}
