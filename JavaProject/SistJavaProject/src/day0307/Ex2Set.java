package day0307;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<Integer>();
		
		set1.add(5);
		set1.add(11);
		set1.add(11);
		set1.add(20);
		set1.add(22);
		
		System.out.println(set1.size());
		
		System.out.println("출력 #1");
		for(Integer s:set1)
			System.out.printf("%5d",s);
		System.out.println();
		
		System.out.println("출력 #2");
		Iterator<Integer> iter=set1.iterator();
		while(iter.hasNext())
			System.out.printf("%5d",iter.next());
		System.out.println();
		
		
		System.out.println("출력 #3_for");
		Object[] ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.printf("%5d",ob[i]);
		
	}

}
