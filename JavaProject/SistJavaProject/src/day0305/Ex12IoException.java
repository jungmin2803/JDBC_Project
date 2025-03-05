package day0305;

import java.io.IOException;
import java.io.InputStream;

public class Ex12IoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is=System.in; //콘솔에서 입력받기 위한 노드스트림		
		int a=0; //아스키코드 값
		
		System.out.println("한글자를 입력: "); 
		
		try {
			a=is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		System.out.println("***3초 뒤에 출력합니다***");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
		
		System.out.println("입력값: "+a);
		
	}

}
