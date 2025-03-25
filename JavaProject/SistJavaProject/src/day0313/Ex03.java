package day0313;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	/*
	 * 로또 몇장드릴까요?
	 * 3
	 * 
	 * 1회: 2  13  22  32  44  45
	 * 2회: 3  12  15  16  18  22
	 * 3회: 4  5   11  22  33  36
	 */
	private int Su;
	private int [] Lotto=new int [6];
	
	
	public int getSu() {
		return Su;
	}

	public void setSu(int su) {
		Su = su;
	}

	public int[] getLotto() {
		return Lotto;
	}

	public void setLotto(int[] lotto) {
		Lotto = lotto;
	}

	public void lottoDate()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("로또 몇장드릴까요?");
		Su=sc.nextInt();
		
		for(int x=0; x< Su; x++)
		{
			for(int i=0; i < Lotto.length; i++)
			{
				Lotto[i]=(int)(Math.random()*45)+1;
				
				for(int j=0; j< i; j++)
				{
					if(Lotto[i]==Lotto[j])
					{
						i--;
						break;
					}
				}
			}
			for(int i=0; i<Lotto.length-1; i++)
			{	int temp=0;
				for(int j=i+1; j<Lotto.length;j++)
				{
					if(Lotto[i]>Lotto[j])
					{
						temp=Lotto[i];
						Lotto[i]=Lotto[j];
						Lotto[j]=temp;
					}
					
				}
			}
			System.out.println("\n");
			System.out.printf(x+1+"회: ");
			for(int i=0; i< Lotto.length; i++)
			{
				System.out.print(Lotto[i]+"  ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 ex=new Ex03();
		ex.lottoDate();
	}

}
