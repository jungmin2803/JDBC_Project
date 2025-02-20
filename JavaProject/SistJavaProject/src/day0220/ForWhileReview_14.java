package day0220;

public class ForWhileReview_14 {

	public static void sumTest1() { //for문을 이용하여 1~5까지의 합
		
		//for문으로 1~5까지 더하기
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		System.out.println("총합계는 "+sum+"입니다");
	}
	public static void sumTest2() { //for문을 이용하여 1~10까지중 홀수의 합
		//1~10까지중 홀수의 합 1 3 5 7 9
		int sum=0;
		for(int i=1;i<=10;i+=2) {
			sum+=i;		
		}
		System.out.println("홀수의 합: "+sum);
	}
	public static void sumTest3() { //for문을 이용하여 1~10까지의 합을 구하고 i를 결과값에 출력시켜라.
		
		int sum=0;
		int i;
		for(i=1;i<=10;i++) {
			sum+=i; //sum=sum+i;
		}
		System.out.println("1부터"+(i-1)+"까지의 합은"+sum); // i를 결과값에 출력 시키는방법 : for문 밖에 int i를 입력하고 출력문에 (i-1)를 입력한다.
														 // 출력문에 i만 입력하면 i<=10일때, i의 출력값은 11이 된다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sumTest1();		
		//sumTest2();
		sumTest3();
	}


}
