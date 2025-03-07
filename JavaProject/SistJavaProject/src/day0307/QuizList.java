package day0307;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Myshop{
	
	private String sangName;
	private int su;
	private int price;
	
	//setter && getter
	public String getSangName() {
		return sangName;
	}
	public void setSangName(String sangName) {
		this.sangName = sangName;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTot() {
		int tot=0;
		return tot=getSu()*getPrice();
	}
	
}

//ArrayList로 생성해서 할것!!!
//MyShop은 디폴트 생성자로 생성할것
//메인에서 추가를 누르면 입력메서드 호출..
//출력모양:  번호   입고상품   수량   가격   총금액

public class QuizList {
	
	List<Myshop> list=new ArrayList<Myshop>();
	NumberFormat nf=NumberFormat.getInstance();
	public void inputData() {
		//스캐너 ,변수선언
		Scanner sc=new Scanner(System.in);
		
		String sangName;
		int su,price;
		System.out.println("입고상품");
		sangName=sc.nextLine();
		System.out.println("수량");
		su=Integer.parseInt(sc.nextLine());
		System.out.println("가격");
		price=Integer.parseInt(sc.nextLine());
		
		Myshop my=new Myshop();
		my.setSangName(sangName);
		my.setSu(su);
		my.setPrice(price);
		list.add(my);	
		System.out.println("추가되었습니다");
		System.out.println("현재상품입고: "+list.size()+"개");
	}
	public void writeData() {
		//제목
		System.out.println("\t***상품재고현황***");
		System.out.println("번호\t입고상품\t수량\t가격\t총금액");
		System.out.println("========================================");
		
		for(int i=0;i<list.size();i++)
		{
			Myshop b =list.get(i);			
			System.out.println(i+1+"\t"+b.getSangName()+"\t"+nf.format(b.getSu())+"\t"+nf.format(b.getPrice())+"\t"+nf.format(b.getTot()));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizList q=new QuizList();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1.상품입고   2.재고현황    9.종료");
			int num=Integer.parseInt(sc.nextLine());
			if(num==1)
				q.inputData();
			else if(num==2)
				q.writeData();
			else if(num==9)
			{
				System.out.println("종료합니다");
				break;
			}
		}		
	}
}
