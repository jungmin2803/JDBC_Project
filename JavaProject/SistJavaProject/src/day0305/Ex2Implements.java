package day0305;

interface InterWork{
	
	public void work(); //{}구현부가 없는 미완의 메서드
}

interface InterFood{
	public void order();
	public void bedal();
}
//
//자바클래스(인터페이스)는 다중구현이 가능
class interImpl implements InterWork,InterFood{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("음식 주문을 합니다");
		
	}

	@Override
	public void bedal() {
		// TODO Auto-generated method stub
		System.out.println("음식 배달을 합니다");
	}		
					
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("페인팅 작업을 합니다");
	}
	
}

public class Ex2Implements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자식클래스 생성
		interImpl in1=new interImpl();
		in1.order();
		in1.bedal();
		in1.work();
		
		//다형성
		System.out.println("다형성_부모로 선언하고 자식으로 생성**");
		InterWork in2=new interImpl();
		in2.work();
		
		InterFood in3=new interImpl();		
		in3.order();
		in3.bedal();
		
		
		
	}

}
