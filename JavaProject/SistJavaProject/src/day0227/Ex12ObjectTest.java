package day0227;

class Input {
	
	private String irum;
	private String juso;
	private int nai;
	
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	public int getNai() {
		return nai;
	}
	public void setNai(int nai) {
		this.nai = nai;
	}
	
	//3개의 멤버 변수를 한꺼번에 변경하는 메소드 setInputDatas
	public void setInputDatas(String irum, String juso, int nai) {
		
		/*this.irum=irum;
		this.juso=juso;
		this.nai=nai;*/
		this.setIrum(irum);
		this.setJuso(juso);
		this.setNai(nai);		
	}
	
	//3개의 멤버변수값을 한꺼번에 리턴
	public String getInputDatas()
	{
		String s="이름: "+irum+"\n주소: "+juso+"\n나이: "+nai;
		
		
		return s;
		
	}
}

///////////////////////////////////

public class Ex12ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in1=new Input();
		in1.setIrum("손흥민");
		in1.setJuso("서울시");
		in1.setNai(33);
		System.out.println("이름: "+in1.getIrum());
		System.out.println("주소: "+in1.getJuso());
		System.out.println("나이: "+in1.getNai());
		
		//3개의 메서드 한번에 출력
		Input in2=new Input();
		in2.setInputDatas("김연아", "부산시", 30);
		System.out.println(in2.getInputDatas());
	}

}
