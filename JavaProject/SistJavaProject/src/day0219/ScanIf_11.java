package day0219;

import java.util.Scanner;

public class ScanIf_11 {

	public static void main(String[] args) {
		// 이름과 java,jsp,spring 점수를 입력후
		//평균이 80이상이면 "참잘함",70이상이면 "노력하세요",70미만은 "불합격"
		//이름입력==>손흥민
		//java,jsp,spring 과목점수를 차례로 입력하세요
		//점수입력
		//88,77,66
		//손흥민님의 시험결과
		//총점: 점
		//평균: 점(소수점1자리)
		//평가: 노력하세요
		
		Scanner sc=new Scanner(System.in);
		
		//변수선언
		String name,a;
		int java,jsp,spring,tot;
		double avg;
		
		System.out.println("이름입력==>");
		name=sc.nextLine();
		System.out.println("java,jsp,spring 과목점수를 차례로 입력하세요");
		java=sc.nextInt();
		jsp=sc.nextInt();
		spring=sc.nextInt();
		
		//계산
		tot=java+jsp+spring;
		avg=tot/3;
		
		
		
		
		//출력
		System.out.println(name+"님의 시험결과");
		System.out.println("총점: "+tot+"점");
		System.out.printf("평균:%.1f\n",avg);
		
		//if문
		if(avg>80)
			a="참잘함";
			else if(avg>70)
				a="노력하세요";
			else
				a="불합격";
		//if문 출력
		System.out.println("평가:"+a);
					
				
		
		//삼항연산자 출력
		System.out.println("평가:"+(avg>=80?"참잘함":avg>=70?"노력하세요":"불합격"));

			
		
		
		
		
	}

}
