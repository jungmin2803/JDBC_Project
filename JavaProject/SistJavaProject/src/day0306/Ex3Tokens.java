package day0306;

import java.util.StringTokenizer;

public class Ex3Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="장미,백합,튤립,후리지아,수국,안개꽃";
		System.out.println("String 객체를 split을 이용한 분리");
		String [] flowers=str.split(",");
		System.out.println(flowers.length);
		
		for(int i=0; i<flowers.length;i++)
		{
		System.out.println(flowers[i]+" ");
		}
		
		System.out.println("String 객체를 StringTokenizer을 이용한 분리");
		StringTokenizer fl=new StringTokenizer(str, ",");
		System.out.println("총갯수: "+fl.countTokens());
		
		while(fl.hasMoreTokens())
		{
			System.out.println(fl.nextToken());
					
		}
		
	}

}
