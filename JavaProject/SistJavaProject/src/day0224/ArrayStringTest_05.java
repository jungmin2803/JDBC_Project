package day0224;

public class ArrayStringTest_05 {

	public static void main(String[] args) {
		// 문자배열 선언및 초기화
		String [] str;
		str=new String[5]; //5개의 주소값 할당 초기값 지정안해도 null로 초기화
				
		//초기값 지정안하고 출력
		for(int i=0;i<str.length;i++) //for문으로 배열의 값을 구하는 식
		{
			System.out.println(i+":"+str[i]); //결과 0:null 1:null ... 배열의 갯수만큼 출력(초기값을 지정하지 않아 null 로 출력됨)
		}
		
		//초기값 지정
		str[0]="원주희";
		str[1]="유혜지";
		str[2]="조태민";
		str[3]="박용희";
		str[4]="김희찬";
		//초기값 지정 출력
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println();
		
		//For~each로 배열 출력 (자료형 변수형 배열명)
		for(String a:str)
		{
			System.out.println(a);
		}
	}

}
