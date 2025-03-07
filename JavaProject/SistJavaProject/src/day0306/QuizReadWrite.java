package day0306;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class QuizReadWrite {

	Scanner sc=new Scanner(System.in);
	static final String FILENAME="C:\\sist0217\\work\\quizReadWrite.txt"; //파일저장위치,불러오는위치,파일이름 입력
	FileReader fr; //파일열기
	BufferedReader br; //열린파일 중 한줄 불러오기
	FileWriter fw; //파일 입력
	
	NumberFormat nf=NumberFormat.getInstance();
	
	//입력 메서드
	//1.상품추가  2.상품전체입고현황 9.종료	
	public int getMenu()
	{	int num=0;
		System.out.println("1. 상품추가   2.상품전체입고현황   3.파일삭제   9.종료");
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
			fw=new FileWriter(FILENAME,true);
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
		System.out.println("============================================================");
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int n=0;
			int tot=0;
			while(true)
			{	String s=br.readLine();
				if(s==null)
				break;
				StringTokenizer st=new StringTokenizer(s, ",");
				String name=st.nextToken();
				
				
				int su=Integer.parseInt(st.nextToken());
				int dan=Integer.parseInt(st.nextToken());				
				int pri=su*dan;	
				int hal=getHal(su, pri);			
				int total=pri-hal;
				
				System.out.println(++n+"\t"+name+"\t"+nf.format(su)+"\t"+nf.format(dan)+"\t"+nf.format(pri)+"\t"+nf.format(hal)+"\t"+nf.format(total));
				tot+=total;
				
			}
			System.out.println();
			System.out.println("\t\t전체 금액= "+nf.format(tot)+"원");
			
			
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
	
	public int getHal(int su, int pri) {
		int hal=0;
		if(su>=10)
			hal=(pri*10)/100;
		else
			hal=0;
		return hal;
	}
	
	public void deleteSangpum()
	{
		File file=new File(FILENAME);
		if(file.exists());
		file.delete();
		System.out.println("모든 데이터가 삭제되었습니다");
	}
	
	
	
	public void process() {
		while(true)
		{
			int num=getMenu();
			if(num==1)
			{
				System.out.println("상품추가");
				sangpumAdd();
			}
			else if(num==2)
			{
				System.out.println("상품전체입고현황");
				sangpumALLDatas();
			}
			else if(num==3)
			{
				System.out.println("파일을 삭제합니다");
				deleteSangpum();
			}
			else if(num==9)
			{
				System.out.println("**종료**");
				break;
			}
		}
		
		
	}
	//번호   상품명   수량   단가   금액   할인  총금액
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번이면 입력메서드 호출..2번이면 출력메서드호출  9번이면 종료
		QuizReadWrite q1=new QuizReadWrite();
		
		q1.process();
		
	}

}
