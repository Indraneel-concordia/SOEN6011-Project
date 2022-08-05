package com.soen6011.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.soen6011.model.*;
import com.soen6011.utilities.*;

public class TestBetaFucntion {
	Model model = new Model();

	@Test
	public void testSqrt() {

		assertEquals(CalculateSqrt.getSqrt(13), Math.sqrt(13), 0.000001);
		assertEquals(CalculateSqrt.getSqrt(501), Math.sqrt(501), 0.000001);
		assertEquals(CalculateSqrt.getSqrt(76.5), Math.sqrt(76.5), 0.0000001);
	}

	@Test
	public void testPOW() {

		assertEquals(CalculatePower.getPOW(2, 3), Math.pow(2, 3), 0.000001);
		assertEquals(CalculatePower.getPOW(50, 80), Math.pow(50, 80), 0.000001);
		assertEquals(CalculatePower.getPOW(57, 1000), Math.pow(57, 1000), 0.000001);
	}

	@Test
	public void testGamma() {

		assertEquals(CalculateGamma.calculateGammaForBeta(3), 1.9467055525767052, 0.000001);
		assertEquals(CalculateGamma.calculateGammaForBeta(3.5), 3.685003468026844, 0.000001);
		assertEquals(CalculateGamma.calculateGammaForBeta(99), 9.419217529848326E153, 0.000001);
	}

	@Test
	public void testBeta() {

		assertEquals(model.calculateBeta(3, 4), 0.016079225744845948, 0.000001);
		assertEquals(model.calculateBeta(3.5, 4.5), 0.010854541060834675000, 0.000001);
		assertEquals(model.calculateBeta(99, 99), 0.00, 0.000001);
	}

}
