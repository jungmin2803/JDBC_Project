package day0224;

import java.util.Random;

public class Rotto_00 {
	public static void main(String[] args) {
	Random r=new Random();
	System.out.println("로또 번호");
	for(int i=1;i<=6;i++)
	{
		int n=r.nextInt(45)+1;
		System.out.print(n+" ");
	}
	System.out.println();
	System.out.println("==============");
}
}