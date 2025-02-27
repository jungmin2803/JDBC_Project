package day0226;

import day0219.Quiz0219_12;

public class QuizObjectTset {

	public static void main(String[] args) {
		/*
		 * 과정명: 쌍용 교육센터 자바교육 4강의장
		 * ================================
		 * 학생1정보
		 * 이름: 손흥민
		 * 나이: 29
		 * 지역: 부산
		 * 취미: 헬스
		 * 
		 * 학생2정보
		 * 이름: 김연아
		 * 나이: 26세
		 * 지역: 서울
		 * 취미: 여행
		 */
		
		//객체 생성
		QuizObject q1=new QuizObject();
		QuizObject q2=new QuizObject();
		
		
		q1.jb="학생1정보";
		q1.stuName="손흥민";
		q1.age=29;
		//set메서드 이용 수정
		q1.setCity("부산");
		q1.setHobby("헬스");
		//get메서드 이용 값얻기
		String city1=q1.getCity();
		String hobby1=q1.getHobby();
		
		q2.jb="학생2정보";
		q2.stuName="김연아";
		q2.age=26;
		//set메서드 이용 수정
		q2.setCity("서울");
		q2.setHobby("여행");
		//get메서드 이용 값얻기
		String city2=q2.getCity();
		String hobby2=q2.getHobby();
		
		//출력
		QuizObject.processName="쌍용 교육센터 자바교육 4강의장";
		
		System.out.println("과정명: "+QuizObject.processName);
		System.out.println("========================");
		System.out.println(q1.jb+"\n이름: "+q1.stuName+"\n나이: "+q1.age+"\n지역: "+city1+"\n취미: "+hobby1+"\n");		
		System.out.println(q2.jb+"\n이름: "+q2.stuName+"\n나이: "+q2.age+"\n지역: "+city2+"\n취미: "+hobby2);
	
		System.out.println();
		System.out.printf("%s\n이름: %s\n나이: %s\n지역: %s\n취미: %s\n\n",q1.jb,q1.stuName,q1.age,city1,hobby1);		
		System.out.printf("%s\n이름: %s\n나이: %s\n지역: %s\n취미: %s",q2.jb,q2.stuName,q2.age,city2,hobby2);
		
				

	}

}
