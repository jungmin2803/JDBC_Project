package day0221;

import java.util.Scanner;

public class Test_00 {

	public static void main(String[] args) {
		// 랜덤 메뉴 가챠
		
		Scanner sc=new Scanner(System.in);
		
		int su;
		while(true) {
			System.out.println("게임을 시작하겠습니까? Y/N");
			su=Integer.parseInt("y");
			int rnd=(int)(Math.random()*10)+1;
			if(rnd==1) {
				System.out.println("치킨");
				break;
		  }
			  else if(rnd==2){
					break;
			  }
			  else if(rnd==3){
					System.out.println("피자");
					break;
			  }
			  else if(rnd==4) {
					System.out.println("햄버거");
					break;
			  }
			  else if(rnd==5){
					System.out.println("족발");
					break;
			  }
			  else if(rnd==6){
					System.out.println("중식");
					break;
			  }
			  else if(rnd==7){
					System.out.println("양식");
					break;
			  }
			  else if(rnd==8){
					System.out.println("일식");
					break;
			  }
			  else if(rnd==9){
					System.out.println("한식");
					break;
			  }		
			  else  {
					System.out.println("찜");
					break;
		
			  }
		}
	}
}
	


