package day0221;

import java.util.Scanner;

public class ForScanSum_09 {

	public static void main(String[] args) {
		/* Quiz 스캐너와 for문 을 이용한 합계 구하기
		 * 총 5개의 점수를 입력받아 1~100이 아닐경우 다시입력받을것
		 * 1번 점수:88
		 * 2번 점수:99
		 * 3번 점수:110
		 * 		잘못 입력했어요
		 * 3번 점수:77
		 * 4번 점수:44
		 * 5번 점수:-77
		 * 		잘못 입력했어요
		 * =====================
		 * 총점: ****
		 * 평균: **.**
		 */
		Scanner sc=new Scanner(System.in);
		
		double avg;
		int score;
		int cnt=0;
		int tot=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번 점수를 입력해주세요");
			score=sc.nextInt();			
			if(score<1||score>100) {
				System.out.println("잘못 입력했어요");
				i--;
				continue;
			}
			tot+=score;			
			cnt++;
		} avg=(double)tot/cnt;
		
		System.out.println("===============");
	      System.out.println("총점: "+tot);
		  System.out.printf("평균: %.2f",avg);
		
	}

}
