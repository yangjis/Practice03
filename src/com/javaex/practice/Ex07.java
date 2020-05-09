package com.javaex.practice;

//숫자를 입력받아 피라미드 형태로 출력하기

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
