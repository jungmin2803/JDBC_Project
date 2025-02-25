package day0224;

public class ArrayTest_04 {

	public static void main(String[] args) {
		// 배열선언.. 기본형배열은 객체로 인식
		
		int [] arr,arr2; //정수형의 옆에 배열 선언할건데 그 이름은 arr,arr2야
		arr=new int[3]; // 메모리 할당(3개의 정수에 대한 배열을 생성할거야)
		arr2=new int[5]; // 할당만 해도 값은 0으로 초기화
		
		//배열에 값넣기...초기화
		arr[0]=100;
		arr[1]=50;
		arr[2]=200;
	
		//배열의 갯수
		System.out.println("arr의 갯수: "+arr.length); //3
		System.out.println("arr2의 갯수: "+arr2.length); //5
		
		//출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("=============");
		
		//배열은 For문으로 출력
		for(int i=0;i<arr.length;i++) //배열은0부터 시작해서 0,1,2가 되는데 연산식에 <=arr.length로 사용하면 배열의 갯수(3)으로 출력하여 에러남.
		{
			System.out.print(arr[i]+" "); // 100 50 200
		}
		System.out.println();
		System.out.println("=============");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println((i+1)+": "+arr2[i]);
		}
		System.out.println("=============");
		
		//for~each문..arr
		System.out.println("arr을 for~each로 출력");
		for(int a:arr) //for(자료형 변수명:배열명) arr 이라는 배열을 a 라는 변수에 대입한다
		{
			System.out.println(a);
		}
		System.out.println("=============");
		
		System.out.println("arr2을 for~each로 출력");
		for(int a2:arr2)			
		{
			System.out.println(a2);
		}
		System.out.println("=============");
	}

}
