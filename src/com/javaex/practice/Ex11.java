package com.javaex.practice;

/*a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
    - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )*/


import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		int sum = 0;
		
		if(num%2 == 0) {
			for(int i = 0; i <= num; i++) {
				if(i%2 == 0) {
					sum = sum + i;
				}
			}
		}else {
			for(int i = 0; i <= num; i++) {
				if(i%2 != 0) {
					sum = sum + i;
				}
			}
		}
		
		System.out.println("결과값: " + sum);
		
	}
}
