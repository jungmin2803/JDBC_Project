package day0319;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AboutSawon {

	DbConnect db=new DbConnect();
	static Scanner sc=new Scanner(System.in);
	
	public void insertSawon()
	{
		System.out.println("**사원추가하기**");
		System.out.print("사원명: ");
		String name=sc.nextLine();
		System.out.print("성별(남자/여자): ");
		String gender=sc.nextLine();
		System.out.print("부서명: ");
		String buseo=sc.nextLine();
		System.out.print("월급여는: ");
		int pay=Integer.parseInt(sc.nextLine());
						
		String sql="insert into sawon values (seq_sawon.nextval,'"+name+"','"+gender+"','"+buseo+"',"+pay+")";
		System.out.println(sql);
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql); //sql문 실행
			if(n==0)
			{
				System.out.println("실패");
			}
			else 
				System.out.println("추가 되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	
	public void selectSawon()
	{
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select num, name, gender, buseo, to_char(pay,'999,999,999') pay from sawon order by num";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t\t\t\t***사원 정보***");
			System.out.println("시퀀스\t\t사원명\t\t성별\t\t부서명\t\t급여");
			System.out.println("==============================================================================");
			
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				String pay=rs.getString("pay");
				
				System.out.println(num+"\t|\t"+name+"\t|\t"+gender+"\t|\t"+buseo+"\t|\t"+pay);
			}
			
			System.out.println("==============================================================================");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	public void updateSawon()
	{
		System.out.println("수정할 시퀀스 번호: ");
		int num=Integer.parseInt(sc.nextLine());
		if(!this.isSawonData(num));
		System.out.println("수정할 사원명: ");
		String name=sc.nextLine();
		System.out.println("수정할 부서명: ");
		String buseo=sc.nextLine();
		System.out.println("수정할 급여: ");
		int pay=Integer.parseInt(sc.nextLine());
		
		String sql="update sawon set name='"+name+"', buseo='"+buseo+"', pay="+pay+" where num="+num;
		System.out.println(sql);		
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			
			if(n==0)
				System.out.println("수정할 데이터가 없습니다");
			else
				System.out.println("데이터가 수정 되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
		
		
	}
	//삭제 ..시퀀스 입력하면 삭제
	public void deleteSawon()
	{
		System.out.println("**사원 삭제하기**");
		System.out.print("삭제할 시퀀스번호: ");
		int num=Integer.parseInt(sc.nextLine());
		if(!this.isSawonData(num))
		{
			System.out.println("사원번호를 잘못 입력하셨습니다");
			return;
		}
		String sql="delete from sawon where num="+num;
		System.out.println(sql);
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql); //sql문 실행
			if(n==0)
			{
				System.out.println("실패");
			}
			else 
				System.out.println("삭제 되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	
	public boolean isSawonData(int num) {
		boolean flag= false;
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		System.out.println();
		String sql="select *from sawon where num="+num;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next())
				flag=true;
			else
				flag=false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		return flag;
	}
	
	public void searchSawon()
	{
		//성을 검색하면 그성을 가진 사람이 오게한다
		
		
		
		System.out.println("검색할 사원의 성을 입력하세요");
		String str=sc.nextLine();
		if(!this.isData(str))
		{
			System.out.println(str+"씨 성을 가진 사원이 없습니다");
			return;
		}
		
		String sql="select * from sawon where name like '"+str+"%'";
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;			
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t\t\t\t***사원 정보***");
			System.out.println("시퀀스\t\t사원명\t\t성별\t\t부서명\t\t급여");
			System.out.println("==============================================================================");
			
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				String pay=rs.getString("pay");
				
				System.out.println(num+"\t|\t"+name+"\t|\t"+gender+"\t|\t"+buseo+"\t|\t"+pay);
			}
			
			System.out.println("==============================================================================");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
		
	public boolean isData(String str) {
		boolean flag= false;
		
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		System.out.println();
		String sql="select *from sawon where name like '"+str+"%'";
		//System.out.println(sql);
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next())
				flag=true;
			else
				flag=false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		return flag;
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutSawon as=new AboutSawon();
		
		int n;
		
		while(true)
		{
			System.out.println("===========================***Oracle Sawon 연습***=============================");
			System.out.println("\t**1.데이타 입력 | 2.데이타 출력 | 3.데이타 수정 | 4.데이타 삭제 | 5.사원조회 | 9.종료**");
			
			n=Integer.parseInt(sc.nextLine());
			if(n==1)
				as.insertSawon();
			else if(n==2)
				as.selectSawon();
			else if(n==3)
				as.updateSawon();
			else if(n==4)
				as.deleteSawon();
			else if(n==5)
				as.searchSawon();
			else if(n==9)
				break;
		}
	}

}
