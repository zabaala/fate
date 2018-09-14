package ateneu;

public class Calculator {
	
	/**
	 * The first number that will be used in arithmetic operation.
	 */
	private Double firstNumber;
	
	/**
	 * The second number that will be used in arithmetic operation.
	 */
	private Double secondNumber;

	/**
	 * Set integer numbers.
	 * 
	 * @param Integer firstNumber
	 * @param Integer secondNumber
	 */
	public void setNumbers(Integer firstNumber, Integer secondNumber) {
		this.firstNumber = (double) firstNumber;
		this.secondNumber = (double) secondNumber;
	}
	
	/**
	 * Set integer numbers.
	 * 
	 * @param Double firstNumber
	 * @param Double secondNumber
	 */
	public void setNumbers(Double firstNumber, Double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	/**
	 * Perform a sum between two numbers.
	 * 
	 * @return Double
	 */
	public Double sum() 
	{
		return this.firstNumber + this.secondNumber;
	}
	
	/**
	 * Perform a subtraction between two numbers. 
	 * 
	 * @return Double
	 */
	public Double sub()
	{
		return this.firstNumber - this.secondNumber;
	}
	
	/**
	 * Perform a multiplication between two numbers.
	 * 
	 * @return Double
	 */
	public Double multiply()
	{
		return this.firstNumber * this.secondNumber;
	}
	
	/**
	 * Perform a division between two numbers.
	 * 
	 * @return Double
	 */
	public Double divide()
	{
		return this.firstNumber / this.secondNumber;
	}
	
	/**
	 * @return boolean
	 */
	public boolean equals(Object object)
	{
		return object instanceof Calculator && this.equals(object);
	}

}
