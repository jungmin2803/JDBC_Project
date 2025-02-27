package day0227;

class YourInfo{

	
	String myName;
	static String Message;
	
}
//////////////////////////////
public class Ex7InfoTest {

	private String city; //사는지역 //private 같은 클래스에선 사용가능
	int age;
	
		
	public static void main(String[] args) {
		/*	
		 * [개인정보]	 
		 * 주민명: 민영기
		 * 메세지: 행복하게 살자
		 * 지역: 대전
		 * 나이: 23
		 * 
		 */
		YourInfo in1=new YourInfo();
		in1.myName="민영기";
		YourInfo.Message="행복하게 살자";
		
		Ex7InfoTest in2=new Ex7InfoTest();
		
		in2.city="대전";
		in2.age=23;
		
		System.out.printf("[개인정보]\n주민명: %s\n메세지: %s\n지역: %s\n나이: %s",in1.myName,YourInfo.Message,in2.city,in2.age);

	}

}
