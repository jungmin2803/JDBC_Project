package day0220;

public class ForTest_10 {

	public static void main(String[] args) {
		// for문 Quiz 	
		
		//1. 1~10까지 가로로 출력			
		for(int i=1;i<=10;i++) {
			System.out.printf(i+"  "); //결과 값: 1 2 3 4...10
		}
		System.out.println();
		

		//2. 10~1까지 숫자 가로로 출력		
		for(int i=10;i>=1;i--) {
			System.out.printf(i +"  "); //결과 값: 10 9 8 7...1
		}
		System.out.println();
		
		
		//3.Hello1 Hello2 Hello3 출력		
		for(int i=1;i<=3;i++) {
			System.out.printf("Hello"+i+"  "); //결과 값: Hello1  Hello2  Hello3
		}
		System.out.println();
		
		
		//4. 1,4,7,.....50까지 3의 배수 구하기		
		for(int i=1;i<=50;i+=3) {
			System.out.printf(i+"  "); //결과 값: 1 4 7 10 13...49
		}
		System.out.println();
		
		
		//5. 1 2 3 4 6 7 8 9 11....20까지중 5의 배수는 제외하고 출력
		for(int i=1;i<=20;i++) {
			
			//5의 배수는 빼고 출력
			if(i%5==0)
				continue; // continue를 사용하면 5의 배수는 출력하지 않고 for(int i=1;1<=20;i++) i++로 다시 돌아간다
			
			System.out.printf(i+"  "); //결과 값: 1 2 3 4 6 7 8 9 11...19
		}
		System.out.println();
		
		
		//6. Quiz 1~10까지의 숫자중 짝수만 출력
		
		//continue 사용하지 않고 for문만 사용한 버전
		for(int i=1;i<=10;i++) {
			if(i%2==0) //짝수
				System.out.printf(i+"  "); // 결과 값: 2 4 6 8 10
		}
		System.out.println();
		
		//continue 사용한 버전
		for(int i=1;i<=10;i++) {
			if(i%2==1) //홀수
				continue; //홀수는 출력하지 않고 다시 i++로 돌아가서 출력
		System.out.printf(i+"  "); //결과 값: 2 4 6 8 10
		}
		System.out.println();
		
		
	}

}
