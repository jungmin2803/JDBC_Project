package day0304_1;

import day0304.Ex1SuperObj;

class SubObj extends Ex1SuperObj{
	
	private String addr;
	
	public SubObj(String name, int age,String addr) {
		
		super(name, age); //반드시 첫줄, 부모생성자 호출
		this.addr=addr;
		
	}
	
	//상속받을 부모클래스에 디폴트 생성자가 없으면 상속받는 자식 클래스도 디폴트 생성자 못만든다
	public SubObj() { 
		// super();가 생략되있다
		
	}

	//메서드
	public void writeData()
	{
		System.out.println("이름: "+this.name); //부모클래스에서 상속받은건 자식클래스에서 사용가능
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.addr);		
	}
	
	
}
///////////////////////////
public class Ex1TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubObj sub1=new SubObj("홍길동", 29, "서울시");
		sub1.writeData();
		
	}

}
