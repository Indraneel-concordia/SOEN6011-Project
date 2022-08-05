package com.soen6011.utilities;

public class CalculateGamma {
	/**
	 * <p>
	 * The calculateGamma method calculates the gamma function using the Stirling's
	 * Approximation.
	 * </p>
	 * 
	 * @param num This is the input for Gamma function
	 * @return double This returns the gamma function.
	 */
	private CalculateGamma() {
		throw new IllegalStateException("Gamma class");
	}

	public static double calculateGammaForBeta(double num) {

		double variableA = (CalculatePI.getPiValue() * 2) / num;
		double variableB = num / Constants.EXPONENTIAL;

		double sqrt = CalculateSqrt.getSqrt(variableA);
		double pow = CalculatePower.getPOW(variableB, num);

		return sqrt * pow;
	}
}
