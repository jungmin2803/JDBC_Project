package day0320;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day0319.DbConnect;

public class MyCludCrud {

	DbConnect db=new DbConnect();
	
	public void insert() {
		Scanner sc=new Scanner(System.in);
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		String sql="";
		System.out.print("회원명: ");
		String cname=sc.nextLine();
		System.out.print("주소: ");
		String caddress=sc.nextLine();
		System.out.print("직급: ");
		String cposition=sc.nextLine();
		System.out.println("전화번호: ");
		String chp=sc.nextLine();
		
		
		sql="insert into myclub values(seq_club.nextval, '"+cname+"', '"+caddress+"', '"+cposition+"', '"
		+chp+"',100000, sysdate)";
		//System.out.println(sql);
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println("회원가입 실패");
			else
				System.out.println("회원가입 되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	public void select() {
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select cno,cname, caddress, cposition , chp, to_char(cfee,'999,999,999')||'원' cfee, gaipday"
				+ " from myclub order by cno";
		//System.out.println(sql);
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("회번번호\t\t회원명\t\t  주소\t\t        직급\t\t전화번호\t\t       회비\t\t가입일");
			System.out.println("==========================================================================================================================");
			while(rs.next())
			{
				int cno=rs.getInt("cno");
				String cname=rs.getString("cname");
				String caddress=rs.getString("caddress");
				String cposition=rs.getString("cposition");
				String chp=rs.getString("chp");
				String cfee=rs.getString("cfee");
				Date gaipday=rs.getDate("gaipday");
				
				System.out.println(cno+"\t|\t"+cname+"\t|\t"+caddress+"\t|\t"+cposition+"\t|\t"+chp+"\t|"+cfee+"\t|\t"+gaipday);
				
			}
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}		
	}
	public void delete() {
		Connection conn=db.getConnection();
		Statement stmt=null;		
		Scanner sc=new Scanner(System.in);
		int cno;
		System.out.println("삭제할 시퀀스 번호를 입력해주세요");
		cno=Integer.parseInt(sc.nextLine());
		if(!this.isDate(cno))
		{
			System.out.println("삭제할 회원이 없습니다");
			return;
		}
		String sql="delete from myclub where cno="+cno;
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println("삭제할 데이타가 없습니다");
			else
				System.out.println("삭제가 완료되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	public void update()
	{
		Scanner sc=new Scanner(System.in);
		Connection conn=db.getConnection();
		Statement stmt=null;
		int cno;
		String sql="";
		
		System.out.println("수정할 시퀀스 번호를 입력하세요");
		cno=Integer.parseInt(sc.nextLine());
		
		if(!this.isDate(cno))
		{
			System.out.println("회원 번호를 잘못 입력했습니다");
			return;
		}
		System.out.print("수정할 회원명: ");
		String cname=sc.nextLine();
		System.out.print("수정할 주소: ");
		String caddress=sc.nextLine();
		System.out.print("수정할 직급: ");
		String cposition=sc.nextLine();
		System.out.println("수정할 전화번호: ");
		String chp=sc.nextLine();
		System.out.println("수정할 회비: ");
		int cfee=Integer.parseInt(sc.nextLine());
		
		
		sql="update myclub set cname='"+cname+"', caddress= '"+caddress+"', cposition= '"+cposition+"', chp= '"
		+chp+"', cfee="+cfee+" where cno="+cno;
		//System.out.println(sql);
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if(n==0)
				System.out.println("수정할 회원이 없습니다");
			else
				System.out.println("회원 수정이 완료되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	
	public boolean isDate(int cno) {
		boolean flag=false;
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from myclub where cno="+cno;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next())
			flag=true;
			else
			flag=false;			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);			
		}
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCludCrud mc=new MyCludCrud();
		Scanner sc=new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("\t\t\t\t1.회원가입 2.전체회원출력 3.회원정보수정 4.회원삭제  9.종료");
			System.out.println("==========================================================================================================================");
			num=Integer.parseInt(sc.nextLine());
			if(num==1)
				mc.insert();
			else if(num==2)
				mc.select();
			else if(num==3)
				mc.update();
			else if(num==4)
				mc.delete();
			else if(num==9)
			{
				System.out.println("프로그램종료");
				break;
			}
			
		}
	}

}
