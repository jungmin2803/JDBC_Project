package day0224;

import java.util.Random;

public class RandomTest_02 {

	public static void main(String[] args) {
		// 자바에서 난수를 구하는 방법
		// Math.random()
		//Random 이라는 클래스를 생성해서 구하는 방법
		Random r=new Random(); //Random 클래스 import 추가
		
		System.out.println("기본난수"); 
		for(int i=1;i<=5;i++)
		{
			double n=r.nextDouble();
			System.out.print(n+" "); 
		}
		System.out.println("\n==============");
		
		System.out.println("0~99사이의 난수5개발생");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(100); //꼭 알아두기
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("==============");
		
		
		System.out.println("1~10사이의 난수5개발생");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(10)+1; //꼭 알아두기
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("==============");
		
		//Random클래스
		System.out.println("65~90사이의 난수10개발생(랜덤 클래스)");
		for(int i=1;i<=10;i++)
		{
			int n=r.nextInt(26)+65; // 시작하는곳이 +65가 된다 (26)은 65에서 26을 더한 숫자까지라는 의미
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("==============");

		//Math.random()
		System.out.println("65~90사이의 난수10개발생(랜덤 메소드)");
		for(int i=1;i<=10;i++)
		{
			int n=(int)(Math.random()*26)+65; // 시작하는곳이 +65가 된다 (26)은 65에서 26을 더한 숫자까지라는 의미
			System.out.print(n+"  ");
		}
		System.out.println();
		System.out.println("==============");
		
		//Random()
		System.out.println("65~90사이의 난수5개발생(A~Z의 대문자)");
		for(int i=1;i<=10;i++)
		{
			int n=r.nextInt(26)+65;
			System.out.print((char)n+"  "); //char를 이용해서 아스키코드를 가져옴
		}
		System.out.println();
		System.out.println("==============");
	}

}
