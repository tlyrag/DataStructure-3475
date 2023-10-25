package AppTraining;

public class StudentApp {
	public static ArrayQueue<Student> studQueue = new ArrayQueue<>();
	public static void main(String[] args) {
		createStuds(5);
		dequeueAllAndPrint(studQueue);
	}
	
	public static void createStuds(int studNum) {
		for(int i =0; i<studNum;i++) {
			Student newStud = new Student(i,"Student"+i,"CGPANUM"+i);
			studQueue.enqueue(newStud);
			
		}
		
	}
	public static void dequeueAllAndPrint(ArrayQueue<Student> studQueue) {
		while(studQueue.size>0) {
			System.out.println(studQueue.dequeue());
		}
	}

}
