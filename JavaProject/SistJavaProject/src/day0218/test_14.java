package day0218;

import java.util.Calendar;
import java.util.Scanner;

public class test_14 {

	public static void main(String[] args) {
		/*
		 * 키보드로 입력하고 출력을 다음과 같이 해보세요
		 * 변수는 마음대로
		 * 
		 * 당신의 이름은?
		 * 김사랑
		 * 당신의 출생년도는?
		 * 1997
		 * 당신의 직업은?
		 * =======================
		 * 김사랑님은 1997년생이며 28세입니다. 직업은 연예인입니다
		 */

		Calendar cal=Calendar.getInstance();
		Scanner sc=new Scanner(System.in);
		
		//변수선언
		String name,job;
		int age;
		
		
		//질문
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
		System.out.println("당신의 출생년도는?");
		age=Integer.parseInt(sc.nextLine());
		System.out.println("당신의 직업은");
		job=sc.nextLine();
		
		//계산
		int year=cal.get(cal.YEAR);
		int mybrityear=year-age;
		
		//출력
		System.out.printf("%s님은 %d년생이며 %d세입니다. 직업은 %s입니다",name,age,mybrityear,job);
		
		
		
	}

}
