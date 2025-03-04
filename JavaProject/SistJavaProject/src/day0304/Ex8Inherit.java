package day0304;

//super(부모)
class Work{
	
	public void process(){
		System.out.println("아무 작업도 하지 않는다");
	}
}

//sub1(자식)
class Food extends Work{
	
	//오버라이딩
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**음식을 만드는 작업을 합니다**");
	}
}
//sub2(자식)
class Clean extends Work{
	
	//오버라이딩
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**청소를 담당합니다**");
	}
}



public class Ex8Inherit {

	public static void main(String[] args) {
		
		//그동안의 생성 패턴
		Food food=new Food();
		food.process();
		
		// 다형성으로 생성
		// 부모로 선언 자식으로 생성
		Work work;
		work=new Food();
		work.process();

		work=new Clean();
		work.process();
		
		
	}

}
