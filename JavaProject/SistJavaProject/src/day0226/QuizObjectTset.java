package day0226;

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
		
		QuizObject q1=new QuizObject();
		QuizObject q2=new QuizObject();
		QuizObject stu1=new QuizObject();
		QuizObject stu2=new QuizObject();
		
		stu1.stuName="손흥민";
		stu1.age=29;
		q1.setCity("부산");
		q1.setHobby("헬스");
		String city1=q1.getCity();
		String hobby1=q1.getHobby();
		
		stu2.stuName="김연아";
		stu2.age=26;
		q2.setCity("서울");
		q2.setHobby("여행");
		String city2=q2.getCity();
		String hobby2=q2.getHobby();
		
		QuizObject.processName="쌍용 교육센터 자바교육 4강의장";
		System.out.println(QuizObject.processName);
		System.out.println("=========================");
		System.out.println("학생1정보");
		System.out.println("이름: "+stu1.stuName+"\n나이: "+stu1.age+"\n지역: "+city1+"\n취미: "+hobby1);
		System.out.println();
		System.out.println("학생2정보");
		System.out.println("이름: "+stu2.stuName+"\n나이: "+stu2.age+"\n지역: "+city2+"\n취미: "+hobby2);
		
		
				

	}

}
