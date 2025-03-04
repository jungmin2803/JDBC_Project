package day0304;

class School{
	//인스턴스 선언
	private static final String SCHOOLNAME="쌍용고등학교";
	private String schoolAddr;
	private int contStu;
	private int contTeacher;
	
	//디폴트 생성자
	public School() {
		/*schoolAddr="강남구";
		contStu=200;
		contTeacher=15;
		*/
		this("강남구", 200, 15); //다른 생성자 호출 this()
	}
	//명시적 생성자
	public School(String addr,int cntS, int cntT) {
		this.schoolAddr=addr;
		this.contStu=cntS;
		this.contTeacher=cntT;		
	}

	//setter & getter
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getContStu() {
		return contStu;
	}

	public void setContStu(int contStu) {
		this.contStu = contStu;
	}

	public int getContTeacher() {
		return contTeacher;
	}

	public void setContTeacher(int contTeacher) {
		this.contTeacher = contTeacher;
	}
	
	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	
	//출력 메서드
	public void writeData()
	{
		System.out.println("학교주소 "+this.schoolAddr);
		System.out.println("학생수: "+this.contStu+", 선생님수: "+this.contTeacher);
	}

	
}
////////////////////////
class Student extends School{
	private String stuName;
	private int score;
	
	//디폴트생성자
	public Student() {
		//초기값 맘대로
	}
	
	//명시적 생성자
	public Student(String schoolAddr,int countStu, int countTeacher,String stuName, int score)
	{
		super(schoolAddr,countStu,countTeacher);
		this.stuName=stuName;
		this.score=score;
	}
	
	//setter & getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	//오버라이딩
	@Override
	public void writeData() {
		
		System.out.println("학교명: "+getSchoolname());
		super.writeData();
		System.out.println("학생명: "+stuName);
		System.out.println("성적: "+score);
		
	}
	
}
///////////////////////
public class Ex6InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		stu.writeData();
		
		Student stu1=new Student("강서구", 500, 40, "홍길동", 80);
		stu1.writeData();
		
		//수정
		stu.setStuName("이수연");
		stu.setScore(100);
		//다시 출력
		stu.writeData();
	}

}
