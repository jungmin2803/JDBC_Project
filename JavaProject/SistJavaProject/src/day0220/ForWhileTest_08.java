package day0220;

public class ForWhileTest_08 {

	public static void main(String[] args) {
		// 10 9 8 7 ....0
		
		for(int i=10;i>=0;i--) 
		{
			System.out.printf(i+"  ");
		}
			System.out.println();
			
		//while
		int a=10;
		while(a>=0)
		{
			System.out.printf(a--+" ");//초기값을 출력후 하나감소 10 9 8 7...0			
			
		}
		System.out.println();
		
		  a=10;
		while(a>=0)
		{
			System.out.printf(--a+" ");//초기값부터 하나감소 10 9 8 7...-1		
			
		}
		System.out.println();
		
		//54321을 for문으로 출력해보세요
		for(int i=5;i>=1;i--) //for문 ( ) 안에서 int i를 반복으로 써도 된다.
			System.out.printf(i+"  ");		
		
	}

}
