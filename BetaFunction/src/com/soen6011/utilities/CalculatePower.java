package com.soen6011.utilities;

public class CalculatePower {
	/**
	 * <p>
	 * The getPOW method calculates the power of x to y
	 * </p>
	 * 
	 * @param x This is the first number.
	 * @param y This is the second number
	 * @return double This returns the POW of x to y
	 */
	private CalculatePower() {
		throw new IllegalStateException("CalculatePower class");
	}

	public static double getPOW(double x, double y) {

		double result = x;

		for (int i = 1; i < y; i++) {
			result = result * x;
		}
		return result;
	}
}
