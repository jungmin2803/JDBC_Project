package day0219;

import java.util.Scanner;

public class ReviewScan_01 {

	public static void main(String[] args) {
		/*
		 * 이름과 키 몸무게를 입력하면 입력한 데이터와 함께 
		 * 표준몸무게((키-100)*0.9)를 출력하시오
		 *
		 *  **손흥민님 신체정보**
		 *  키: 180cm
		 *  몸무게: 88kg
		 *  권장표준몸무게: 소수점1자리 kg으로 나타낼것
		 */
		//import
		Scanner sc=new Scanner(System.in);
		//변수선언
		String name;
		double height,weight,st_weight;
		
		//질문
		System.out.println("이름: ");
		name=sc.nextLine();
		System.out.println("키: ");
		height=Double.parseDouble(sc.next());
		System.out.println("몸무게: ");
		weight=Double.parseDouble(sc.next());

		st_weight=(height-100)*0.9;

		
		//출력
		
		System.out.printf("**%s님 신체정보**\n키: %1.0fcm\n몸무게: %1.0fkg\n권장표준몸무게: %1.1f",name,height,weight,st_weight);
		

	}

}
