package day0225;

import java.util.Scanner;

public class QuizLottoBuy_08 {

	public static void main(String[] args) {
		/*
		 * 로또 몇장드릴까요?
		 * 3
		 * 
		 * 1회: 2  13  22  32  44  45
		 * 2회: 3  12  15  16  18  22
		 * 3회: 4  5   11  22  33  36
		 */
		Scanner sc=new Scanner(System.in);

		int su; //구매할 갯수
		int [] lotto=new int[6];
		System.out.println("로또 몇장드릴까요?");
		su=sc.nextInt();
		
		//반복문 1개로 난수 오름차순 전체를 감싸준다
		for(int x=0;x<su;x++) // 로또 배열[6]개를 입력한 수 만큼 반복 (1회 2회 3회 ...)
		{	
			for(int i=0;i<lotto.length;i++)
			{	
				lotto[i]=(int)(Math.random()*45)+1; //로또 랜덤수 생성		
				
				//중복처리 : 현재 index(i)와 (0~i-1)비교해서 중복된 숫자가 존재하면 i--
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j]) 
					{
						i--;	
						break;
					}
				}
			}
			//오름차순 정렬
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						int temp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=temp;					
					}
				}		
			}
			//출력
			System.out.println();
			System.out.printf(x+1+"회: ");
			for(int i=0; i<lotto.length;i++)
			{	
				System.out.print(lotto[i]+" ");
			}
		}





	}
}
