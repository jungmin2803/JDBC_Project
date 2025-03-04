package day0304;

class point{
	int x;
	int y;
	
	//디폴트생성자
	public point() {
		System.out.println("Super_디폴트 생성자 호출");
	}
	//명시적생성자
	public point(int x, int y) {
		System.out.println("Super_인자값 있는 명시적 생성자 호출");
		this.x=x;
		this.y=y;
	}
	//출력 메서드
	public void write() 
	{
		System.out.println("x좌표= "+x+", y좌표= "+y);
	}
}
///////////////////point 상속받기, 부모의 생성자 2개받기, 메서드 오버라이딩
class subpoint extends point{
	
	String msg;
	
	public subpoint() { //부모 디폴트생성자 호출
		// TODO Auto-generated constructor stub
	}
	
	public subpoint(int x, int y, String msg) //부모 명시적생성자 호출
	{
		super(x,y);
		this.msg=msg; //초기화
	}

	//오버라이딩
	@Override
	public void write() { //부모의 출력 값 호출, 자식의 출력 값 추가 입력
		
		super.write();
		System.out.println("오늘의 메세지: "+msg);
	}
}





public class Ex3SuperSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subpoint sp=new subpoint();
		sp.write();
		
		subpoint sp1=new subpoint(10, 20, "Hi~");
		sp1.write();
		
	}

}
