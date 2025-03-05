package day0304;

import java.util.Scanner;

/* 보너스는 개발부만 백만 나머지 부서는 50만원 특별지급
 * 사원명?
 * 홍길동
 * 부서?
 * 개발부
 * 기본급?
 * 2000000
 * =========================
 * 사원명   부서    기본급    보너스     총급여
 * 홍길동   개발부  2000000  1000000  3000000
 */
class Sawon{
	//인스턴스 변수
	private String sawonName,buseo;
	private int gibonPay;
	
	//명시적 생성자(3가지 인자 초기화하는 값 넘기기)
	public Sawon(String sawonName,String buseo,int gibonPay) {
		
		this.sawonName=sawonName;
		this.buseo=buseo;
		this.gibonPay=gibonPay;
	}
	
	//getter메서드
	public String getName() {
		return sawonName;		
	}
	public String getBuseo() {
		return buseo;
	}
	public int getGibonPay() {
		return gibonPay;
	}
	
	//보너스
	public int getBonus() {
		int bonus=0;
		if(buseo.equals("개발부"))
			bonus=1000000;
		else
			bonus=500000;
		return bonus;	
		/*if(buseo.equals("개발부"))
		return 1000000;
		else
		return 500000;*/
	}
	
	//총급여
	public int getTotPay() {
		int totPay=gibonPay+getBonus();
		return totPay;	
		
		//return gibonPay+getBonus();
	}
	
	
}


public class QuizSawon {
	//제목 메서드
	public static void sawonTitle(){
		System.out.println("========================================");
		System.out.println("사원명\t부서\t기본급\t보너스\t총급여");
	}
	//출력 메서드
	public static void write(Sawon sawon) {
		
		sawonTitle();
		System.out.printf("%s\t%s\t%d\t%d\t%d",sawon.getName(),sawon.getBuseo(),sawon.getGibonPay(),sawon.getBonus(),sawon.getTotPay());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//변수선언
		Sawon sawon;
		
		//입력
		System.out.println("사원명?");
		String name=sc.nextLine();
		System.out.println("부서?");
		String boseo=sc.nextLine();
		System.out.println("기본급?");
		int gibonPay=Integer.parseInt(sc.nextLine());
		
		//초기값 생성
		sawon=new Sawon(name, boseo, gibonPay);
		
		//출력
		write(sawon);
		

	}

}
