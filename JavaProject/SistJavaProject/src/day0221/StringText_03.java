package day0221;

import java.util.Scanner;

public class StringText_03 {

	public static void main(String[] args) {
		// equals, startswith, endwith사용
		// 김씨가 몇명인지
		Scanner sc=new Scanner(System.in);
		
		String name;
		int cnt=0;
		
		while(true)
		{
			System.out.println("이름을 입력해 주세요(종료=끝)");
			name=sc.nextLine();
			
			if(name.equals("끝")) { //문자열 같다(==)라는 뜻
				System.out.println("종료되었습니다");			
				break;
			}
			//조건
			if(name.startsWith("김")) //첫문자에서 입력한 변수를 찾아준다
				cnt++;
		}
		System.out.println("김씨 성을 가진 사람은 총:"+cnt+"명 입니다");

	}

}
