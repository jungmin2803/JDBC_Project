package day0224;

public class StringToArray_09 {

	public static void main(String[] args) {
		// 문자열을 분리하는 메서드 split
		
		String menu="피자,파스타,햄버거,쌀국수,분짜,비빔밥";
		
		System.out.println(menu);
		System.out.println("menu를 컴마로 분리해서 출력");
		String [] menuarr=menu.split(",");
		System.out.println("분리된 메뉴 갯수: "+menuarr.length);
		
		//출력
		System.out.println("출력#1_메뉴1:피자...");
		
		//for문
		for(int i=0;i<menuarr.length;i++)
		{
			System.out.println("메뉴"+(i+1)+":"+menuarr[i]);			
		}
		
		System.out.println();
		System.out.println("출력#2_menuarr을 가로로 전체출력_for~each");
		//for~each문
		for(String m:menuarr)
		{
			System.out.print(m+" ");
		}
		
	}

}
