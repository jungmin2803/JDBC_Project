package day0220;

import java.util.Scanner;

public class ReturnIfTest_04 {

	public static void main(String[] args) {
		// Return문을 활용하여 잘못된 상황에서 되돌아가는 방법
		
		Scanner sc=new Scanner(System.in);
		
		int score;
		System.out.println("점수입력(1~100)");
		score=sc.nextInt();
		
		//잘못입력한 경우 종료
		if(score<1 || score>100) {
			System.out.println("점수범위를 잘못입력했어요");
			return; //현재메인함수 종료	(가장가까운 함수를 종료)					
		}else 
			System.out.println("점수: "+score+"점");
		
			
			
		

	}

}
