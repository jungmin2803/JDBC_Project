package day0227;

public class QuizShop {
	
	static int cnt=0;
	static String sjName;
	private String spName;
	private int su;
	private int dan;
	
	
	public String getSpName() {
		return spName;
	}
	public void setSpName(String spName) {
		this.spName = spName;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void setQuizShop(String spName, int su, int dan)
	{
		this.spName=spName;
		this.su=su;
		this.dan=dan;
	}
	
	public void getQuizShop()
	{	cnt++;
		System.out.println("입고물품"+cnt);
		System.out.println("==============");
		System.out.println("상점명: "+QuizShop.sjName);
		System.out.println("상품명: "+spName+"\n수량: "+su+"개\n단가: "+dan+"원");
		System.out.println("==============");
		
	}	
	
}
