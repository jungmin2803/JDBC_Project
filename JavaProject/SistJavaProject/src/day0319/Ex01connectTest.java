package day0319;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex01connectTest {

	DbConnect db=new DbConnect();
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		
		String name,addr;
		String sql="";
		
		System.out.println("이름입력");
		name=sc.nextLine();
		System.out.println("주소입력");
		addr=sc.nextLine();
		
		sql="insert into hello values (seq_test.nextval,'"+name+"','"+addr+"',sysdate)";
		
		System.out.println(sql);
		
		Connection conn=null;		
		Statement stmt=null;
		
		//1.db연결
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			stmt.execute(sql); //boolean 반환 or int 반환
			
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
		
		String sql="select * from hello order by num";
		
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			//executeQuery메서드를 이용해서 결과를 ResultSet객체로 얻는다
			rs=stmt.executeQuery(sql);
			
			System.out.println("번호\t이름\t주소\t\t날짜");
			System.out.println("=============================================");
			//2개이상일때는 while, 하나일때는 if
			//ResultSet next를 이용해서 행을 선택하고 get메서드를 이용해서 테이블의 컬럼값을 얻는다
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
		
	}public static void main(String[] args) {
		Ex01connectTest db=new Ex01connectTest();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("1.insert 2.select 3.update 4.delete 9.exit");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				db.insert();
			else if(n==2)
				db.select();
			
				
				
			else if(n==9)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}

	