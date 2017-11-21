package peoplehuman;

public class Teacher extends Person{
private String subject;
	public Teacher(int height, String firstName, String lastName, double weight)
	{
		super (height, firstName, lastName, weight); //must call superconstructor first
		this.subject = subject;
	}
}
