package com.prac.application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String J = scan.nextLine();
		String S = scan.nextLine();
		
		int count = 0;
		 
		for (int i = 0; i < S.length(); i++) {
			for (int k = 0; k < J.length(); k++) {
				if (S.charAt(i) == (J.charAt(k))) {
					count++;
				}
			}
		}
	
	
		System.out.println(count);
	}
}