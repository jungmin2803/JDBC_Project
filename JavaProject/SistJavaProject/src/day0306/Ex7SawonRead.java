package day0306;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.SimpleFormatter;

public class Ex7SawonRead {

	//번호 사원명 기본급 가족수 초과근무시간 가족수당 시간수당 총급여
	//가족수당: 가족수 인원당 30000
	//시간수당: 시간당 15000원
	public static void sawonRead() {
		
		NumberFormat nf=NumberFormat.getInstance();
		
	String fileName="C:\\sist0217\\work\\sawon1.txt";
	FileReader fr=null;
	BufferedReader br=null;
	
	try {
		fr=new FileReader(fileName);
		br=new BufferedReader(fr);
		System.out.println("번호\t사원명\t기본급\t\t가족수\t초과근무시간\t가족수당\t\t시간수당\t\t총급여");
		System.out.println("=================================================================================================");
		int n=0;
		while(true)
		{
			String s=br.readLine();
			
			if(s==null)
			break;
			StringTokenizer st=new StringTokenizer(s, ",");
			String name=st.nextToken();
			int pay=Integer.parseInt(st.nextToken());
			int famSu=Integer.parseInt(st.nextToken());
			int timeSu=Integer.parseInt(st.nextToken());
			int famSudang=famSu*30000;
			int timeSudang=timeSu*15000;
			int totPay=pay+famSudang+timeSudang;
			
			System.out.println(++n+"\t"+name+"\t"+nf.format(pay)+"\t"+famSu+"\t"+timeSu+"\t\t"+
			nf.format(famSudang)+"\t\t"+nf.format(timeSudang)+"\t\t"+nf.format(totPay));				
			
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
		
		sawonRead();
	}

}
