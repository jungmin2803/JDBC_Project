package day0304;

//호출
public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2Manager ma=new Ex2Manager("손흥민", 2000000, "경영기획부");
		System.out.println(ma.getEmp()); //재정의된 메서드가 호출된다
	}

}
