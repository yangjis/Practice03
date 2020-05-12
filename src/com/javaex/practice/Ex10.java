package com.javaex.practice;

//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.


import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int big = 0;
		
		System.out.println("숫자를 입력하시오");

		for(int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if(num > big) {
				big = num;
			}
			
		}
		
		System.out.println("최대값은 " + big + "입니다.");

		scan.close();
	}
}
