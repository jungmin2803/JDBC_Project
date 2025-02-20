package day0220;

import java.util.Scanner;

public class CharAtTest_05 {

	public static void main(String[] args) {
		// index순서 01234567.....
		
		Scanner sc=new Scanner(System.in);
		
		String jumin;
		System.out.println("주민번호를 입력해주세요");
		jumin=sc.nextLine();
		
		
		char seventh=jumin.charAt(7);

		if(seventh=='1')
			System.out.println("남자입니다");
		else if(seventh=='2')
			System.out.println("여자입니다");
		else if(seventh=='3')
			System.out.println("2000년 이후 남자입니다");
		else if(seventh=='4')
			System.out.println("2000년 이후 여자입니다");
		else
			System.out.println("오류입니다");
		
	}

}
