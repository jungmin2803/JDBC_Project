package day0227;


class Jimgbo{
	
	private String name;
	private int age;
	private String job;
	private String hobby;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	//출력메서드
	public void writeJimgbo() {
		System.out.println("이름: "+this.name+", 나이: "+this.age+", 직업: "+job+", 취미: "+hobby);
	}
	
}

//////////////////////////////////////
 //2번째 객체 생성해서 setter이용 수정 getter이용 출력
public class Ex10ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jimgbo jb=new Jimgbo();
		jb.writeJimgbo();
		
		jb.setName("김연아");
		jb.setAge(33);
		jb.setJob("주부");
		jb.setHobby("여행");
		jb.writeJimgbo();
		
		Jimgbo jb1=new Jimgbo();
		jb1.setName("고길동");
		jb1.setAge(39);
		jb1.setJob("소드마스터");
		jb1.setHobby("노래");
		jb1.writeJimgbo();
	}

}
