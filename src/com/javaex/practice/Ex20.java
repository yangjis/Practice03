package com.javaex.practice;

import java.util.Scanner;

/*숨겨진 숫자를 맞추는 게임입니다.
프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
정답을 맞춘경우 “맞았습니다.” 출력됩니다.
게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
(y 인경우 다시 게임이 시작됩니다.)*/


public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("	[숫자 맞추기 게임 시작]");
		System.out.println("=================================");
		
		double randomValue = Math.random();
		int secretNum = (int)(randomValue * 100) + 1;
		int num;
		
		char nextGame = 'n'; 
		
		do {
			System.out.print(">>");
			num = scan.nextInt();
			
			if(num > secretNum) {
				System.out.println("더 낮게");
				
			}else if(num < secretNum) {
				System.out.println("더 높게");
				
			}else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				nextGame = scan.next().charAt(0);
				
				if(nextGame == 'n') {
					randomValue = Math.random();
					secretNum = (int)(randomValue * 100) + 1;
				}
				
			}
		}while(nextGame == 'n');
		
		System.out.println("=================================");
		System.out.println("	[숫자 맞추기 게임 종료]");
		System.out.println("=================================");
		
		scan.close();
		
	}

}
