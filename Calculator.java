package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * returns the total after a finite number of calculations are performed.
	 * @total		The result of the calculations
	 * @return		Returns the total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * adds a value specified by the user to the total
	 * 
	 * @param value		Operand to be added to the total
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	/**
	 * Subtracts a value specified by the user against the total
	 * 
	 * @param value		Operand to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies the total by an integer specified by the user
	 * 
	 * @param value		Operand to be multiplied by the total
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	/**
	 * divided the total by an integer specified by the user
	 * 
	 * @param value		value to be divided int the total
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
		
		history += " / " + value;
	}
	/**
	 * Returns a String that keeps track of all the operations done on the total
	 * 
	 * @return
	 */
	public String getHistory () {
		return history;
	}
}