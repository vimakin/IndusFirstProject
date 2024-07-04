package com.indus.training.core;

/**
 * Description: To calculate basic arithmetic operations 
 */
public class Calci {
	/**
	 * To perform addition operation
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public double addition(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 + param2;

		}
		return result;
	}

	/**
	 * To perform subtraction operation
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public double subtraction(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 - param2;
		}
		return result;
	}

	/**
	 * To perform multiplication operation
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public double multiplication(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 * param2;
		}
		return result;
	}

	/**
	 * To perform division operation
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public double division(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 / param2;
		}
		return result;
	}

}