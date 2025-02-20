package day0220;

import java.util.Scanner;

public class ReviewIfScan_01 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력하세요
		 * 홍길동
		 * 정보처리기사 3과목의 점수를 입력하세요(a,b,c)
		 * 88 77 39
		 * ===============
		 * 3과목의 평균: **.**점
		 * ======================
		 * **합격조건: 평균이60점이상이고 각과목이 모두 40점이상이면 합격**
		 * ==============================================
		 * 홍길동님은 불합격입니다
		 */

		Scanner sc=new Scanner(System.in);
		//변수선언
		String name;
		int a,b,c,tot;
		double agv;
		
		//입력
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("정보처리기사 3과목의 점수를 입력하세요(a,b,c)");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("======================");
		
		//계산
		tot=a+b+c;
		agv=tot/3.0;
		
		System.out.println("======================");		
		System.out.printf("3과목의 평균: %.2f점\n",agv);
		System.out.println("**합격조건: 평균이60점이상이고 각과목이 모두 40점이상이면 합격**");
		System.out.println("====================================================");
		
		//if문
		if(agv>=60&&a>=40&&b>=40&&c>=40) {
			System.out.println(name+"님은 합격입니다.");
		}	else {
			System.out.println(name+"님은 불합격입니다.");
		}
			
		//삼항연산자
		System.out.println(name+"님은 "+(agv>=60&&a>=40&&b>=40&&c>=40?"합격":"불합격")+"입니다.");
		
	}

}
