package day0225;

import java.util.Scanner;

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
	
	public static void Quiz3() {
		/*
		 * 성을 입력시 그 성씨를 가진 사람과 총인원수를 출력할것!!
		 * 종료라고 입력시 프로그램 종료
		 * 
		 * 검색할 성을 입력해주세요
		 * 손
		 * 3:손흥민
		 * 7:손미나
		 * 		총 2명 검색
		 * 검색할 성을 입력해주세요
		 * 전
		 * 전 씨성을 가진 연예인은 없습니다
		 * 검색할 성을 입력해주세요
		 * 종료
		 * 검색을 종료합니다
		 * 
		 */

		
		String [] celeb= {"공유","신민아","이정재","손흥민","이강인","이효리","이진","손미나"};
		String name;
		int cnt;
		boolean flag;
		
		Scanner sc=new Scanner(System.in);
		//반복문 
		while(true)
		{	//입력
			System.out.println("검색할 성을 입력해주세요");
			name=sc.nextLine();
			//종료선언 (무한루프종료)
			if(name.equals("종료"))
			{
				System.out.println("검색을 종료합니다");
				break;
			}	//초기값 설정
				flag=false;
				cnt=0;
				//배열 0번지~끝까지 반복
				for(int i=0;i<celeb.length;i++)
				{		//배열 첫글자를 가져와서 입력값과 비교				
						if(celeb[i].startsWith(name))
						{
							//입력값이 일치하면 출력
							flag=true;
							System.out.println(i+1+": "+celeb[i]); //몇번째 이름
							cnt++;
						}							
				}
				System.out.println("\t총 "+cnt+"명 검색");
			if(!flag)
			{
				System.out.println(name+"씨성을 가진 연예인은 없습니다");
			}			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		//Quiz1();
		//Quiz2();
		Quiz3();
		

	}

}
