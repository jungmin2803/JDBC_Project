package day0228;

import java.util.Scanner;

class StudentScore{
	//변수선언
	private String stuName;
	private int java;
	private int html;
	private int mysql;
	
	//setter && getter
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
	
	public int getTotal()
	{
		int tot=java+html+mysql;
		return tot;
	}
	
	public double getAverage()
	{
		double avg=getTotal()/3.0;
		return avg;
	}
	
	public String getPungga()
	{
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
////////////////////////////////////////////
class jungbo{
		
	public static StudentScore[] jungbo() {
		
		Scanner sc=new Scanner(System.in);
		
		//배열 선언
		StudentScore[] stuScore;
		//변수선언 인원수
		int inwon;
		
		System.out.println("학생수 입력하세요");
		inwon=Integer.parseInt(sc.nextLine());
		
		//인원수만큼 배열 할당
		stuScore=new StudentScore[inwon];
		
		for(int i=0;i<stuScore.length;i++)
			
		{stuScore[i]=new StudentScore();
			System.out.println("이름");
			String name=sc.nextLine();
			System.out.println("Java, Html, Mysql 점수를 입력하세요");
			int java=Integer.parseInt(sc.nextLine());
			int html=Integer.parseInt(sc.nextLine());
			int Mysql=Integer.parseInt(sc.nextLine());
			
			stuScore[i].setStuName(name);
			stuScore[i].setJava(java);
			stuScore[i].setHtml(html);
			stuScore[i].setMysql(Mysql);
			
		}
		return stuScore;
	}
	
	public static void getTitle()
	{
		System.out.println("이름\t\tJava\t\tHtml\t\tMysql\t\t총점\t\t평균\t\t평가");
		System.out.println("======================================================================");
	}
	


	
}

public class StudentScoreResult {
	
	public static void stuScore(StudentScore[]stuScore)
	{	
		jungbo.getTitle();
		
		for(StudentScore s:stuScore)
		{
		System.out.printf("이름: %s\tJava: %d\tHtml: %d\tMysql: %d\t총점: %d\t\t평균: %.2f\t평가: %s\n"
				,s.getStuName(),s.getJava(),s.getHtml(),s.getMysql(),s.getTotal(),s.getAverage(),s.getPungga());
		}
	}
	
	public static void getStuOut() {
		StudentScore[]studentScores=jungbo.jungbo();
		StudentScoreResult.stuScore(studentScores);
	}

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StudentScoreResult.getStuOut();
	
	}

}
