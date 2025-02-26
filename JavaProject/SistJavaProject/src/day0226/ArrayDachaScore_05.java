package day0226;

public class ArrayDachaScore_05 {

	public static void main(String[] args) {
		// 다차원 배열로 성적표 출력
		/*
		 * 이름   자바  오라클  스프링 총점  평균
		 * 이효리  88   77    88   **   **.**
		 * 이상순  77   55    99   **   **.**
		 * 김민희  66   77    77   ***  **.**
		 */
		
		
		String[]name= {"이효리","이상순","김민희"};
		int [][] scroe= {{88,77,88,0},{77,55,99,0},{66,77,77,0}};
		double []avg= {0,0,0,0};
		
		//총점
		for(int i=0;i<scroe.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				scroe[i][3]+=scroe[i][j];				
			}
		}
		//평균
		for(int i=0;i<scroe.length;i++)
		{			
			for(int j=0;j<3;j++)
			{
				avg[i]=scroe[i][3]/3.0;
			}
		}		
		
		//입력
		System.out.println("이름\t자바\t오라클\t스프링\t총점\t평균");
		for(int i=0;i<name.length;i++)
		{	
			System.out.print(name[i]+"\t");
			
			//점수와 총점은 열갯수만큼 반복해서 출력			
			for(int j=0;j<scroe[i].length;j++)
			{
				System.out.print(scroe[i][j]+"\t");
			}
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}		
		
	}

}
