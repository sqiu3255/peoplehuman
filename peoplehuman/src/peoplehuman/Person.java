package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public abstract class Person {
	private String firstName, 
				   lastName;
	private int height; //in inches
	private double weight; //pounds
				 
	
	public Person ( 
				   String firstName, 
				   String lastName,
				   int height,
				   double weight 
				   ) 
	{
		this.firstName= firstName;
		this.lastName= lastName;
		this.height= height;
		this.weight= weight;	
		
	}

	public int getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	 
	public String toString() {
		return firstName + " " + lastName;
	}
					
}
