package day0321;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day0319.DbConnect;

public class PstmtStuInfo {

	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	public void insertStuInfo()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.print("학생명: ");
		String name=sc.nextLine();
		System.out.print("주소: ");
		String addr=sc.nextLine();
		System.out.print("혈액형: ");
		String blood=sc.nextLine();
		System.out.print("핸드폰 번호: ");
		String hp=sc.nextLine();
		System.out.print("학년: ");
		int grade=Integer.parseInt(sc.nextLine());
		System.out.print("나이: ");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("생일: ");
		String birth=sc.nextLine();
		
		String sql="insert into stuinfo values (seq_test.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		//System.out.println(sql);
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, blood);
			pstmt.setString(4, hp);
			pstmt.setInt(5, grade);
			pstmt.setInt(6, age);
			pstmt.setString(7, birth);
			
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println("학생정보 입력 성공");
			else
				System.out.println("학생정보 입력 실패");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	public void selectStuInfo()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select stu_no, stu_name, stu_addr, stu_blood, stu_hp, stu_grade, stu_age, birth, writeday from stuinfo order by stu_no";
		System.out.println(sql);
		//System.out.println(sql);
		try {
			pstmt=conn.prepareStatement(sql);			
			rs=pstmt.executeQuery();
			System.out.println("시퀀스\t이름\t   주소\t\t혈액형\t핸드폰번호\t\t학년\t나이\t생일\t입력날짜");
			System.out.println("=======================================================================================");
			while(rs.next())
			{				
				int no=rs.getInt("stu_no");
				String name=rs.getString("stu_name");
				String addr=rs.getString("stu_addr");
				String blood=rs.getString("stu_blood");
				String hp=rs.getString("stu_hp");
				int grade=rs.getInt("stu_grade");
				int age=rs.getInt("stu_age");
				String birth=rs.getString("birth");
				Date writeday=rs.getDate("writeday");
				
				System.out.println(no+"\t"+name+"\t"+addr+"\t"+blood+"형\t"+hp+"\t"+grade+"학년\t"+age+"세\t"+birth+"\t"+writeday);
				
			}
			System.out.println("---------------------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("출력 실패");
		}finally {
			db.dbClose(rs, pstmt, conn);
		}				
	}
	
	public void deleteStuInfo()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("삭제할 스퀀스 번호는?");
		int n=Integer.parseInt(sc.nextLine());
		
		if(!this.isStuDate(n))
		{
			System.out.println("삭제할 학생정보가 없습니다");
			return;
		}
		
		String sql="delete from stuinfo where stu_no=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, n);
			
			int s=pstmt.executeUpdate();
			if(s==1)
				System.out.println("학생정보가 삭제 되었습니다");
			else
				System.out.println("학생정보가 삭제되지 않았습니다");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}				
	}
	public boolean isStuDate(int n)
	{
		boolean b=false;
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from Stuinfo where stu_no=?";
		//System.out.println(sql);
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, n);
			rs=pstmt.executeQuery();			
			
			if(rs.next())
				b=true;
			else
				b=false;			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}					
		
		return b;
	}
	
	public void updateStuInfo()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("수정할 시퀀스는?");
		int n=Integer.parseInt(sc.nextLine());
		if(!this.isStuDate(n))
		{
			System.out.println("수정할 학생이 없습니다");
			return;
		}
				
		System.out.print("수정할 학생명: ");
		String name=sc.nextLine();		
		System.out.print("수정할 주소: ");
		String addr=sc.nextLine();			
		System.out.print("수정할 혈액형: ");
		String blood=sc.nextLine();		
		System.out.print("수정할 핸드폰 번호: ");
		String hp=sc.nextLine();		
		System.out.print("수정할 학년: ");
		int grade=Integer.parseInt(sc.nextLine());		
		System.out.print("수정할 나이: ");
		int age=Integer.parseInt(sc.nextLine());		
		System.out.println("수정할 생일: ");
		String birth=sc.nextLine();		
		
		String sql="update stuinfo set stu_name= ?, stu_addr= ?, stu_blood= ?, stu_hp= ?, stu_grade= ?, stu_age= ?, birth= ? where stu_no= ?";
		System.out.println(sql);
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, blood);
			pstmt.setString(4, hp);
			pstmt.setInt(5, grade);
			pstmt.setInt(6, age);
			pstmt.setString(7, birth);
			pstmt.setInt(8, n);
			
			int s=pstmt.executeUpdate();
			if(s==1)
				System.out.println("학생정보 수정 성공");
			else
				System.out.println("학생정보 수정 실패");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("실패");
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	public void searchStuInfo()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		System.out.println("검색할 학생의 성을 입력하세요");
		String search=sc.nextLine();
		
		String sql="select * from Stuinfo where stu_name like ?";
		//System.out.println(sql);
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, search+"%");
			rs=pstmt.executeQuery();			
			
				while(rs.next())
				{				
					int no=rs.getInt("stu_no");
					String name=rs.getString("stu_name");
					String addr=rs.getString("stu_addr");
					String blood=rs.getString("stu_blood");
					String hp=rs.getString("stu_hp");
					int grade=rs.getInt("stu_grade");
					int age=rs.getInt("stu_age");
					String birth=rs.getString("birth");
					Date writeday=rs.getDate("writeday");
					
					System.out.println(no+"\t"+name+"\t"+addr+"\t"+blood+"형\t"+hp+"\t"+grade+"학년\t"+age+"세\t"+birth+"\t"+writeday);
					
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}finally {
			db.dbClose(rs, pstmt, conn);
		}				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PstmtStuInfo ps=new PstmtStuInfo();
		Scanner sc=new Scanner(System.in);
		while(true)
		{	System.out.println("==========================***학생 정보***==========================");
			System.out.println("1.학생정보 입력 2.학생정보 출력 3.학생정보 삭제 4.학생정보 수정 5.학생검색(성) 9.종료");
			int n=Integer.parseInt(sc.nextLine());
			if(n==1)
				ps.insertStuInfo();
			else if(n==2)
				ps.selectStuInfo();
			else if(n==3)
				ps.deleteStuInfo();
			else if(n==4)
				ps.updateStuInfo();
			else if(n==5)
				ps.searchStuInfo();
			else if(n==9)
			{
				System.out.println("프로그램종료");
				break;
			}
		}
	}

}
