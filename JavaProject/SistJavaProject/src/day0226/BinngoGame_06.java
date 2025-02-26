package day0226;

import java.util.Scanner;

public class BinngoGame_06 {

	public static void main(String[] args) {
		// 반복문 안에서 엔터를 누르면 다음 난수가 나오도록 합니다(종료:Q or q)
		/*
		 *  3행3열의 다차원 배열을 생성후 1~3사이의 난수를 발생
		 *  각각의 가로, 각각의 세로,대각선을 비교해서 같은값이 나오면 빙고:2개
		 *  없으면 꽝!!!
		 */

		Scanner sc=new Scanner(System.in);

		String game;
		int [][] puzzle=new int[3][3];
		int binngo;


		while(true)
		{						

			System.out.println("엔터를 누르면 게임이 시작됩니다(종료:Q)");
			game=sc.nextLine();

			//종료
			if(game.equalsIgnoreCase("Q"))
			{
				System.out.println("게임을 종료합니다");
				break;
			}
			/*if(sc.nextLine().equalsIgnoreCase("q"))
			{
				System.out.println("종료");
				break;
			}*/


			//3행3열의 난수 발생
			for(int i=0;i<puzzle.length;i++) 
			{
				for(int j=0;j<puzzle[i].length;j++)
				{
					puzzle[i][j]=(int)(Math.random()*3)+1;	//1~3 사이의 난수
				}
			}
			//출력
			for(int i=0;i<puzzle.length;i++)
			{
				for(int j=0;j<puzzle[i].length;j++)
				{
					System.out.printf("%d\t",puzzle[i][j]);
				}
				System.out.println();
			}
			
			//빙고 초기값 설정
			binngo=0;

			//가로,세로,대각선 비교해서 같은 숫자 나오면 빙고
			//없으면 꽝
			for(int i=0;i<puzzle.length;i++)
			{
				//가로
				if(puzzle[i][0]==puzzle[i][1]&&puzzle[i][1]==puzzle[i][2])
					binngo++;

				//세로
				if(puzzle[0][i]==puzzle[1][i]&&puzzle[i][i]==puzzle[2][i])
					binngo++;

				//대각선 /
				if(puzzle[0][2]==puzzle[1][1]&&puzzle[1][1]==puzzle[2][0])
					binngo++;

				//대각선 \
				if(puzzle[0][0]==puzzle[1][1]&&puzzle[1][1]==puzzle[2][2])
					binngo++;
			}
			
			//빙고 갯수
			if(binngo==0) 
				System.out.println("꽝!!!");
			else
				System.out.println("빙고 ^^\t"+binngo+"개");	

		}

	}

}


