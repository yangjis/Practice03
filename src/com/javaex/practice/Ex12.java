package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		int result = 1;
		
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("결과값: " + result);

	}
}
