package com.soen6011.utilities;

public class CalculatePI {
	/**
	 * The Pi is a ratio and is obtained from a circle. If the diameter and the
	 * circumference of any given circle are known, the value of Pi will be as π =
	 * Circumference/ Diameter.
	 */
	private CalculatePI() {
		throw new IllegalStateException("Calculate PI class");
	}

	public static double getPiValue() {

		/**
		 * Considering Circumference and Diameter of a known circle C.
		 */
		double circumference = 314.5926536;
		double diameter = 100;
		return circumference / diameter;
	}

}
