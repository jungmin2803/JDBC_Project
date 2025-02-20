package day0220;

public class ForWhileTest_07 {

	public static void main(String[] args) {
		// 1~10까지를 반복출력 while문..초기값,증감식,비교문
		//반복문은 초기값,조건식,증감식 필요
		
		int n=0;
		
		while(n<10) {
			n++;
			System.out.printf("%4d",n);
		}
		System.out.println();
		
		//다른방법
		n=0;		
		while(n<10)		{
			System.out.printf("%4d",++n);
		}
		System.out.println();
		
		//다른방법_조건없음
		n=0;
		while(true) 
		{
			System.out.printf("%4d",++n);
			//break문이 없을시 무한루프 break문은 반드시 if문으로 줘야된다
			if(n==10)
				break;
		}
		System.out.println();
		
		//for문
		for(int i=1;i<=10;i++) {
			System.out.printf(i+"  ");
		}

	}

}
