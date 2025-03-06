package day0306;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex8FileWriter {

	public static void fileWrite()
	{
		String fileName="C:\\sist0217\\work\\test1.txt"; //저장할 이름
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(fileName); //파일새로 생성 (같은이름이 있더라도 새로생성)
			
			//파일의 내용 추가
			fw.write("오늘 날씨 좋구나!!\n");
			fw.write(new Date().toString());
			
			System.out.println("**파일저장성공!!**");
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
	
	public static void fileWrite2()
	{
		FileWriter fw=null;
		String fileName="C:\\sist0217\\work\\test2.txt";
		
		try {
			fw=new FileWriter(fileName, true); //추가모드 //false는 기본
			fw.write("내이름은 이정민!!!\n");
			fw.write("===========================\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filewrite();
		fileWrite2();
	}

}
