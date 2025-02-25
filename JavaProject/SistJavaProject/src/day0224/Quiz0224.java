package day0224;

import java.net.MulticastSocket;

public class Quiz0224 {

	public static void main(String[] args) {
		// 번호 이름 자바 오라클 스프링 총점 평균 등수
		//====================================
		// 1 현승훈  90  89   100  **  **.* 1
		
		String [] name= {"현승훈","이우형","박창배","최태림"};
		int [] java= {90,77,88,45};
		int [] oracle= {89,56,79,98};
		int [] spring= {100,89,99,79};
		int [] tot=new int[4];
		double [] avg=new double[4];
		int [] rank=new int[4];		
		
		
		// 총점 평균 구하기
		for(int i=0;i<name.length;i++) //0~3번지			
		{  	
		tot[i]=java[i]+oracle[i]+spring[i];		
		avg[i]=(double)tot[i]/3;		
		}
		// 등수 구하기
		for(int i=0;i<name.length;i++)
		{ 
			//순위배열을 1등으로 초기화
			rank[i]=1;
			for(int j=0;j<name.length;j++)
			{
				//반복하면서 나보다 큰점수가 나오면 나의순위를 1증가
				if(tot[i]<tot[j])
				rank[i]++;
			}
		}
		//출력
		System.out.println("번호\t이름\t자바\t오라클\t스프링\t총점\t평균\t등수");
		System.out.println("=================================================================");
		
		for(int i=0;i<name.length;i++) 
		{
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n"
					,i+1,name[i],java[i],oracle[i],spring[i],tot[i],avg[i],rank[i]);			
		}   //평균 소수점 한자리를 구하기 위해  printf로 출력
		
	}

}
