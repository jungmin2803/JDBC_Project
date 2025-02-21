package day0221;

import java.util.Scanner;

public class WhileSumAvg_02 {

	public static void main(String[] args) {
		// 임의의 숫자를 입력하여 합계, 평균, 입력한 개수를 구한다
		// 단0을입력하면 반복문을 빠져나간다
		
		Scanner sc=new Scanner(System.in);
		
		int su; //입력할수
		int sum=0; //합계
		double agv=0; //평균
		int cnt=0; //갯수: 평균을 구하려면 갯수가 필요하다
		
		while(true) {
			System.out.println("숫자를 입력하세요(종료:0)"); // while문 안에 입력해야 질문을 반복해서 출력함.
			su=sc.nextInt();
			
			//무한루프에 안빠지려면 반드시 break문이 필요
			if(su==0)
			{
				System.out.println("종료합니다");
				break; // 반복문을 완전히 벗어남
			}			
			sum+=su;
			cnt++; //갯수 1증가
			
		}
			agv=(double)sum/cnt; //완전히 정해진 합계와 갯수를 작성하기 위해선 while문을 빠져나와서 평균을 구해야 된다
		
		System.out.println("총 입력한 갯수: "+cnt);
		System.out.println("입력한 수의 합: "+sum);
		System.out.printf("평균: %.2f",agv);
		
		

	}

}
