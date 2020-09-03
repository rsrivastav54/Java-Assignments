package com.telstra.pack1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abbvba";
		palindrome(str);
	}

	private static void palindrome(String str) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}