package day0221;

import java.util.Scanner;

public class GuguScan_07 {

	public static void main(String[] args) {
		// 원하는 구구단 입력하시오
		//5
		//5단만 출력하시오
		//0을 입력하면 종료
		
		Scanner sc=new Scanner(System.in);
		int dan;
		while(true) {
		System.out.println("원하는 구구단을 입력하시오(종료:0)");
		dan=sc.nextInt();
		
		//종료조건
		if(dan==0) {
			System.out.println("프로그램 종료");
			break;
		}
		
		//잘못 입력된 경우
		if(dan<2||dan>9) {
			System.out.println("잘못입력했어요 \n2단~9단까지만 입력해주세요");
			continue;
		}			
		
		//구구단출력
		System.out.println("["+dan+"단]"+"\n");
		
		 for(int j=1;j<=9;j++) {			
			 System.out.println(dan+"X"+j+"="+dan*j);
			}
			System.out.println();	
			
		}
							
	}

}
