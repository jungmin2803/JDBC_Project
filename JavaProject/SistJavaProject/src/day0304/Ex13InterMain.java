package day0304;

interface GameA{
	
	public void play();
}
interface GameB{
	
	public void stop();
}
class MyGame implements GameA,GameB{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("게임을 중지합니다");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("게임을 시작합니다");
	}
	
	
}
public class Ex13InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인에서 2개의 메서드 호출해서
		//1.일반객체생성방법 
		//게임을 시작합니다 
		//게임을 중지합니다
		//2.다형성객체생성방법
		//게임을 시작합니다 
		//게임을 중지합니다
		System.out.println("1. 일반객체생성방법");
		MyGame mg=new MyGame();
		mg.play();
		mg.stop();
		
		System.out.println("2. 다형성객체생성방법");
		GameA gA=new MyGame();
		gA.play();
		GameB gB=new MyGame();
		gB.stop();
	}

}
