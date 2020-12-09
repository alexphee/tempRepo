package edu.princeton.cs.algs4;

public class MainStrings {

	public static void main(String[] args) {		
		StdOut.println("max \t min");
		Comparable[] inputArray = StdIn.readAllStrings();
		Comparable[] minmax=P2e3b.getMinMax(inputArray, 0, inputArray.length-1);
		StdOut.println("Min element :"+minmax[1]);
		StdOut.println("Max element :"+minmax[0]);
	}

}
