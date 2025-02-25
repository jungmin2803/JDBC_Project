package day0225;

import java.util.Scanner;

public class ArrayStringIndex_02 {

	public static void main(String[] args) {
		// 이름을 입력하여 몇번째에 있는지, 아니면 우리반 학생이 아닌지 검색해 볼것
		// 반복해서 검색하다가 끝 이라고 하면 프로그램을 종료할것!!!
		String [] stu= {"손현정","박호준","유혜지","원주희","김기범","이창현","박용희","김민규","공찬혁"};
		
		Scanner sc=new Scanner(System.in);
		String stuName; //Scanner에 입력할 값
		boolean b; //찾는값이 있는지 없는지에 대한 변수(false,true)
		
		while(true)
		{
			System.out.println("검색할 이름을 입력하세요");
			stuName=sc.nextLine();
			//break문(무한루프 탈출)
			if(stuName.equals("끝"))
			{
				System.out.println("프로그램 종료");
				break;
			}
			
			b=false; // 결과값은 기본적으로 false(while문 안에서 입력)
			//배열[i] 찾으면 true 로 변경하는 반복문
			for(int i=0;i<stu.length;i++)
			{
				if(stuName.equals(stu[i])) //입력한 값이 배열안의 값과 일치하면 true
				{
					b=true;
					System.out.println(i+1+"번째 학생입니다");
				}				
			}
			
			if(!b) //입력한 값이 배열안에 없으면 false (while문 안에서 for문 밖에서 입력)
				System.out.println(stuName+"님은 우리반 학생이 아닙니다");
			
		}
	}
}
