package day0219;

import java.util.Scanner;

public class IfMax_10 {

	public static void main(String[] args) {
		/*
		 * 3개의 수를 입력하시오
		 * 5
		 * 15
		 * 8
		 * ***if문***
		 * max=15
		 * ***삼항연산자***
		 * max=15
		 */
	
		Scanner sc=new Scanner(System.in);
		
		//if문
		int x,y,z,max;
		
		System.out.println("3개의 수를 입력하세요");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		System.out.println("입력한 세 수 "+x+","+y+","+z);
		if(x>y&&x>z) 
			max=x;
			else if(x<y&&y>z)
				max=y;
			else 
				max=z;
		
		//출력
		System.out.println("***if문***\nmax="+max);
		
		
		
		//삼항연산자
		max=x>y&&x>z?x:y>z&&y>x?y:z;
		
		//출력
		System.out.println("***삼항연산자***\nmax="+max);
		
		
		
			
			
			
				
		

	}

}
