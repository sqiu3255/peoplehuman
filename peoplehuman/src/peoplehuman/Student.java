package peoplehuman;

/**
 * @author Amy Chen, Sophia Qiu
 * Period 2
 * Date Created: 11.21.2017
 *
 */

public class Student extends Person {	
private String gender;	
		
	public Student(double GPA, int numberOfClasses, int numberOfCuts) {
		
		{
			super (GPA, numberOfClasses, numberOfCuts); //must call superconstructor first
			this.gender = gender;
		}
		

	}
	
	public double getGPA() { 
		return GPA; 
	}
	
	public int getnumberOfClasses() {
		return numberOfClasses;
	}
	
	public int getnumberOfCuts() {
		return numberOfCuts;
	}
}
