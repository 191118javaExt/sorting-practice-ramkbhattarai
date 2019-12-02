package com.revature.sort;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length < 2) {
			return;
		}
		int n = arr.length;
		int [] left = new int[n/2];
		for(int i =0; i < n/2; i++ ) {
			left[i] = arr[i];
		}
		
		int [] right = new int[n - n/2];
		for(int i = 0; i < right.length; i++) {
			right[i] = arr[n/2 + i];
		}
		sort(left);
		sort(right);
		merge(arr, left, right );
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
	
		int i = 0, j=0;
		for (int k = 0; k < arr.length; k++) {
            if      (i >= left.length) arr[k] = right[j++];
            else if (j >= right.length) arr[k] = left[i++];
            else if (left[i] <= right[j])  arr[k] = left[i++];
            else                    arr[k] = right[j++];
        }
		//System.out.println(Arrays.toString(arr));
       
	}
}
