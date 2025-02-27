package day0227;

public class Ex5ConstSetter {

	private String name;
	private int age;
	
	//생성자	//setter 역할까지 하는구나만 이해하면됨
	public Ex5ConstSetter(String name) {
		//this(name,44);//다른 생성자 
		this.name=name;				
	}
	
	public Ex5ConstSetter(String name,int age) {
		this.name=name;
		this.age=age;		
		System.out.println("이름: "+name+" 나이: "+age+"세 입니다");
	}
	
	//getter 메서드_호출용
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5ConstSetter ex5=new Ex5ConstSetter("고길동");
		Ex5ConstSetter ex6=new Ex5ConstSetter("홍길동", 109); //생성과 동시에 수정 //이름: 홍길동 나이: 109세 입니다
		//Ex5ConstSetter ex7=new Ex5ConstSetter(); 디폴트는 없으므로 에러
		System.out.println("이름은 "+ex5.getName()+"이고 나이는 "+ex5.getAge()+"세 입니다");
		System.out.println("이름은 "+ex6.getName()+"이고 나이는 "+ex6.getAge()+"세 입니다");
		
		System.out.println(ex5);//new로 객체 생성 할때만 생성자에 입력된 값 출력 가능 
								// setter 메서드의 역할까지 하는것이지, getter 메서드는 아니라서 시스템아웃으로는 출력 불가
	}

}
