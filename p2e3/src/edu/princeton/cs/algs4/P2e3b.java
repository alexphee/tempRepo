package edu.princeton.cs.algs4;

public class P2e3b {
	/* Class Pair is used to return two values from getMinMax() */
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n % 2 == 0) {				//array with even number of elements --> first 2 elements are min and max
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
        } else {						//array with odd number of elements --> first element is min and max
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;						//starting index for the loop
        }
        while (i < n - 1) {				//pick elements in pair and compare the pair with max and min so far
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
        }
        return minmax;
    }

    public static void MainInt(int[] arr) {
    	
    	Pair minmax = getMinMax(arr, arr.length);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
    public static void main(String[] args) {
    	int[] arr = StdIn.readAllInts();
    	MainInt(arr);
    }
}