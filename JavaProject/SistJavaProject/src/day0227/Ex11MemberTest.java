package day0227;

public class Ex11MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex11Member m1=new Ex11Member();
		Ex11Member m2=new Ex11Member();
		Ex11Member.ban="JAVA 4강의장";
		
		m1.setMemberData("손흥민", "남자", "서울시 강동구");		
		m2.setMemberData("김연아", "여자", "부산시 해운대구");		
		
		m1.getMemberData();
		m2.getMemberData();
	}

}
