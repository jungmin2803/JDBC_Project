package day0319;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTestEx1 {
	//연결할 URL
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";

	public void connectSawon()
	{	
		Connection conn=null; //연결
		Statement stmt=null; // 가져오기
		ResultSet rs=null; // 읽기

		String sql="select * from sawon order by num"; //사원테이블을 num의 오름차순 정렬하여 조회

		//Connection으로 오라클 연결하기
		try {
			conn=DriverManager.getConnection(URL, "seaj3", "a1234");

			System.out.println("오라클서버에 연결성공!!!");

			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				//db로부터 데이타 가져오기
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");

				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay+"\t");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클서버에 연결실패!!!");
		}finally {

			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	//음식명의 오름차순 정렬
	public void connectFoodmenu() {

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		String sql="select * from Foodmenu order by food_name";

		try {
			conn=DriverManager.getConnection(URL, "seaj3", "a1234");		
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);


			System.out.println("오라클 연결 성공!!!");

			while(rs.next())
			{
				int num=rs.getInt("fno");
				String name=rs.getString("food_name");
				int price=rs.getInt("price");
				String shopName=rs.getString("shop_name");
				String loc=rs.getString("loc");

				System.out.println(num+"\t"+name+"\t\t"+price+"\t\t"+shopName+"\t\t"+loc+"\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 연결 실패!!!");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	public static void foodMenuWrite()
	{
		System.out.println("\t\t\t\t***음식점 목록***");
		System.out.println("==============================================================================");
		ConnectTestEx1 ct=new ConnectTestEx1();
		ct.connectFoodmenu();
	}
	public static void main(String[] args) {

		ConnectTestEx1 ct=new ConnectTestEx1();
		//ct.connectSawon();

		foodMenuWrite();

	}
}
