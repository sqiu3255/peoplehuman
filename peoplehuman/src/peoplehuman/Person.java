package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public abstract class Person {
	private int height; //in inches 
	private String firstName, 
				   lastName;
	private double weight; //pounds
	
	
public Person (int height, String firstName, String lastName, double weight) {
		this.height= height;
		this.firstName= firstName;
		this.lastName= lastName;
		this.weight= weight;	
	}
	public abstract String toString();
					
}
