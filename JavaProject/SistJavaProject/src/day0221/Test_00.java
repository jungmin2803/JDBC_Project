package day0221;

import java.util.Scanner;

public class Test_00 {

	public static void main(String[] args) {
		// 점수를 3번 반복해서 입력후 합계를 구하시오(1~100까지 입력할것!!!)
		// 1번째 점수를 입력하세요(1~100)
		// 해당범위를 벗어나면 잘못입력했습니다. 반복문진행하되 한번뺀다
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int su;
		for(int i=1;i<=3;i++) {
			System.out.println(i+"번째 점수를 입력하세요");
			su=sc.nextInt();
			if(su<0||su>100) {
				System.out.println("잘못입력했습니다");
				i--;
				continue;
			}
			sum+=su;
		} System.out.println("========");
		  System.out.println("점수의 합: "+sum);
		
	}

}
