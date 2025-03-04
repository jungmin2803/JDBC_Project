package day0227;

public class QuizShop {
	
	static int cnt=0;
	static String sjName;
	private String spName;
	private int su;
	private int dan;
	
	//setter 메서드
	public void setSpName(String spName) {
		this.spName = spName;
	}
	
	public void setSu(int su) {
		this.su = su;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	//getter 메서드
	public String getSpName() {
		return spName;
	}

	public int getSu() {
		return su;
	}

	public int getDan() {
		return dan;
	}
	
	//디폴트 생성자
	public QuizShop() {
	// TODO Auto-generated constructor stub
	}
	
	
	//명시적 생성자 //생성과 동시에 초기값 지정
	public QuizShop(String spName, int su, int dan)
	{
		this.spName=spName;
		this.su=su;
		this.dan=dan;
	}

	//명시적 set 메서드 // 디폴트 생성자 생성 , 초기값 따로 지정
	public void setQuizShop(String spName, int su, int dan)
	{
		this.spName=spName;
		this.su=su;
		this.dan=dan;
	}
	
	//출력
	public void getQuizShop()
	{	cnt++;
		System.out.println("입고물품"+cnt);
		System.out.println("==============");
		System.out.println("상점명: "+QuizShop.sjName);
		System.out.println("상품명: "+spName+"\n수량: "+su+"개\n단가: "+dan+"원");
		System.out.println("==============");
		
	}	
	
}
