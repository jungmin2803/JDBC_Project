package day0224;

public class ArrayIntTest_06 {

	public static void main(String[] args) {
		// 배열선언하면서 초기값들을 저장할수 있다(배열선언과 동시에 초기값 주는법) 
		
		int [] arr= {8,6,11,21,99,32,100,55,99}; // 공식 자료형 [] 배열명= {배열의 초기값}; //8이 0번지로 고정
		
		System.out.println("arr의 갯수: "+arr.length); //해당 배열의 총 갯수
		
		System.out.println("**출력방법1_for**"); //0: 8
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"번지의 초기값: "+arr[i]); // arr[i] --> 배열명[ ]안에 찾고 싶은 배열의 번지를 넣으면 해당 배열 출력(번지는0부터 시작)
		}
		
		
		System.out.println("**출력방법2_for~each**"); //8 6 ... 99
		
		for(int a:arr)// arr 이란 배열명에 있는 배열 값을 무조건 다 불러옴
		{
			System.out.println(a);
		}
		
		
	}

}
