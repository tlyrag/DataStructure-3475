package thiagoA2_3475_002;

import java.util.Date;
/**
 *@author tlyra
 * Class Assignment that implements comparable interface
 * to allow comparisson between assignment objects based on due
 * date
 * 
 */
public class assignment implements Comparable<assignment>{
	String course;
	String task;
	Date dueDate;
	
	public assignment(String course, String task,Date date) {
		this.course=course;
		this.task=task;
		this.dueDate=date;
	}
	
	@Override
	public int compareTo(assignment ass) {
		if(this.dueDate.compareTo(ass.dueDate)<0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("CourseName: " + course +" \n");
		str.append("task: " + task +" \n");
		str.append("dueDate: " + dueDate +" \n \n");
		
		return str.toString();
	}
}
