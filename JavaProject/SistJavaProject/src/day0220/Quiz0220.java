package day0220;

import java.util.Scanner;

public class Quiz0220 {
	
	public static void quiz1() {
		//1부터 100까지의 숫자중 짝수합과 홀수합을 나누어 출력하시오
		//짝수의 합:***
		//홀수의 합:***
		
		int sum=0;
		int tot=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				sum+=i;			
			else 
				tot+=i;			
		}  System.out.println("짝수의 합: "+sum);
		   System.out.println("홀수의 합: "+tot);
				
		
			
		
	}
	
	public static void quiz2() {
		//합계를 더할 숫자를 입력하시오
		//숫자를 입력하면 1부터 입력한 숫자까지의 합계를 구해서 출력하시오
		
		//1부터 **까지의 합은 ***입니다
		Scanner sc=new Scanner(System.in);
		
		
		int su;		
		int sum=0; //합계 : 초기값=0; 곱셈 : 초기값=1;
		
		System.out.println("합계를 더할 숫자를 입력하시오");
		su=sc.nextInt();
		System.out.println("숫자를 입력하면 1부터 입력한 숫자까지의 합계를 구해서 출력하시오");
		
		for(int i=1;i<=su;i++) {
			sum+=i;
		} System.out.println("1부터 "+su+"까지의 합은 "+sum+"입니다");
		
	}
	
	public static void quiz3() {
		//**부터 ***까지의 곱은 ****입니다
		Scanner sc=new Scanner(System.in);
		int su,dan,i;
		int sum=1;
		
		System.out.println("두 수를 입력하면 두수 사이의 숫자가 곱해집니다");
		su=sc.nextInt();
		dan=sc.nextInt();
		i=su;
		for(;su<=dan;su++) {
			sum*=su;
		} System.out.println(i+"부터 "+dan+"까지의 곱은 "+sum+"입니다");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//quiz1();
		//quiz2();
		//quiz3();
	}

}
