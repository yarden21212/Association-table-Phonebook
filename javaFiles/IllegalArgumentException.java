/*
 * IllegalArgumentException is an exception class which extends Exception, it checks if both given arrays have the same size
 * And throws exception if not
 */
public class IllegalArgumentException extends Exception{

	public IllegalArgumentException() {
		
		System.out.println("The 2 different arrays are in different lengths, please give different ones!");
	}
}
