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
			if(search.equals("종료"))
			{
				System.out.println("검색을 종료합니다");
				break;
			}	// a="abcde"
				find=false;
				cnt=0;
				for(int i=0;i<celeb.length;i++)
				{		
						if(celeb[i].startsWith(search)) //비교해서 같다면 true
						{
							find=true;
							System.out.println(i+1+": "+celeb[i]);	
							cnt++;
						}
				}	
						System.out.println("\t"+"총 "+cnt+"명 검색");				
				//	
				if(!find)
				{
					System.out.println(search+"씨 성을 가진 연예인은 없습니다");
				}				
		}
	}
}
