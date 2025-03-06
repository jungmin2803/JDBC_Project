package day0305;

import java.awt.desktop.SystemSleepEvent;
import java.text.NumberFormat;
import java.util.Scanner;

class Company{
	private String staff,position;
	private int famSu;
	
	//디폴트 생성자
	public Company() {
		// TODO Auto-generated constructor stub
	}
	//사원명,직급,가족수를 인자로 받는 생성자
	public Company(String staff,String position,int famSu) {
		// TODO Auto-generated constructor stub
		this.staff=staff;
		this.position=position;
		this.famSu=famSu;
	}
	//각각의 setter & getter
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getFamSu() {
		return famSu;
	}
	public void setFamSu(int famSu) {
		this.famSu = famSu;
	}
		
	//직급에 따라 기본급: 부장->450 과장->350 대리->280 사원->220 getGibonPay()
	public int getGibonPay() {
		/*int gibonPay;
		if(position.equals("부장"))
			gibonPay=4500000;
		else if(position.equals("과장"))
			gibonPay=3500000;
		else if(position.equals("대리"))
			gibonPay=2800000;
		else if(position.equals("사원"))
			gibonPay=2200000;
		else
			gibonPay=0;
		return gibonPay;*/
		
		int gibonPay=switch(position)
				{
				case"부장"->4500000;
				case"과장"->3500000;
				case"대리"->2800000;
				case"사원"->2200000;
				default->0;
				};
		return gibonPay;
	}
	//직급에 따라 수당: 부장,과장==> 100 대리,사원==>70만원 getSudangPay()
	public int getSudagPay()
	{
		int sudagPay;
		if(position.equals("부장")||position.equals("과장"))
			sudagPay=1000000;
		else
			sudagPay=700000;
		return sudagPay;
	}
	//가족수가 5인이상: 30만 5인미만2인이상은 10만원 나머지는 0 getFamSudang()
	public int getFamSudang() {
		int famSudang;
		if(famSu>=5)
			famSudang=300000;
		else if(famSu<5&&famSu>=2)
			famSudang=100000;
		else
			famSudang=0;
		return famSudang;
	}
	//세금: 기본급의 5%를 반환받아서 세금 getTax()
	public int getTax() {
		return (getGibonPay()/100)*5;
	}
	//실수령액: 기본급+수당+가족수당-세금 getNetPay()
	public int getNetPay() {
		return getGibonPay()+getSudagPay()+getFamSudang()-getTax();
	}
}
public class QuizClass {
	
	//제목출력 메서드(showTitle())
	//사원명  직급  기본급  수당  가족수당  세금  실수령액
	public static void showTitle() {
		System.out.println("사원명\t직급\t기본급\t수당\t가족수당\t세금\t실수령액");
		System.out.println("=======================================================");
	}
	
	
	//반복문을 사용한 사원데이타 출력 메서드 writeSawon()
	public static void writeSawon(Company[]myCompany) {
		
		for(int i=0;i<myCompany.length;i++)
		{
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d",
					myCompany[i].getStaff(),myCompany[i].getPosition(),myCompany[i].getGibonPay()
					,myCompany[i].getSudagPay(),myCompany[i].getFamSudang(),myCompany[i].getTax(),myCompany[i].getNetPay());
			System.out.println();
		}
				
	}
	//한개의 사원데이타 출력 메서드 writeSawon2()
	public static void writeSawon2(Company mc) {
		
		NumberFormat nf=NumberFormat.getInstance();
		
		System.out.println(mc.getStaff()+"\t"+mc.getPosition()+"\t"
				+nf.format(mc.getGibonPay())+"\t"+nf.format(mc.getSudagPay())+"\t"
				+nf.format(mc.getFamSudang())+"\t"+nf.format(mc.getTax())+"\t"+nf.format(mc.getNetPay()));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인원수를 입력후 인원수만큼 배열 메모리에 할당
		int inwon;
		Company [] myCompany;
		Scanner sc=new Scanner(System.in);
		System.out.println("사원수를 입력하세요");
		inwon=Integer.parseInt(sc.nextLine());
		myCompany =new Company[inwon];
		//배열에 데이타를 입력후 생성자를 통해서 데이타 저장하기
		for(int i=0;i<myCompany.length;i++)
		{	
			System.out.println("사원명은?");
			String name=sc.nextLine();
			
			System.out.println("직급은?");
			String position=sc.nextLine();
			
			System.out.println("가족수는?");
			int famSu=Integer.parseInt(sc.nextLine());
			
			myCompany[i]=new Company(name, position, famSu);			
			
		}
		//제목출력
		showTitle();
		
		//데이타 출력하는 메서드 호출		
		writeSawon(myCompany);
		
		System.out.println();
		//제목출력
		showTitle();
		//반복문 통해서 데이타 출력하는 메서드 호출
		for(int i=0;i<myCompany.length;i++)
		{
			writeSawon2(myCompany[i]);
		}
	}

}
