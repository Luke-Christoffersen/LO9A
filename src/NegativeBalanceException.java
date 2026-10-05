
public class NegativeBalanceException extends Exception {

	// Private member variables
	private double _negativeBalance;
	
	// Constructor
	public NegativeBalanceException(double d) {
		// TODO Auto-generated constructor stub
	}

	// Default constructor
	public NegativeBalanceException() {
		// Call super to the exception class
		super();
	}
	
	// toString method
	public String toString() {
		return "Blance of " + _negativeBalance + " not allowed";
	}

}
