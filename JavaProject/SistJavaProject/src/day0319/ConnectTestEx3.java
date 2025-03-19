package day0319;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTestEx3 {
	
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//shop + cart
	//카트담긴 일련번호 idx, 상품명,색상, 갯수, 구입한날짜
	
	public void connectShopCart()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select idx, sangpum, cnt,color, guipday from shop sh, cart1 ct where sh.num=ct.num";
		
		try {
			conn=DriverManager.getConnection(URL, "seaj3", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("오라클 연결 성공!!!");
			System.out.println("\t\t***상품***");			
			System.out.println("번호\t상품명\t갯수\t색상\t구입날짜");
			System.out.println("===============================================");
			while(rs.next())
			{
				int idx=rs.getInt("idx");
				String sangpum=rs.getString("sangpum");
				int cnt=rs.getInt("cnt");
				String color=rs.getString("color");
				String guipday=rs.getString("guipday");
				
				System.out.println(idx+"\t"+sangpum+"\t"+cnt+"\t"+color+"\t"+guipday);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectTestEx3 ex3=new ConnectTestEx3();
		
		
		
		
		ex3.connectShopCart();
	}

}
