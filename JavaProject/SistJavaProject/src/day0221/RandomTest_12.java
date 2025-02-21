package day0221;

import java.nio.file.spi.FileSystemProvider;

public class RandomTest_12 {

	public static void main(String[] args) {
		// 자바에서 난수를 구하는 방법은 2가지
		// 1.Math.random() : Math라는 클래스 안에 있는 ramdom이라는 메소드를 이용하는 방법
		// 2.Random이라는 클래스를 생성하여 구하는 방법
		
		System.out.println("기본난수 5개발생");
		for(int i=1;i<=5;i++)
		{
			double a=Math.random(); //0.0XXXXX ~ 0.9XXXXX 1미만의 실수
			System.out.printf(a+" ");
		} 
		System.out.println();
		System.out.println("------------------------");
		
		
		System.out.println("0~9사이의 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10); //0~9
			System.out.printf(a+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		
		System.out.println("1~10사이의 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*10)+1; //Math.random 메소드의 기본 공식
			System.out.printf(a+" ");		
		}
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("1~100사이의 난수 5개 발생");
		for(int i=1;i<=5;i++)
		{
			int a=(int)(Math.random()*100)+1;
			System.out.printf(a+" ");
		}
		System.out.println();
		System.out.println("------------------------");		
		
		
		
	}

}
