package edu.princeton.cs.algs4;

public class P2e3 {
    public static void main(String[] args) {
		int min;
		 int[] a = StdIn.readAllInts();
		min= Quick.select(a, a[8]);
		StdOut.print(min);
	}

}
