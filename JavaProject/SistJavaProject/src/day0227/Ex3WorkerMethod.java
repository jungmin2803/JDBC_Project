package day0227;

class MyInfo{
	
	private String name;
	private int age;
	
	//setter 메서드
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	//getter 메서드..조회할 목적..반드시 return
	public String getName() //수정할 목적이 아니기 때문에 ()안에는 아무것도 작성하지않는다
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
}
///////////////////////////
public class Ex3WorkerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성(클래스 불러오기)
		MyInfo my1=new MyInfo();
		
		//set메서드로 수정
		my1.setName("이정민");
		my1.setAge(29);

		//get메서드로 값얻기
		String name=my1.getName();
		int age=my1.getAge();
		
		System.out.println(name);
		System.out.println(age);
		
	}

}
