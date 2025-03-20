package day0319;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBCrudTest {

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
		
	}
	//삭제_메인에서 삭제할 번호는 ? 1 1번만 삭제되는걸로 
	public void delete()
	{	
		Scanner sc=new Scanner(System.in);
		int num;		
		String sql="";
		
		System.out.println("삭제할 번호는 ?");
		num=Integer.parseInt(sc.nextLine());
		
		sql="delete from hello where num="+num;
		//System.out.println(sql); //콘솔창에서 틀린부분 확인 가능
		//db연결
		Connection conn=db.getConnection();
		//statement
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql); //성공한 레코드의 갯수
			
			//없는 번호 입력시 실제 삭제가 안되므로 0이 반환
			if(a==0)
				System.out.println("없는 데이타 번호입니다");
			else //삭제되면 1이 반환
				System.out.println("**삭제되었습니다**");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
			
		}
		
	}
	//수정_수정하고 싶은 번호를 입력해서 이름과 주소를 수정
	 public void update()
	{	
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Statement stmt=null;
		String sql="";
		String name, addr;
		int su,num;
		this.select();
		System.out.println("수정할 번호를 입력하시오");
		num=Integer.parseInt(sc.nextLine());
		
		if(!this.isData(num))
		{
			System.out.println("해당 번호는 존재하지 않습니다");
			return;
		}
		/*
		System.out.println("수정할 이름을 선택하시오");
		name=sc.nextLine();
		System.out.println("수정할 주소를 선택하시오");
		addr=sc.nextLine();
		sql="update hello set name='"+name+"', addr='"+addr+"' where num="+num;
		*/		
		
		System.out.println("수정할 항목을 선택하시오 1. 이름 2. 주소 ");
		su=Integer.parseInt(sc.nextLine());				
	
		if(su==1)
		{		
			System.out.println("수정할 이름은 ?");
			name=sc.nextLine();
			sql="update hello set name='"+name+"' where num="+num;
		}
		else if(su==2)
		{
			
			System.out.println("수정할 주소는 ?");
			addr=sc.nextLine();
			sql="update hello set addr='"+addr+"' where num="+num;
		}
		else
		{
			System.out.println("잘못 누르셨습니다");
			return;
		}
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql); // 맞으면 true 반환
			
			if(a==0)
			{
				System.out.println("수정할 데이터가 존재하지 않습니다");
			}
			else
				System.out.println("**수정이 완료되었습니다**");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}		
	}
	 
	 //수정할 하나의 데이터 조회
	 
	 public boolean isData(int num)
	 {
		 //num에 해당하는 데이타가 있으면 true, 없으면 false 반환
		 boolean flag=false;
		 
		 String sql="select * from hello where num="+num;
		 Connection conn=db.getConnection();
		 Statement stmt=null;
		 ResultSet rs=null;
		 try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//1개일 경우는 if
			if(rs.next()) //데이타가 있는 경우 true
				flag=true;
			else  //데이타가 없는 경우 false
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
		DBCrudTest db=new DBCrudTest();
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
			else if(n==3)
				db.update();
			else if(n==4)
				db.delete();
				
			else if(n==9)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
