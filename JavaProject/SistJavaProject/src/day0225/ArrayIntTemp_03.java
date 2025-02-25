package day0225;

public class ArrayIntTemp_03 {

	public static void main(String[] args) {
		// 정렬을 알기전에 순서바꾸기를 먼저 연습
		
		int a=10,b=20;
		System.out.println("a="+a+" b="+b);
		
		int temp; // temp: 임시 저장소(빈그릇) ex)a와 b의 값을 바꾸기 위해 임시로 값을 저장하는 장소 
		
		// 주스와 우유가 들어있는 각각의 컵안의 내용물을 서로 바꾸려고 한다. 
		// temp라는 빈컵을 이용해서 주스와 우유를 서로의 컵에 바꿔줄수있다.
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+" b="+b);
		
		//3개 이상은 배열로 테스트
		int [] nums= {9,3,6};
		
		for(int n:nums)
			System.out.print(n+" ");
		
		System.out.println("0번지와 2번지를 교환후 출력");
		
		int temp2=nums[0];
		nums[0]=nums[2];
		nums[2]=temp2;
		
		for(int n:nums)
			System.out.print(n+" ");
			
		
	}

}
