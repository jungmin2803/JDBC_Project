package day0219;

public class OperTest_05 {

	public static void main(String[] args) {
		// 비교(관계)연산자 : >,>=,<,<=,==,!=
		//논리 연산자: &&(and),||(or),!(not)
		
		int a=5,b=7,c=5;
		
		//결과값을 true,false
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b); //!= : a와 b가 같지않다
		System.out.println(a<b&&b>c); //&&(and)는 둘다 true여야 true로 나옴 하나라도 false면 false로 나온다
		System.out.println(a>b&&b>c); 
		System.out.println(a<b||b<c); //||(or)는 둘중에 하나만 true여도 true로 나온다
		
		boolean b1=false;
		
		System.out.println("a="+b1);
		System.out.println("b="+!b1);
		
		boolean b2=5>3;
		
		System.out.println("c="+b2);
		System.out.println("d="+!(5>8));
	}

}

