package com.telstra.pack1;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is armstrong or not : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			nod++;
			temp /= 10;
		}
		temp = n;
		int sum = 0;
		while (temp != 0) {
			int digit = temp % 10;
			temp /= 10;
			sum += Math.pow(digit, nod);
		}
		if (sum == n) {
			System.out.println(n + " is an Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}
	}

}
