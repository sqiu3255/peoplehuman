package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Teacher extends Person{
	private String subject;
	private String title; //Mr, Ms, Mx, Mrs

	public Teacher(int height, String firstName, String lastName, double weight, String title, String subject)
	{
		super (firstName, lastName, height, weight);; //must call superconstructor first
		this.subject = subject;
		this.title = title;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public String toString() {
		return this.title + " " + lastName;
	}
}