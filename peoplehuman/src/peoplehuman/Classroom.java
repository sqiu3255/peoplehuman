package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Classroom {
	
	private Student[] students;
	private Teacher teacher;

	
	public Classroom (Student[] students, Teacher teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	
	public String getSubject() 
	{
		return this.teacher.getSubject();
	}
	
	
	public double classAverage() 
	{
		double average = 0.0;
		for (Student students : this.students) {
			average = (average + students.getGPA()) / (this.students.length);
		}
		return average;
	}
	
	
	 public String printClass() 
	 {
		 return ((Teacher)teacher).toString() + ", " + ((Teacher)teacher).getSubject() + ", " + students.length;
	 }
}
