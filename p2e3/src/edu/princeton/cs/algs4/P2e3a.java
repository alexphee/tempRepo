/******************************************************************************
 *  Compilation:  	javac P2e3a.java
 *  Execution:   	java edu.princeton.cs.algs4.P2e3a >out_p2e1.txt
 *  Dependencies: 	StdIn.java StdOut.java Quick.java StdRandom.java
 *  Data files: 	-  
 *
 ******************************************************************************/
package edu.princeton.cs.algs4;

public class P2e3a {
    public static void main(String[] args) {
    	System.out.println("Project_2, Exercise_3a : P2e3a");
        System.out.println();
        
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
