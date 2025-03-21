package day0321;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day0319.DbConnect;

public class SungjukDB {

	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	public void insertSungjuk()
	{	
		System.out.println("학생명");
		String name=sc.nextLine();
		System.out.println("자바점수");
		int java=Integer.parseInt(sc.nextLine());
		System.out.println("오라클점수");
		int oracle=Integer.parseInt(sc.nextLine());
		
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into sungjuk (num,name,java,oracle) values (seq_sungjuk.nextval,?, ?, ?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//순서대로 바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);
			
			//업데이트
			pstmt.execute();
			System.out.println("추가되었습니다");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	
	public void selectAllSungjuk()
	{
		//총점 평균 먼저 가지고 온후에 출력
		this.calcTotAvg();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from sungjuk order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("\t\t**학생 성정 출력**");
			System.out.println("번호\t이름\t자바성적\t오라클성적\t총점\t평균");
			System.out.println("------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getInt("java")+"\t"
						+rs.getInt("oracle")+"\t"
						+rs.getInt("total")+"\t"
						+rs.getDouble("average"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteSungjuk()
	{
		System.out.println("삭제할 번호?");
		int num=Integer.parseInt(sc.nextLine());
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="delete sungjuk where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setInt(1, num);
			
			//실행
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println(num+"번 학생정보를 삭제하였습니다");
			else
				System.out.println(num+"번은 존재하지 않습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
				
	}
	
	//총점과 평균만 다시 계산
	public void calcTotAvg()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="update sungjuk set total=java+oracle,average=(java+oracle)/2";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
				
	}
	
	
	public void updateSungjuk()
	{
		
	}
	public void process()
	{
		while(true)
		{
			System.out.println("1.성적입력 2.성적정보삭제 3.성적수정 4.전체성적조회 9.종료");
			System.out.println("===============================================");
			int n=Integer.parseInt(sc.nextLine());
			
			switch(n)
			{
			case 1:
				this.insertSungjuk();
				break;
			case 2:
				this.deleteSungjuk();
				break;
			case 3:
				this.updateSungjuk();
				break;
			case 4:
				this.selectAllSungjuk();
				break;
			default :
				System.out.println("성적프로그램 종료");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungjukDB db=new SungjukDB();
		db.process();

	}

}
