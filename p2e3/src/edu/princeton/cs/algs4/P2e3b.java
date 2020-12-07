package edu.princeton.cs.algs4;

public class P2e3b {
	static int[] getMinMax(int A[], int start, int end){
	    int max;
	    int min;
	    if ( start == end )
	    {
	        max = A[start];
	        min = A[start];
	    }
	    else if ( start + 1 == end )
	    {
	        if ( A[start] < A[end] )
	        {
	            max = A[end];
	            min = A[start];
	        }
	        else
	        {
	            max = A[start];
	            min = A[end];
	        }
	    }
	    else
	    {
	        int mid = start + (end - start)/2;
	        int left[] = getMinMax(A, start, mid);
	        int right[] = getMinMax(A, mid+1, end);
	        if ( left[0] > right[0] )
	            max = left[0];
	        else
	            max = right[0];
	        if ( left[1] < right[1] )
	            min = left[1];
	        else
	            min = right[1];
	    }
	    int ans[] = {max, min};
	   
	   return ans;
	}
	public static void main(String args[]) {
	int[] arr = StdIn.readAllInts();
    int[] minmax = getMinMax(arr, 0, arr.length - 1);
    
    StdOut.println("Min element is "+minmax[1]);
    StdOut.println("Max element is "+minmax[0]);
	}
}