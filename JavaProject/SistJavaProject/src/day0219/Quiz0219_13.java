package day0219;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Quiz0219_13 {

	public static void main(String[] args) {
		/*
		 * 입고된 상품명은?아이폰16
		 * 수량은?6
		 * 단가는?1100000
		 * ========================
		 * 아이폰 6개는 총 6600000 입니다
		 * (단 5개 이상은 10프로 DC 됩니다)
		 * ========================
		 * dc된 최종금액: 5940000원
		 */

		
		Scanner sc=new Scanner(System.in);
		
		//변수선언
		String name;
		int su,dan,tot,dc,ab;
		
		System.out.println("입고된 사움명은?");
		name=sc.nextLine();
		System.out.println("수량은?");
		su=Integer.parseInt(sc.nextLine());
		System.out.println("단가는");
		dan=Integer.parseInt(sc.nextLine());
		
		//계산
		tot=su*dan;
		dc=tot/10*9;
		System.out.println("======================");
		System.out.println(name+" "+su+"개는 총"+tot+"입니다");
		System.out.println("(단 5개 이상은 10프로 DC 됩니다)");
		System.out.println("======================");
		System.out.printf("dc된 최종금액: %d원\n",dc);
		
		System.out.println("**if문**");
		
		
		//if문
		if(su>5)
			dc=tot/10*9;
		else
			dc=tot;
		
		System.out.println("dc된 최종금액: "+dc+"원");
		
		//삼항연산자
		System.out.println("dc된 최종금액: "+(su>5?(tot/10*9):tot)+"원");
		
		
	}

}
