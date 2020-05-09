package com.javaex.practice;

import java.util.Scanner;

//입력받은 숫자에서 별을 하나씩 줄여서  출력하고 다시 입력받은 숫자만큼 별을 하나씩 늘려서 출력.

public class Ex18 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int x = num; x >= i ; x--) {
				System.out.print("*");
				
				if(i == num) {
					System.out.println();
					
					for(int y = 1; y <= num; y++) {
						for(int z = 1; z <= y; z++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
			}
			System.out.println();
		}
		
	}

}
