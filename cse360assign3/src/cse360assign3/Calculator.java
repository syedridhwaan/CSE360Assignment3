
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/** Here is our constuctor with the total value and calculator history 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** This function returns the current calculated value 
	 * */
	public int getTotal () {
		return total;
	}
	
	/** This is our add function 
	 * @param value is added to our total.
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
		
	}

	/** This is our add function 
	 * @param value is subtracted from our total.
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}

	/** This is our add function 
	 * @param value is multiplied by our total.
	 */
	public void multiply (int value) {
		total = (value*total);
		history += " * " + value;
	}

	/** This is our add function 
	 * @param our total is divided by value.
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = (total/value);
		}
		history += " / " + value;
	}

	/** @return This returns a string with a history of all
	 * calculations that have been made.
	 */
	public String getHistory () {
		return history;
	}
}