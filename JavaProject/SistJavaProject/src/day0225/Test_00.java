package day0225;

public class Test_00 {

	public static void Quiz1() {
	
		//임의의 수를 로또변수에 발생시켜서 넣어준다
		
				int [] lotto=new int[6];
				
				for(int i=0;i<lotto.length;i++)
				{
					lotto[i]=(int)(Math.random()*45)+1;
					
					for(int j=0;j<i;j++)
					{//중복 제거
						if(lotto[i]==lotto[j])
						{
							i--;
							break;
						}
					}
				}
				//오름차순
				for(int i=0;i<lotto.length-1;i++)
				{
					for(int j=i+1;j<lotto.length;j++)
					{
						if(lotto[i]>lotto[j]) //i가 j보다 크다면 i는 임시저장소(temp)로 보내고,
											  //i보다 작았던 j를 비어있는 i로 보내고,
											  //비어있는 j에 임시저장소에 저장됬던 i값을 보낸다
						{ 
							int temp=lotto[i];
							lotto[i]=lotto[j];
							lotto[j]=temp;
						}
					}
				}
				System.out.print("로또 당첨 번호: ");
				for(int i=0;i<lotto.length;i++)
				{
					System.out.print(lotto[i]+" ");
				}
		
		
	}
	
	public static void Quiz2() {
		String [] stuNames= {"현승윤","김민규","유혜지","박용희","원주희","조태민","공찬혁"};
		
		for(int i=0;i<stuNames.length;i++)
		{
			System.out.print(stuNames[i]+" ");
		}
		
		//오름차순
		for(int i=0;i<stuNames.length-1;i++)
		{
			for(int j=i+1;j<stuNames.length;j++)
			{
				if(stuNames[i].compareTo(stuNames[j])>0)
				{
					String temp=stuNames[i];
					stuNames[i]=stuNames[j];
					stuNames[j]=temp;
				}
			}
		}
		System.out.println();
		
		//출력
		for(int i=0;i<stuNames.length;i++)
		{
			System.out.print(stuNames[i]+" ");
		}
		
		
	}
	public static void main(String[] args) {
		
		//Quiz1();
		Quiz2();
		
		

	}

}
