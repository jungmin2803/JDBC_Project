package day0221;

import java.util.Scanner;

public class Quiz0221 {

	public static void quiz1() {
		// 5번의 숫자를 양수 음수 상관없이 입력한후 각각 양수의 갯수와 음수의 갯수 구하기(For문 이용)
				/*
				 *  1: 10
				 *  2: -2
				 *  3: 20
				 *  4: -100
				 *  5: 99
				 *  =============
				 *  양수 갯수: 3개
				 *  음수 갯수: 2개
				 */
				
				Scanner sc=new Scanner(System.in);
				int cnt1,cnt2;
				int x=0,y=0;
				int su;
				for(int i=1;i<=5;i++) {
					System.out.println("숫자를 입력해 주세요");
					su=sc.nextInt();
					
					if(su>1) 
						x++;				
					else 
						y++;						
				}  cnt1=x; cnt2=y;
				   System.out.println("양수의 갯수: "+cnt1+"개");
		           System.out.println("음수의 갯수: "+cnt2+"개");
				
	}
	
	public static void quiz2() {
		/*
		 * 나이를 반복해서 입력받는다 0이되면 빠져나와 출력
		 * 나이가 50이상이면 a변수 증가
		 * 나이가 30이상이면 b변수 증가
		 * 나머지는 c변수 증가
		 * =================		
		 * 
		 * 나이입력: 53
		 * 나이입력: 47
		 * 나이입력: 66
		 * 나이입력: 35
		 * 나이입력: 11
		 * 나이입력: 12		 
		 * =================
		 * 50세 이상: 2명
		 * 30세 이상: 2명
		 * 그이외: 2명
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		int a=0,b=0,c=0;
		int x,y,z;
		int su;
		while(true)
		{	System.out.println("나이를 입력하세요(종료:0)"); //입력
			su=sc.nextInt();			
			if(su==0) {
				System.out.println("=============");
				break;
			}
			if(su>=50) 
					a++;				
			else if(su>=30) 
				b++;			
			else 	
				c++;			
			
		}	x=a; y=b; z=c;			
			System.out.println("50세 이상: "+x+"명");
			System.out.println("30세 이상: "+y+"명");
			System.out.println("그이외: "+z+"명");				
	}
		
	
	public static void main(String[] args) {
		//quiz1();
		quiz2();
	}

}
