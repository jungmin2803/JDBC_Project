package day0221;

import java.util.Scanner;

public class Test_00 {
	
	public static void quiz1() {//5번의 숫자를 양수 음수 상관없이 입력한후 각각 양수의 갯수와 음수의 갯수 구하기(For문 이용)
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
				
				int su,cnt1=0,cnt2=0;
				Scanner sc=new Scanner(System.in);
				for(int i=1;i<=5;i++) {
					System.out.print(i+": ");
					su=sc.nextInt();
				
					if(su>0)
						cnt1++;
					else
						cnt2++;
					
					
				} System.out.println("=================");
				  System.out.println("양수의 갯수: "+cnt1);
				  System.out.println("음수의 갯수: "+cnt2);
		
	}
		
		
	public static void quiz2() {//스캐너를 활용해서 나이를 구분(for문,if문)
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
		int su;
		while(true) {
			System.out.print("나이 입력: ");
			su=sc.nextInt();
			//종료조건
			if(su==0) 				
				break;			
			//나이별증가 조건
			if(su>=50)
				a++;
			else if(su>=30)
				b++;
			else if(su>0)
				c++;
			else
				if(su<0) {
					System.out.println("잘못 입력했습니다");
					continue;
				}
				System.out.println("=============");
		}		System.out.println("50세 이상: "+a+"명");
				System.out.println("30세 이상: "+b+"명");
				System.out.println("그이외: "+c+"명");
		
	}
		
	public static void quiz3() { //스캐너를 활용해서 나이를 구분(for문,삼항연산자)
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
					int su,i,a=0,b=0,c=0;					
					while(true) {
						System.out.println("나이를 입력해 주세요(종료:0)");
						su=sc.nextInt();
						if(su==0) 							
							break;			
						//삼항연산자(조건입력)
						i=su>50?a++:
						  su>30?b++:c++;
								
						
					} System.out.println("=============");
					  System.out.println("50세 이상: "+a+"명");
					  System.out.println("30세 이상: "+b+"명");
					  System.out.println("그이외: "+c+"명");
		
	}
	
	public static void main(String[] args) {
		// 
		//quiz1();
		//quiz2();
		//quiz3();
	}
}
	


