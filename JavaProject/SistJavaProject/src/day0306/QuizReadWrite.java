package day0306;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class QuizReadWrite {

	Scanner sc=new Scanner(System.in);
	static final String FILENAME="C:\\sist0217\\work\\quizReadWrite.txt";
	FileReader fr=null;
	BufferedReader br=null;
	FileWriter fw=null;
	
	
	
	//1.상품추가  2.상품전체입고현황 9.종료	
	public int getMenu()
	{	int num=0;
		System.out.println("1. 상품추가   2.상품전체입고현황   9.종료");
		num=Integer.parseInt(sc.nextLine());		
		return num;
	}
	
	//입력후 파일에 저장 sangpumAdd()
	//fw.write(상품명+","+수랑+","+"단가"+"\n")
	public void sangpumAdd() {
		
		System.out.println("상품명은?");
		String name=sc.nextLine();
		System.out.println("수량은?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("단가는?");
		int dan=Integer.parseInt(sc.nextLine());
		
		try {
			fw=new FileWriter(FILENAME);
			fw.write(name+","+su+","+dan+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	//전체 출력  sangpumALLDatas()
	//수량이 10개 이상이면 10프로 할인
	//번호   상품명   수량   단가   금액   할인  총금액
	public void sangpumALLDatas() {
		//제목 출력
		System.out.println("번호\t상품명\t수량\t단가\t금액\t할인\t총금액");
		System.out.println("==========================================");
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int n=0;
			int hal=0;
			while(true)
			{	String s=br.readLine();
				StringTokenizer st=new StringTokenizer(s, ",");
				String name=st.nextToken();
				
				if(name==null)
					break;
				int su=Integer.parseInt(st.nextToken());
				int dan=Integer.parseInt(st.nextToken());				
				int pri=su*dan;				
				if(su>=10)				
				 hal=(pri/100)*10;
				else
					hal=pri;				
				int total=pri-hal;
				System.out.println(++n+"\t"+name+"\t"+su+"\t"+dan+"\t"+pri+"\t"+hal+"\t"+total+"\n");
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	//번호   상품명   수량   단가   금액   할인  총금액
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번이면 입력메서드 호출..2번이면 출력메서드호출  9번이면 종료
		QuizReadWrite q1=new QuizReadWrite();
		
		while(true)
		{
			int num=q1.getMenu();
			if(num==1)
			{
				System.out.println("상품추가");
				q1.sangpumAdd();
			}
			else if(num==2)
			{
				System.out.println("상품전체입고현황");
				q1.sangpumALLDatas();
			}
			else if(num==9)
			{
				System.out.println("**종료**");
				break;
			}
		}
		
	}

}
