package day0227;


class Const{ //클래스명과 생성자명은 같다.
	
	
	
	int num; //0
	
	//디폴트 생성자는 보이지 않지만 이미 존재한다
	
	//인자있는 생성자가 필요하다면 반드시 생성자를 만든다
	public Const(int num) {// () 안에있는 것을 인자라고 한다.
		this.num=num;
		System.out.println("인자있는 생성자 호출");
		
				
	}
	
	//인자있는 생성자를 만들면 디폴트 생성자는 없어짐-> 디폴트 생성자가 필요하다면 따로 만들어 줘야된다.
	public Const() { //디폴트 생성자 () 안에 아무것도 없는것
		
		num=100;
		System.out.println("나는 디폴트 생성자");
		
	}
	
	//메서드
	public int getNumber()
	{
		num=50;
		return num;
	}
	
}


///////////////////////////////////////
public class Ex2ConstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//인자있는 생성자 생성 //전달받을 값을 입력하여 초기화 //생성자 생성과 동시에 수정가능
		Const con1=new Const(300);
		System.out.println(con1.num);

		//디폴트 생성자 //기본값으로 초기화 //setter 메서드로 수정
		Const con2=new Const();
		//con2.num=200;
		System.out.println(con2.num);
		
		//메서드출력
		Const con3=new Const();		
		System.out.println(con3.getNumber());
		
		
	}

}
