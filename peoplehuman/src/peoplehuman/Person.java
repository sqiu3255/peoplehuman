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

					
}
