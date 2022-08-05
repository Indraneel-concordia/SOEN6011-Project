package com.soen6011.utilities;

public class CalculateSqrt {

	/**
	 * <p>
	 * The getSqrt method is used to calculate the square root
	 * </p>
	 * 
	 * @param num This is the input
	 * @return double returns the square root of input
	 */
	private CalculateSqrt() {
		throw new IllegalStateException("CalculateSwrt class");
	}

	public static double getSqrt(double num) {

		double result;
		double x;
		double n = num / 2;
		do {
			x = n;
			n = (x + num / x) / 2;
		} while ((x - n) != 0);
		result = x;
		return result;
	}
}
