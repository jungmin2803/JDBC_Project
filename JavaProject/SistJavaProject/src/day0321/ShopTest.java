package day0321;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day0319.DbConnect;

public class ShopTest {
	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	public void insertSangpum()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;		
		
		System.out.print("1.음료 or 2.과자");
		int type=Integer.parseInt(sc.nextLine());
		System.out.print("상품명: ");
		String sangpum=sc.nextLine();
		System.out.print("수량: ");
		int su=Integer.parseInt(sc.nextLine());
		System.out.print("단가: ");
		int dan=Integer.parseInt(sc.nextLine());
		
		//PreparedStatement 객체는 미완의 sql문을 작성할수있다
		//변수를 ?로 표시후 나중에 바인딩시켜준다
		String sql="insert into sales values(seq_test.nextval, ?, ?, ?, ?, sysdate)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//?순서대로 바인딩후 업데이트
			pstmt.setString(1, type==1? "음료":"과자");
			pstmt.setString(2, sangpum);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);
			
			int n=pstmt.executeUpdate();
			
			if(n==1)
				System.out.println("인서트 성공");
			else
				System.out.println("인서트 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	//출력
	//시퀀스  카테고리  상품명  수량  단가  입고일
	public void selectSangpum()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select num, type, sangpum, su, to_char(dan,'999,999,999')dan, ipgoday from sales order by num";
		System.out.println(sql);
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("시퀀스\t\t카테고리\t\t상품명\t\t수량\t\t단가\t\t입고일");
			System.out.println("===============================================================================================");
			while(rs.next())
			{
				/*int num=rs.getInt("num");
				String type=rs.getString("type");
				String sangpum=rs.getString("sangpum");
				int su=rs.getInt("su");
				String dan=rs.getString("dan");
				Date ipgoday=rs.getDate("ipgoday");
				
				System.out.println(num+"\t"+type+"\t"+sangpum+"\t"+su+"\t"+dan+"\t"+ipgoday);*/
				
				System.out.println(rs.getInt("num")+"\t\t"
						+rs.getString("type")+"\t\t"
						+rs.getString("sangpum")+"\t\t"
						+rs.getInt("su")+"\t"
						+rs.getString("dan")+"\t\t"
						+rs.getDate("ipgoday"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}
	
	//시퀀스 선택해서 삭제하도록
	public void deleteSangpum()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;		
		
		System.out.print("삭제할 시퀀스는: ");
		int num=Integer.parseInt(sc.nextLine());
		
		String sql="delete from sales where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setInt(1, num);
			
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println("삭제 성공");
			else
				System.out.println("삭제 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	
	public boolean isOneDate(int num)
	{
		boolean b=false;
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select *from sales where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			//if_1개만 조회할 경우
			if(rs.next())//데이타가 있는 경우	
				b=true;
			else //데이타가 없는 경우
				b=false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		
		return b;
	}
	
	//수정
	public void updateSangpum()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("수정할 시퀀스 번호는?");
		int num=Integer.parseInt(sc.nextLine());
		if(!this.isOneDate(num))
		{
			System.out.println("해당번호는 존재하지 않습니다");
			return;
		}
		System.out.println("수정할 타입은(1.음료 or 2.상품)?");
		int type=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 상품명은?");
		String sangpum=sc.nextLine();
		System.out.println("수정할 수량은?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 단가는?");
		String dan=sc.nextLine();
		
		String sql="update sales set type=?, sangpum=?, su=?, dan=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//?5개 순서대로 바인딩
			pstmt.setString(1, type==1?"음료":"상품");
			pstmt.setString(2, sangpum);
			pstmt.setInt(3, su);
			pstmt.setString(4, dan);
			pstmt.setInt(5, num);
			
			//업데이트
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println("상품수정 성공");
			else
				System.out.println("상품수정 실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	//상품명의 일부를 검색해서 찾기(상품명이 어디든 포함되면...)
	
	public void searchSangpum()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		System.out.println("찾으실 상품을 검색하세요");
		String searchSangpum=sc.nextLine().trim();
		
		String sql="select * from sales where sangpum like ?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, "%"+searchSangpum+"%");
			
			rs=pstmt.executeQuery();
			System.out.println("**검색한 상품명**");
			System.out.println("시퀀스\t카테고리\t상품명\t수량\t단가\t입고날짜");
			System.out.println("=========================================================");
			
			while(rs.next())
			{
				int num=rs.getInt("num");
				String type=rs.getString("type");
				String sangpum=rs.getString("sangpum");
				int su=rs.getInt("su");
				String dan=rs.getString("dan");
				Date ipgoday=rs.getDate("ipgoday");
				
				System.out.println(num+"\t"+type+"\t"+sangpum+"\t"+su+"\t"+dan+"\t"+ipgoday);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("검색실패");
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopTest sh=new ShopTest();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("**상품입고**");
			System.out.println("1.상품추가 2.상품삭제 3.상품수정 4.상품조회 5.재고출력 9.종료");
			int n=Integer.parseInt(sc.nextLine());
			if(n==1)
				sh.insertSangpum();
			else if(n==2)
				sh.deleteSangpum();
			else if(n==3)
				sh.updateSangpum();
			else if(n==4)
				sh.selectSangpum();
			else if(n==5)
				sh.searchSangpum();
			else if(n==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
