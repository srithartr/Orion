package com.mindistance;

import java.util.HashMap;
import java.util.Map;

public class CalculateMinDistance {

	public static int calculateMinDistance(int[] a) {
		final Map<Integer, Integer> numDisMap = new HashMap<>();
		int length = a.length;
		int min = length;
		for (int i = 0; i < length; i++) {
			int no = a[i];
			int distance = i;
			if (numDisMap.containsKey(no)) {
				distance = Math.abs(i - numDisMap.get(no));
				if (distance < min) {
					min = distance;
				}
			}
			numDisMap.put(no, distance);
		}
		min = (min == length) ? -1 : min;
		System.out.println(min);
		return min;
	}

}
