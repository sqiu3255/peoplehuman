package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Teacher extends Person{
private String subject;
	public Teacher(int height, String firstName, String lastName, double weight)
	{
		super (height, firstName, lastName, weight); //must call superconstructor first
		this.subject = subject;
	}
}
