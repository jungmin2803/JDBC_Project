package day0225;

import java.util.Scanner;

public class ArrayIntIndex_01 {

	public static void main(String[] args) {
		// 숫자배열중에서 내가 입력한 숫자가 있는지 있다면 몇번째에 있는지 찾아보자 0입력시 종료
		
		int [] nums= {5,65,44,49,30,110,889,100,42,75,32,19,52,36,55,66,33,42};//0~17
		
		//System.out.println(nums.length);
		
		Scanner sc=new Scanner(System.in);
		int su;
		boolean flag; //숫자가 있는지 없는지에 대한 변수 (false,true)
		
		
		while(true)
		{
			System.out.println("검색할 숫자를 입력하세요(종료:0)");
			su=sc.nextInt();
			
			//종료조건
			if(su==0)
			{	
				System.out.println("숫자 검색을 종료합니다");
				break;
			}
			
			flag=false; //찾으면 true로 변경 (while문 안에서 작성해야 됨)
			for(int i=0;i<nums.length;i++)
			{
				//true로 변경될 조건
				if(su==nums[i]) //입력한 값을 배열에서 찾은경우 --> flag는 true
				{
					flag=true;
					System.out.println(i+1+"번째에서 검색됨");
					
				}				
			}
			if(!flag) //flag==false (실제 값을 찾지 못한경우, while문 안에서, for문 밖에서 작성해야 됨)
						System.out.println(su+"는 데이터에 없습니다");
		}

	}

}
