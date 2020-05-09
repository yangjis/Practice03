package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("합계: " + sum);
	}
}
