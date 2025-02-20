package day0220;

public class DoWhileTest_09 {

	public static void main(String[] args) {
		// dowhile문 과 while문의 비교
		
		//조건이 참값일동안 반복 수행 거짓값이 나오면 종료
		//선조건: 조건이 먼저
		int i=1;
		
		System.out.println("while문 결과");
		while(i>=5) //조건이 안맞으면 한번도 결과수행 안함
		{			
			System.out.printf(i++ +"  "); //출력후 증가 (결과값 : )
		}
		System.out.println();
		
		
		//do~while문 조건이 안맞아도 한번은 결과 수행
		System.out.println("do~while문 결과");
		
		i=1;
		do {						
			System.out.printf(i++ +" "); //선출력 후 증가
		}while(i>=5);
		System.out.println("종료"); //(결과값 : 1 종료)

	}

}
