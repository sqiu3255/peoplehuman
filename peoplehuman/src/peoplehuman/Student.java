package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Student extends Person {	
	double GPA;
	int numberOfClasses,
		numberOfCuts;
		
	public Student(double GPA, int numberOfClasses, int numberOfCuts) {
		
		
		this.GPA = GPA;
		this.numberOfClasses = numberOfClasses;
		this.numberOfCuts = numberOfCuts;
		
		
	}
}
