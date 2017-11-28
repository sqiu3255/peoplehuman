package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Student extends Person {	
	
		double GPA; 			//indicates the student's GPA 
		int gradYear,			//indicates what grade the student is in
			numberOfClasses;	//indicates the number of classes the student is taking
			
		
	public Student( double GPA,
					int gradYear,
					int numberOfClasses,
					String firstName, 
					String lastName,
					int height,
					double weight 
			   		)  
		{
			super (firstName, lastName, height, weight); //must call superconstructor first
			this.GPA = GPA;
			this.gradYear = gradYear;
			this.numberOfClasses = numberOfClasses;
		}
	
	
	
	
	
	
}
