package day0228;

import java.nio.file.spi.FileSystemProvider;

class StuInfos{
	private String stuName;
	private String mbti;
	private int age;
	
	//3가지 인자 초기화하는 명시적 생성자
	public StuInfos(String name, String mbti, int age) {
		this.stuName=name;
		this.mbti=mbti;
		this.age=age;		
	}
	
	//제목메서드 showTitle 이름	mbti 나이
	public static void showTitle()
	{
		System.out.println("이름\t\tmbti\t\t나이");
		System.out.println("=======================================");
	}
	
	//출력 showInfo      이름 mbti 나이
	public void showInfo()
	{	
		System.out.println("이름: "+stuName+"\tmbti: "+mbti+"\t나이: "+age);
	}
}

public class Ex10ArrQuiz {

	public static void main(String[] args) {
		// 클래스 배열로 생성과 동시에 3명 초기화(이름,mbti,나이 는 자유
		
		//총 3명의 정보를 출력합니다
		//타이틀 호출
		//출력문 호출

		StuInfos [] stu= {
				new StuInfos("김민지", "ENFP", 33),
				new StuInfos("홍길동", "ISTJ", 29),
				new StuInfos("고길동", "ENTJ", 39)
		};
		
		System.out.println("총 "+stu.length+"명의 정보를 출력합니다");
		
		StuInfos.showTitle();
		//출력
		for(int i=0; i<stu.length;i++)
		{
			stu[i].showInfo();
		}
		
		
		
	}

}
