package day0226;

public class Ex9cardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex9Card.width=10;
		Ex9Card.heigth=20;
		
		System.out.println(Ex9Card.width);
		System.out.println(Ex9Card.heigth);
		
		Ex9Card c1=new Ex9Card(); //인스턴스 변수_객체를 새로 지정해야 클래스를 불러와 값 변경 가능.(클래스명 참조변수명=new 클래스명)
		
		System.out.println(c1.kind); //null
		System.out.println(c1.number); //0
		
		//c2생성해서 heart,7로 변경
		
		Ex9Card c2=new Ex9Card();
		c2.kind="heart";
		c2.number=7;
		
		System.out.println(c2.kind);
		System.out.println(c2.number);
				
		//c3생성 diamond,9로 변경
		Ex9Card c3=new Ex9Card();
		c3.kind="diamond";
		c3.number=9;
		
		
		System.out.println(c3.kind+","+c3.number+","+Ex9Card.width+","+Ex9Card.heigth);
		System.out.println(c2.kind+","+c2.number+","+Ex9Card.width+","+Ex9Card.heigth);

	}

}
