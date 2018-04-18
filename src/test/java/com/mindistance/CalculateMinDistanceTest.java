package com.mindistance;

import org.junit.Test;

import junit.framework.Assert;

public class CalculateMinDistanceTest {

	@Test
	public void testCalculateMinDistance() {
		int[] arrValid = { 7, 1, 3, 4, 1, 7 };
		int min = CalculateMinDistance.calculateMinDistance(arrValid);
		Assert.assertEquals(min, 3);
	}

	@Test
	public void testInvalidMinDistance() {
		int[] arrInValid = {};
		int min = CalculateMinDistance.calculateMinDistance(arrInValid);
		Assert.assertEquals(min, -1);
		
		
		int[] arrNoPair = { 0, 1, 3, 4, 2, 7};
		int noPairMin = CalculateMinDistance.calculateMinDistance(arrNoPair);
		Assert.assertEquals(noPairMin, -1);

	}

	@Test
	public void testConsicutiveMinDistance() {
		int[] arrValid = { 7, 1, 1, 4, 7 };
		int min = CalculateMinDistance.calculateMinDistance(arrValid);
		Assert.assertEquals(min, 1);
	}

	@Test
	public void testDuplicateMinDistance() {
		int[] arrValid = { 7, 1, 7, 1, 7 };
		int min = CalculateMinDistance.calculateMinDistance(arrValid);
		Assert.assertEquals(min, 2);
	}
}
