package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			for(int x = i; x <= i + 9 ;x++) {
				System.out.print(x + "		");
			}
			
			System.out.println();
		}
	}
}
