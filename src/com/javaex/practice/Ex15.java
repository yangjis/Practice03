package com.javaex.practice;
//입력받은 숫자의 약수를 모두 출력
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++){
			if(num%i == 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
