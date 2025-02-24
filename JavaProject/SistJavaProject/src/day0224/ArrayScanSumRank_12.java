package day0224;

import java.util.Scanner;

public class ArrayScanSumRank_12 {

	public static void main(String[] args) {
		/*
		 * 입력할 인원수를 먼저입력후 그 인원수 만큼 이름과 점수를 입력한 후
		 * 입력한 데이타도 출력하고 전체 합계와 평균을 구해보자
		 */
		Scanner sc=new Scanner(System.in);
		
		int inwon;
		String [] name;
		int [] score;
		int [] rank;
		int tot=0;		
		double avg=0;
		
		System.out.println("인원수를 입력하세요");
		inwon=Integer.parseInt(sc.nextLine());
		
		//인원수만큼 배열갯수 할당
		name=new String[inwon];
		score=new int[inwon];
		rank=new int[inwon];
		
		//인원수 만큼 이름, 점수를 입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+"번지 이름?");
			name[i]=sc.nextLine();
			System.out.println(i+"번지 점수");
			score[i]=Integer.parseInt(sc.nextLine());
			//총점
			tot+=score[i];					
			
		}	
		//각 이름, 점수의 배열 입력 완료
		//등수구하기(다중for문)
		for(int i=0;i<inwon;i++) //inwon 안에 인원수 만큼 이름,점수의 배열이 들어있음.
		{
			rank[i]=1; //rank[[i]의 초기값은 1로본다(1등으로 본다) ex) (홍길동 79)이 지금 1등
			for(int j=0;j<inwon;j++) //score[i](홍길동 79)와 score[j](나머지 배열들)를 비교
			{
				//비교되는 대상이 점수가 높으면 i 번지(홍길동 79)의 등수를 1증가 시킨다 (마지막 배열까지 반복)
				if(score[i]<score[j])
					rank[i]++; 
			}
		}
		
		
		
		//평균
		avg=(double)tot/inwon;			
		
		//출력
		System.out.println("----------------------");	
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("----------------------");		
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);			
		}
		System.out.println("----------------------");
		System.out.println("총합계: "+tot);
		System.out.printf("총평균: %.2f",avg);

		
		
		
	}

}
