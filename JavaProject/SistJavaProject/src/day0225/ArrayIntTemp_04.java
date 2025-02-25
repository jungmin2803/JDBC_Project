package day0225;

public class ArrayIntTemp_04 {

	public static void main(String[] args) {
		// 배열안의 숫자 순서를 바꾸어 출력해보기
		
		int [] arr= {5,4,9,8,1,3,6,10};
		//출력
		System.out.println("원래순서 데이터 출력");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//거꾸로 데이터 변경				
		for(int i=0;i<arr.length/2;i++) //0~(총갯수/2)까지 1씩 증가 
		{
			int temp=arr[i]; 
			//만약 10개일때 0번과 9번을 바꾸는것
			arr[i]=arr[arr.length-1-i]; //배열(i번지)= 배열(배열의 총갯수-1)-i번지) -> i<배열의 총갯수/2만큼 반복
										//ex)만약 배열이 10일때, 배열(0번지)=배열(10-1-0번지)를 4만큼 반복한다
			arr[arr.length-1-i]=temp;   //(반복하면서 i번지가 1씩 증가 : ex)0번지 1번지...4번지)
		}		
		System.out.println("거꾸로 데이터 출력");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//오름차순(1 2 3...)
		//선택정렬: 가장작은 숫자를 앞으로 보내자
		
		//기준데이타는 0번부터 끝에서 두번째까지
		for(int i=0;i<arr.length-1;i++)
		{
			//비교하는 데이타는 기준 다음값부터 끝까지
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]>arr[j]) //오름차순 //if(arr[i]<arr[j]): 내림차순
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("오름차순 출력");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}



