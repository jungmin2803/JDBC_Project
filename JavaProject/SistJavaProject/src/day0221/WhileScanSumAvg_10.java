package day0221;

import java.util.Scanner;

public class WhileScanSumAvg_10 {

	public static void main(String[] args) {
		/*
		 * 점수(1~100)입력받다가 Q or q 입력시 빠져나온후 총갯수와 총점 평균 구하기
		 * 
		 * ex)
		 * 77
		 * 88
		 * -10
		 * 	다시입력바람
		 * 99
		 * 110
		 * 	다시입력바람
		 * 
		 * ===============
		 * 총갯수: 3
		 * 총점:**
		 * 평균:**,**
		 */
		Scanner sc=new Scanner(System.in);
		
		String score;
		int tot=0;
		int cnt=0;		
		double avg;
		
		while(true) {
			System.out.println("점수를 입력하세요(종료:0)");
			score=sc.nextLine();
			//종료
			/*if(score==0) {
				System.out.println("===========");
				break;			
			}*/
			//입력한 문자의 첫글자가 q나 Q면 반복문 빠져나가기
			if(score.charAt(0)=='Q'|| score.charAt(0)=='q') {
			System.out.println("================");
			break;
			}
			//continue
			/*if(score<1||score>100) {
				System.out.println("\t다시입력바람");				
				continue;
			}*/	
			if(Integer.parseInt(score)<1||Integer.parseInt(score)>100) {
				System.out.println("\t다시입력바람");
				continue;
			}
			cnt++;
			tot+=Integer.parseInt(score); //정수로 변환후 합계변수에 더하기

		} avg=(double)tot/cnt;
		System.out.println("총갯수: "+cnt);
		System.out.println("총점:"+tot);
		System.out.printf("평균: %.2f",avg);
			
		

	}

}
