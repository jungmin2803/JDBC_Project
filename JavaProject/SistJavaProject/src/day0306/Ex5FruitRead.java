package day0306;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex5FruitRead {

	//메서드 만든후 출력하시오 제목은 과일입고현황 순번 과일명 입고수량 입고단가 총가격
	public static void fileRead() {
		
		String fileName="C:\\sist0217\\work\\Fruit.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("\t[과일입고현황]");
			System.out.println("순번\t과일명\t입고수량\t입고단가\t총가격");
			System.out.println("=================================");
			int n=0;
			while(true)
			{			
			String s=br.readLine();
			
			if(s==null)
				break;
			{				
			StringTokenizer st=new StringTokenizer(s, ":");
			String sang=st.nextToken();
			int su=Integer.parseInt(st.nextToken());
			int dan=Integer.parseInt(st.nextToken());
			int tot=su*dan;
			System.out.println(++n+"\t"+sang+"\t"+su+"개\t"+dan+"원\t"+tot+"원");
			}
			
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fileRead();
	}

}
