package com.javaex.practice;

//세로로 1~10까지의 숫자를 출력하고 가로로는 세로 숫자를 시작으로 10자리를 출력

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
