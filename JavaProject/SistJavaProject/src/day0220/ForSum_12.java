package day0220;

public class ForSum_12 {

	public static void main(String[] args) {
		// 1~10까지의 반복문으로 합 구하기_for
		
		
		int sum=0; //합해야 되는 초기값은 무조건 0이여야한다	
		for(int i=1;i<=10;i++) 
		{			
			sum+=i;//sum=sum+i (증감식)
		} 
		 System.out.println("1~10까지의 합은"+sum+"입니다");

		
		 
		 //1~10까지의 반복문으로 합 구하기_while
		 int tot=0; //합해야 되는 초기값은 무조건 0이여야한다
		 int i=1;   //while: 초기값이 밖에 있다.
		 while(i<=10) { //조건식
			 //합계변수에 i를 누적시킨다
			 tot+=i; // tot+=i; //증감식
			 i++; //증감식
		 }
		System.out.println("1~10까지의 합은"+tot+"입니다");
		
		
		//반복문으로 1~20까지의 합을 구하되 2씩 증가한다.(1 3 5 7 ....)_for
		int total=0;
		for(int y=1;y<=20;y+=2) { //(초기값;조건문;증감식)
			total+=y; //total=total+y; (증감식)
		}
			System.out.println("1~20까지의 합은"+total+"입니다");
			
		//Q. 1 2 4 5 7 8 10 : continue이용
			for(int b=1;b<=10;b++) {
				if(b%3==0) //배수를 구할때 사용
					continue;
				System.out.printf(b+"  ");
			}
			
					
	}

}
