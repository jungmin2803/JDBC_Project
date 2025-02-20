package day0220;

import java.util.Scanner;

public class EqualTest_03 {
	
	public static void main(String[] args) {
		//문자열비교는 관계대명사로 하면 안되고 equals, equalsIgnoreCase(대소문자 구분x)라는 메소드를 사용해서 비교한다
		
		
		Scanner sc=new Scanner(System.in);
		
		String word;
		
		System.out.println("영어단어 입력하세요");
		System.out.println("ex) cat,dog,angel,rose");		
		word=sc.nextLine();
		
		System.out.println("입력한 문자열: "+word);
		
		//if(word=="cat")  <-문자열은 ==이 안된다
		if(word.equals("cat"))
			System.out.println("**고양이**");
		else if(word.equalsIgnoreCase("dog")) //equalsIgnoreCase는 대소문자를 가리지 않고 같다고 본다
			System.out.println("**강아지**");
		else if(word.equalsIgnoreCase("angel"))
			System.out.println("**천사**");
		else if(word.equalsIgnoreCase("rose"))
			System.out.println("**장미**");
		else 
			System.out.println("***단어가 등록되지 않았습니다***");
		
		
		
		
	}
}
