import java.io.*;

public class NegativeBalanceException extends Exception {

	// Private member variables
	private double _negativeBalance;

	// Default constructor
	public NegativeBalanceException() {
		// Call super to the exception class
		super("Error: negative balance");
	}

	// Constructor
	public NegativeBalanceException(double d) {
		// Super the exception message to the parent class
		super("Amount exceeds balance by " + d);
		
		// Assign the parameter to the member variable
		_negativeBalance = d;
		
		// Output the exception message to a log file
		try {
			// Create a print writer object
			PrintWriter writer = new PrintWriter("logfile.txt");
			
			// Print the exception message to the log file
			writer.print("Amount exceeds balance by " + d);
			
			// Close out the writer
			writer.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// toString method
	public String toString() {
		return "Blance of " + _negativeBalance + " not allowed";
	}

}
