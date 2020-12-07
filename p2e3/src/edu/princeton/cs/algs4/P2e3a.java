package edu.princeton.cs.algs4;

public class P2e3a {
    public static void main(String[] args) {
		
    	String min;
		String max;
		Comparable[] arr = StdIn.readAllStrings();
		StdOut.println("Original array:");
		for (int i = 0; i < arr.length; i++) {
	           StdOut.print(arr[i]+" ");
	       }
		StdOut.println(" ");
		min= (String) Quick.select(arr, 0);
		max= (String) Quick.select(arr, arr.length-1);
		
		StdOut.println("Min element is "+min);
		StdOut.println("Max element is "+max);
	}

}
