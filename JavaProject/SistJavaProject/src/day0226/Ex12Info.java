package day0226;

public class Ex12Info {
	
	private String name;	//private 캡슐 형태로 봉인
	private int age;      	

	//setter,getter 메서드를 worker 메서드 라고 한다
	//setter 메서드: 수정을 목적으로 사용_set변수명
	//getter 메서드: 조회(출력)할 목적으로 사용_get변수명_return결과값으로 지정
	
	//void :리턴이 없다는 의미
	public void setName(String name) //setter메서드는 인자값이 들어감(무엇을 수정할건데?)
	{
		this.name=name; //이름이 같으면 인스턴스 자신을 가르키는 this를 붙여야된다(this.의 의미는 인스턴스 자기자신을 의미)
		//name=myname; //this는 붙혀도 되고 이름이 달라서 구분되므로 안붙혀도 된다.
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	//getter 메서드: 조회(출력)할 목적으로 사용_get변수명_return결과값으로 지정
	public String getName() // 변환받을 return 타입 지정 // String
	{						
		return name;	   // return 받을 클래스명
	}
	
	public int getAge() // 변환받을 return 타입 지정 // int
	{
		return age;
	}
	
}
