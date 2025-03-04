package day0228;

import java.util.Scanner;

class StrudentScore{
	
	//인스턴스 변수
	private String stuName;
	private int java;
	private int html;
	private int mysql;
	
	//setter &&getter
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getMysql() {
		return mysql;
	}
	public void setMysql(int mysql) {
		this.mysql = mysql;
	}
	
	public int getTotal(){
		int tot=java+html+mysql;
		return tot;
	}
	
	public double getAverage() {
		double avg=getTotal()/3.0;
		return avg;
	}
	
	public String getPungga() {
		String pg;
		if(getAverage()>=90)
			pg="장학생";
		else if(getAverage()>=80)
			pg="우수생";
		else
			pg="재수강";
		return pg;
	}
	
	
	
}
		
///////////////////////////////////////////
public class Ex0StrudentScoreResult {

	public static void StruTitle() {
		System.out.println("이름\tJava\tHtml\tMysql\t총점\t평균\t평가");
		System.out.println("==================================================");
	}
	
	public static void getStrudentOut(StrudentScore[] ss) {
		Ex0StrudentScoreResult.StruTitle();
		for(StrudentScore s: ss)
		{
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s",
					s.getStuName(),s.getJava(),s.getHtml(),s.getMysql(),s.getTotal(),s.getAverage(),s.getPungga());
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//변수선언 배열선언
		int inwon;
		StrudentScore [] ss;
		
		System.out.println("인원수를 입력하세요");
		inwon=Integer.parseInt(sc.nextLine());
		
		//배열 할당
		ss=new StrudentScore[inwon];
		
		for(int i=0;i<inwon;i++)
		{	ss[i]=new StrudentScore();
			System.out.println("이름");
			String name=sc.nextLine();
			
			System.out.println("Java점수는?");
			int java=Integer.parseInt(sc.nextLine());
			
			System.out.println("Html점수는?");
			int html=Integer.parseInt(sc.nextLine());
			
			System.out.println("Mysql점수는?");
			int mysql=Integer.parseInt(sc.nextLine());
			
			ss[i].setStuName(name);
			ss[i].setJava(java);
			ss[i].setHtml(html);
			ss[i].setMysql(mysql);
		}
		
		Ex0StrudentScoreResult.getStrudentOut(ss);
		
		
	}

}
