package day0226;

import java.util.Scanner;

public class Test_00 {

	public static void Quiz01() {
		// 인원수를 입력후 인원수만큼 이름 자바,오라클 두점수 입력후
		// 총점, 평균, 순위,등급을 구하시오

		Scanner sc=new Scanner(System.in);

		int inwon;
		int [] java,oracle,sum,rank;
		String [] name,grade;
		double [] avg;

		System.out.println("점수를 구할 인원수는?");
		inwon=Integer.parseInt(sc.nextLine());

		java=new int[inwon];
		oracle=new int[inwon];
		sum=new int[inwon];
		rank=new int[inwon];
		name=new String[inwon];
		grade=new String[inwon];
		avg=new double[inwon];

		//입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+"번째 이름");
			name[i]=sc.nextLine();
			System.out.println("자바와 오라클의 점수");
			java[i]=Integer.parseInt(sc.nextLine());
			oracle[i]=Integer.parseInt(sc.nextLine());

			sum[i]=java[i]+oracle[i];
			avg[i]=sum[i]/2.0;

		}
		//순위
		for(int i=0;i<inwon;i++)
		{	
			rank[i]=1;
			for(int j=0;j<inwon;j++)
			{
				if(avg[i]<avg[j])
				{
					rank[i]++;
				}
			}
		}
		//등급
		for(int i=0;i<inwon;i++)
		{
			switch((int)avg[i]/10) {
			case 10: case 9:
				grade[i]="전액 장학금";
				break;
			case 8:
				grade[i]="반액 장학금";
				break;
			default:
				grade[i]="장학생이 아닙니다";
			}
		}

		System.out.println("번호\t이름\t자바점수\t오라클점수\t총점\t평균\t등수\t등급");
		System.out.println();
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+sum[i]+"\t"+avg[i]+"\t"+rank[i]+"\t"+grade[i]);
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz01();
		
		
		
				
	}

}
