package day0226;

public class Ex12InfoTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Info in1=new Ex12Info();
		//setter메서드를 이용한 값설정
		//setName이라는 setter메서드 이용해서 초기값 변경
		in1.setName("김연아");
		in1.setAge(25);
		
		//getter메서드를 이용한 값얻기
		
		String name=in1.getName();
		System.out.println(name);
		
		int age=in1.getAge();
		System.out.println(age);
		
	}

}
