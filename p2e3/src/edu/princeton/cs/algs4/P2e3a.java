package edu.princeton.cs.algs4;

public class P2e3a {
    public static void main(String[] args) {
		
    	String min;
		String max;
		String[] a = StdIn.readAllStrings();
		min= (String) Quick.select(a, 0);
		max= (String) Quick.select(a, a.length-1);
		StdOut.println("Min element is "+min);
		StdOut.println("Max element is "+max);
	}

}
