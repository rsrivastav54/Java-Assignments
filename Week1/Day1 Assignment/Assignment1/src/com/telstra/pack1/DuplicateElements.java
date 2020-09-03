package com.telstra.pack1;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,5,4,3,4,2,3};
		
		arr = sort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		arr = duplicate(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] duplicate(int[] arr) {
		int[] arr2 = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr2[count] = arr[i];
				count++;
			}
		}
		arr2[count] = arr[arr.length-1];
		return arr2;
	}

}
