/******************************************************************************
 *  Compilation:  	javac P2e3b.java
 *  Execution:   	java edu.princeton.cs.algs4.MainStrings <in-MainInts1.txt
 *  Dependencies: 	StdIn.java StdOut.java Quick.java StdRandom.java
 *  Data files: 	in-MainDoubles1.txt, in-IntsDoubles1.txt, in-MainStrings1.txt  
 *
 ******************************************************************************/
package edu.princeton.cs.algs4;

import java.lang.reflect.Array;

public class P2e3b {
	public static <E extends Comparable<? super E>> E[] getMinMax(E[] inputArray, int start,
			int end) {
		E max;
		E min;
		String[] maximums;
		String[] minimums;
		
		if (start == end) {
			max = inputArray[start];
			min = inputArray[start];
		} else if (start + 1 == end) {
			if (inputArray[start].compareTo(inputArray[end]) < 0) {
				max = inputArray[end];
				min = inputArray[start];
			} else {
				max = inputArray[start];
				min = inputArray[end];
			}
		} else {
			int mid = start + (end - start) / 2;
			E[] left = getMinMax(inputArray, start, mid);
			E[] right = getMinMax(inputArray, mid + 1, end);

			if (left[0].compareTo(right[0]) > 0)
				max = left[0];
			else
				max = right[0];
			if (left[1].compareTo(right[1]) < 0)
				min = left[1];
			else
				min = right[1];
		}
		
		StdOut.println(max + " \t " + min);

		E[] test = (E[]) Array.newInstance(inputArray.getClass().getComponentType(), 2);
		test[0] = max;
		test[1] = min;

		return test;
	}
}
