package com.soen6011.model;

import com.soen6011.utilities.CalculateGamma;

public class Model {

	/**
	 * <p>
	 * The calculateBeta method does the calculation based on the Gamma function.
	 * </p>
	 * 
	 * @param x This is the first input number
	 * @param y This is the second input number
	 * @return double This returns the beta function result
	 * 
	 * @author Indraneel Rachakonda
	 * @version 1.0 // * @since 2022-07-16
	 *
	 */
	public double calculateBeta(double x, double y) {

		double numerator = CalculateGamma.calculateGammaForBeta(x) * CalculateGamma.calculateGammaForBeta(y);
		double denominator = CalculateGamma.calculateGammaForBeta(x + y);
		return numerator / denominator;
	}
}
