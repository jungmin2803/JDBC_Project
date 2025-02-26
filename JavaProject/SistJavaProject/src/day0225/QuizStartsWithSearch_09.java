package day0225;

import java.util.Scanner;

public class QuizStartsWithSearch_09 {

	public static void main(String[] args) {
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
		int cnt;
		Scanner sc=new Scanner(System.in);
		String search;
		boolean find;
		
		while(true)
		{
			System.out.println("검색할 성을 입력해주세요");
			search=sc.nextLine();
			
			//종료
			if(search.equals("종료"))
			{
				System.out.println("검색을 종료합니다");
				break;
			}	
				//초기값 설정
				find=false;
				cnt=0;				
				
				for(int i=0;i<celeb.length;i++)
				{		
						//비교해서 같다면 출력
						if(celeb[i].startsWith(search)) //배열에서 찾는 값의 첫글자가 입력값과 일치할때만 출력
						{
							find=true;
							System.out.println(i+": "+celeb[i]);	
							cnt++;
						}
				}		
						if(find) //find==true
							System.out.println("\t"+"총 "+cnt+"명 검색");				
							
						else //find==false		
							System.out.println(search+"씨 성을 가진 연예인은 없습니다");
							
				/* 위에 있는 if(find)와 다른방법
				if(cnt==0)
					System.out.println(search+"씨 성을 가진 연예인은 없습니다");
				else
					System.out.println("\t"+"총 "+cnt+"명 검색");
				*/
				
		}
	}
}
