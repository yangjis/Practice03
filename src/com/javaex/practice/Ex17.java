package com.javaex.practice;

// 입력받은 숫자에서 별을 하나씩 줄여서 출력

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int x = num; x >= i ; x--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
