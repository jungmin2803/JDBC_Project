package day0220;

import java.util.Scanner;

public class Quiz0220 {
	
	public static void quiz1() {
		//1부터 100까지의 숫자중 짝수합과 홀수합을 나누어 출력하시오
		//짝수의 합:***
		//홀수의 합:***
		
		int sum=0;		
		for(int i=1;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("홀수의 합: "+sum);
		for(int i=1;i<=100;i+=2) {
			sum+=1;
			continue;
		} System.out.println("짝수의 합: "+sum);	
		
	}
	
	public static void quiz2() {
		//합계를 더할 숫자를 입력하시오
		//숫자를 입력하면 1부터 입력한 숫자까지의 합계를 구해서 출력하시오
		
		//1부터 **까지의 합은 ***입니다
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int b;		
		int sum=0;
		
		System.out.println("합계를 더할 숫자를 입력하시오");
		b=sc.nextInt();
		System.out.println("숫자를 입력하면 1부터 입력한 숫자까지의 합계를 구해서 출력하시오");
		
		for(;i<=b;i++) {
			sum+=i;
		} System.out.println("1부터 "+b+"까지의 합은 "+sum+"입니다");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//quiz1();
		quiz2();
	}

}
