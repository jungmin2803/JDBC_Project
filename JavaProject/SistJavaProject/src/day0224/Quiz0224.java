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
		
		
		
		for(int i=0;i<4;i++)			
		{  	tot[i]=java[i]+oracle[i]+spring[i];
		
		avg[i]=(double)tot[i]/3;
		
		}
		for(int i=0;i<4;i++)
		{ rank[i]=1;
			for(int j=0;j<4;j++)
			{
				if(avg[i]<avg[j])
				rank[i]++;
			}
		}
		System.out.println("번호\t이름\t자바\t오라클\t스프링\t총점\t평균\t등수");
		System.out.println("=================================================================");
		
		//출력
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+spring[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
		}
		
			
		
		
		

	}

}
