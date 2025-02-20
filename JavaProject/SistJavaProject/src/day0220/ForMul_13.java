package day0220;

import java.net.MulticastSocket;
import java.util.Scanner;

public class ForMul_13 {

	public static void main(String[] args) {
		// 팩토리얼 1!=1  2!=2  3!=6  4!=24  5!=120  6!=720
		// Q. 1~10까지 팩토리얼 구하기
		
		int result=1;
		for(int i=1;i<=10;i++) {
			result*=i;
			System.out.println(i+"!="+result);
		}
			System.out.println();
			
			
			//Q. 숫자를 입력하면 입력한 수의 팩토리얼 구하기
			Scanner sc=new Scanner(System.in);
			
			int su,re=1;			
			
			
			System.out.println("숫자를 입력하세요");
			su=sc.nextInt();
			for(int i=1;i<=su;i++) {
				re*=i;                        //{ } 안에 출력문을 작성하면 1!=1 2!=2 3!=6..으로 출력
			} System.out.println(su+"!="+re); //{ } 밖에 출력문을 작성해야 빠져나와서 결과 값만 출력
			
				
	}

}
