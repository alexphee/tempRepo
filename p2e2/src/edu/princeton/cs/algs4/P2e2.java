package edu.princeton.cs.algs4;

import java.util.Arrays;

public class P2e2 {
	
	public static double time(String alg, String[] a) { 
        Stopwatch sw = new Stopwatch(); 
        if      (alg.equals("Insertion"))       Insertion.sort(a); 
        else if (alg.equals("Quick"))           Quick.sort(a); 
        else if (alg.equals("Quick1"))           Quick1.sort(a); 
        else if (alg.equals("Quick2"))           Quick2.sort(a); 
        else if (alg.equals("Quick3"))           Quick3.sort(a); 
        else throw new IllegalArgumentException("Invalid algorithm: " + alg);
        return sw.elapsedTime(); 
    } 
	
	public static void main(String[] args) {
		 String[] a = StdIn.readAllStrings();
		 
		double et=time("Quick", a);
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
           String ith = (String) Quick.select(a, i);
           StdOut.print(ith+" ");
       }
       StdOut.println();
       StdOut.println("Quick ");
       StdOut.println("Length:"+n);
       StdOut.println("Time"+et);
       StdOut.println();
       

       
       et=time("Insertion", a);
    
       StdOut.println("Insertion ");
       StdOut.println("Time"+et);
       StdOut.println();
       
 
       et=time("Quick1", a);
       StdOut.println("Quick1 ");
       StdOut.println("Time"+et);
       StdOut.println();
       for (int i = 0; i < a.length; i++) {
         String ith = (String) Quick1.select(a, i);
         StdOut.print(ith+" ");
         StdOut.print();
       }
       StdOut.println();
       StdOut.println();


       et=time("Quick2", a);
       StdOut.println("Quick2 ");
       StdOut.println("Time"+et);
       StdOut.println();
       for (int i = 0; i < a.length; i++) {
         String ith = (String) Quick2.select(a, i);
         StdOut.print(ith+" ");
       }
	}
}
