package day0221;

import java.util.Scanner;

public class ForSumScan_08 {

	public static void main(String[] args) {
		// 점수를 3번 반복해서 입력후 합계를 구하시오(1~100까지 입력할것!!!)
		// 1번째 점수를 입력하세요(1~100)
		// 해당범위를 벗어나면 잘못입력했습니다. 반복문진행하되 한번뺀다
		
		Scanner sc=new Scanner(System.in);
		double avg;
		int cnt=0;
		int sum=0;
		int score;
		for(int i=1;i<=3;i++) {
			System.out.println(i+"번째 점수를 입력하세요");
			score=sc.nextInt();
			
			if(score<0||score>100) {								
				System.out.println("잘못입력했습니다");
				i--;
				continue;				
			}				
			sum+=score;	
			cnt++;
		}
		avg=(double)sum/cnt;
		System.out.println("=============");
		System.out.println("합계 :"+sum);
		System.out.printf("평균 :%.2f",avg);
		
	}

}
