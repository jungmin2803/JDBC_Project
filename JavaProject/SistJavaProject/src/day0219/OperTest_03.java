package day0219;

import java.util.Scanner;

public class OperTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		
		System.out.println("두수를 입력해주세요");
		x=sc.nextInt();
		y=sc.nextInt();

		
		
		//산술연산자로 출력
		System.out.println("더하기="+(x+y));
		System.out.println("빼기="+(x-y));
		System.out.println("곱하기="+(x*y));
		System.out.println("나누기="+(double)(x/y));
		System.out.println("나머지="+(x%y));
		
		
		int c=x+y;
		double d=c/2.0; // .0을 붙여줘야 나누기 할때 소수점 숫자가 표시된다
		System.out.printf("평균= %.1f",d); //평균= 4.5
	}

}
