package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public abstract class Person {
	private int height, //in inches
				numberOfClasses,
				numberOfCuts;  
	private String firstName, 
				   lastName;
	private double weight, //pounds
				 GPA;
	
	
	
	public Person (int height, String firstName, String lastName, double weight, double GPA, int numberOfClasses, int numberOfCuts) 
	{
		this.height= height;
		this.firstName= firstName;
		this.lastName= lastName;
		this.weight= weight;	
		this.GPA = GPA;
		this.numberOfClasses = numberOfClasses;
		this.numberOfCuts = numberOfCuts;
	}

					
}
