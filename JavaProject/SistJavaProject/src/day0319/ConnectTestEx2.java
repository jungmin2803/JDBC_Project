package day0319;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTestEx2 {

	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectBoardAnswer()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select b.bno,writer,subject,nickname,content,writeday "
				+"from board b ,answer a where b.bno=a.bno";
		
		try {
			conn=DriverManager.getConnection(URL, "seaj3", "a1234");
			System.out.println("오라클 연결 성공!!!");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("게시판 댓글 리스트");
			System.out.println("----------------------------------------------------------");
			while(rs.next())
			{
				int bno=rs.getInt("bno");
				String writer=rs.getString("writer");
				String subject=rs.getString("subject");
				String nickname=rs.getString("nickname");
				String content=rs.getString("content");	
				
				
				System.out.println(bno+"\t"+writer+"\t"+subject+"\t"+nickname+"\t"+content);
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
	
	//sawon_부서별 평균급여 최고급여 최저급여 화폐기호 천단위 구분기호
	public void connectSawon()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select buseo, to_char(avg(pay),'L999,999,999') avgpay, to_char(max(pay),'L999,999,999') maxpay, to_char(min(pay),'L999,999,999') minpay "
				+ "from sawon group by buseo";
		
		try {
			conn=DriverManager.getConnection(URL,"seaj3","a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("오라클 연결 성공!!!");
			
			System.out.println("회사 \t부서별 \t급여현황");
			System.out.println("------------------------------------------");
		
			while(rs.next())
			{
				String buseo=rs.getString("buseo");
				String avgPay=rs.getString("avgpay");
				String maxPay=rs.getString("maxpay");
				String minPay=rs.getString("minpay");
				
				System.out.println(buseo+"\t"+avgPay+"\t"+maxPay+"\t"+minPay);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("실패");
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
	
	
	
	
	//emp_직급별 평균급여 최고급여 최저급여
	
	public void connectEmp() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select job, to_char(avg(sal),'L999,999,999') avgsal, to_char(max(sal),'L999,999,999') maxsal, to_char(min(sal),'L999,999,999')  minsal "
				+ "from emp group by job";
		
		try {
			conn=DriverManager.getConnection(URL, "seaj3", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next());
			{
				String job=rs.getString("job");
				String avgsal=rs.getString("avgsal");
				String maxsal=rs.getString("maxsal");
				String minsal=rs.getString("minsal");
				
				System.out.println(job+"\t"+avgsal+"\t"+maxsal+"\t"+minsal);
				
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
		ConnectTestEx2 ex2=new ConnectTestEx2();
		//ex2.connectBoardAnswer();
		
		//ex2.connectSawon();
		ex2.connectEmp();
	}

}
