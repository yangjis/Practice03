package com.javaex.practice;

// 구구단 출력

public class Ex08 {
	public static void main(String[] args){
		for(int x = 1; x <= 9; x++) {
			for(int y = 2; y <= 9; y++) {
				System.out.print(y + "*" + x + "=" + (y*x) + "		");
			}
			System.out.println();
		}
	}
}
