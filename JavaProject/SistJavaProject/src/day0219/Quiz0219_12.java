package day0219;

import java.util.Scanner;

public class Quiz0219_12 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력하세요
		 * 4
		 * **if문**
		 * 4는 짝수
		 * **삼항연산자**
		 * 4는 짝수
		 */

		Scanner sc=new Scanner(System.in);
		
		//변수선언
		int x;
		String a;
		
		//입력
		System.out.println("숫자를 입력하세요");
		x=Integer.parseInt(sc.nextLine());
		System.out.println("**if문**");
		
		if(x%2==0)
			System.out.println(x+"는 짝수");
		//삼항연산자
		System.out.println("**삼항연산자**");
		a=x%2==0?"짝수":"홀수";
		
		System.out.println(x+"는 짝수");
		
		
		
	}

}
