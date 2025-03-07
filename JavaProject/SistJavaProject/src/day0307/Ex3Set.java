package day0307;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3Set {

	public static void main(String[] args) {
		// 난수발생시켜서 1~45 사이의 난수6개 구해서출력
		
		Set<Integer> set=new HashSet<Integer>();
		while(true)
		{
			if(set.size()==6)
				break;
			//1~45 사이 난수
			int n=(int)(Math.random()*45)+1;
			set.add(n);
		
			
		}
		System.out.println(set);
		
		System.out.println("출력 #1_for~each");
		for(Integer n: set)
		System.out.printf("%4d",n);
		System.out.println();
		
		System.out.println("출력 #2_for");
		Object[] ob=set.toArray();
		
		Arrays.sort(ob);
	for(int i=0;i<ob.length;i++)
	{
		System.out.printf("%4d",ob[i]);
	}
	}

}
