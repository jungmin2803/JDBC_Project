package day0220;

public class ForTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i; //초기값
		for(i=1;i<=10;i++) {
			System.out.printf(i+"  ");			
		}
		System.out.printf("\n빠져나온후의 i값: "+i);
		System.out.println();
		
		// ex) 초기값을 반복문 밖에 주었을경우
		int a=10; //초기값
		for(;a<=50;a+=5) //초기값을 반복문 밖에 주었을 경우 생략가능(;은 써야한다)
			System.out.printf(a+"  ");
		System.out.printf("\n빠져나온후의 a값: "+a);
		
	}

}
