package day0225;

public class ArrayStringTemp_06 {

	public static void main(String[] args) {
		
		String [] stuNames= {"현승윤","김민규","유혜지","박용희","원주희","조태민","공찬혁"};
		
		System.out.println("**정렬전 출력**");
		
		for(int i=0;i<stuNames.length;i++)
		{
			System.out.print(stuNames[i]+" ");
		}
		System.out.println();
		
		//오름차순 출력
		//같으면 0반환, i>j 양수반환, i<j 음수반환
		//System.out.println("a".compareTo("c"));
		for(int i=0;i<stuNames.length-1;i++) //기준데이타는 처음부터 끝에서 2번째까지
		{
			for(int j=i+1;j<stuNames.length;j++) //비교하는 데이타는 기준 다음값부터 끝까지
			{
				if(stuNames[i].compareTo(stuNames[j])>0) //.compareTo 앞에 있는 값이 뒤에 값보다 크면 양수
				{										 // 양수일때만 자리 바꾸기 -> 오름차순
					String temp=stuNames[i];
					stuNames[i]=stuNames[j];
					stuNames[j]=temp;
				}
			}
		}
		System.out.println("**정렬후 출력**");
		
		for(int i=0;i<stuNames.length;i++)
		{
			System.out.print(stuNames[i]+" ");
		}
		System.out.println();
	}

}
