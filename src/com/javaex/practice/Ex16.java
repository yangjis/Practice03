package com.javaex.practice;

//숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			if(i%5 == 0) {
				count ++;
				sum = sum + i;
			}
		}
		System.out.println("5의배수의 개수: "+count);
		System.out.println("5의배수의 합: " + sum);
	}
}
