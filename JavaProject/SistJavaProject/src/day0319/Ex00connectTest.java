package day0319;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex00connectTest {
	
	DbConnect db=new DbConnect();
	
	public void insert()
	{
		String name, addr;
		String sql;
		
		Connection conn=null;
		Statement stmt=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		name=sc.nextLine();
		System.out.println("주소를 입력해 주세요");
		addr=sc.nextLine();
		
		sql="insert into hello values (seq_test.nextval, '"+name+"','"+addr+"',sysdate)";
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			
			System.out.println("**추가됨**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	
	public void select() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from hello";
		System.out.println(sql);
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				Date sdate=rs.getDate("sdate");
				
				
				System.out.println(num+"\t"+name+"\t"+addr+"\t"+sdate);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	public void delete()
	{
		Connection conn=null;
		Statement stmt=null;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 행 번호는?");
		num=Integer.parseInt(sc.nextLine());
		
		String sql="delete from hello where num="+num;
		
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			int s=stmt.executeUpdate(sql);
			if(s==0)
				System.out.println("없는 데이타 입니다");
			else if(s==1)
				System.out.println("**삭제되었습니다**");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
		
	}
	//수정_
	public void update()
	{
		
		
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex00connectTest ex0=new Ex00connectTest();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
		System.out.println("1. insert 2.select 3. delete 4. update 9.exit");
		n=Integer.parseInt(sc.nextLine());
		if(n==1)
			ex0.insert();
		else if(n==2)			
			ex0.select();
		else if(n==3)
			ex0.delete();
		else if(n==4)
			ex0.update();
		else if(n==9)
		{
			System.out.println("종료되었습니다");
			break;
		}		
		}
	}
}
