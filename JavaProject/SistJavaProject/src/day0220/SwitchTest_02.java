package day0220;

public class SwitchTest_02 {

	public static void main(String[] args) {
		// switch이용예제
		
		int n=2;
		
		switch(n) {
		case 1:
			System.out.println("n is 1");
			break; //break가 없을경우 끝까지 실행
		case 2:
			System.out.println("n is 2");
			break;
		case 3:
			System.out.println("n is 3");
			break;
		default:
			System.out.println("n 은 3보다 크다");
			break;			
		}
			

		
		//예제2 문자열도 된다.
		char ch='B';
		
		switch(ch) {
		case 'A' :
			System.out.println("apple");
			break;
		case 'B' :
			System.out.println("banana");
			break;
		default :
			System.out.println("다른과일 입니다");
			break;
		}
		
		
		//학점을 switch문으로 바꿔서 출력
		
		int score=59;
		char grade;
		
		switch(score/10) {
		case 10: case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default :
			grade='F';
			break;
		}
		System.out.println(score+"==>"+grade);
		
		int num=4;
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
		
		
		
		
		
	}

}
