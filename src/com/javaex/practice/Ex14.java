package com.javaex.practice;

//1부터 입력받은 숫자까지 더하기

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			
			if(i < num) {
				System.out.print(" + ");
			}
			
			sum = sum + i;
		}
		System.out.println();
		System.out.println("함계: " + sum);
	}
}
