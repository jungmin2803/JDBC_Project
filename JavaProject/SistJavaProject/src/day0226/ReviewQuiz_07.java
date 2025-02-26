package day0226;

import java.util.Scanner;

public class ReviewQuiz_07 {
	
	public static void quiz1() 
	{
		//문제1.숫자n을 입력하면 1부터 n까지의 합계를 구하시오(for or while)
		//1부터 n까지의 합계: ***
		
		Scanner sc=new Scanner(System.in);
				
		int n;
		int sum=0;
		int tot=0;
		System.out.println("숫자를 입력하세요");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{				
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합계: "+sum);
		
	}
	
	public static void quiz2()
	{
		//문제2. 5명의 나이를 입력후 40세이상과 40세미만이 각각 몇명인지 출력하고
		//평균도 구하시오(for)
		//40세 이상 인원수: 3
		//40세 미만 인원수: 2
		//평균 나이: **세
		
		Scanner sc=new Scanner(System.in);
		
		int age;
		int a=0,b=0;
		int sum=0;
		double avg;
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("나이를 입력하세요");
			age=sc.nextInt();
			
			sum+=age;
			
			if(age>=40)
				a++;
			else
				b++;
			
					
		}	avg=(double)sum/5.0;
		
		
			System.out.println("40세 이상 인원수: "+a);
			System.out.println("40세 미만 인원수: "+b);
			System.out.printf("평균 나이: %.2f세",avg);
		
		
	}
	
	public static void quiz3() 
	{
		//배열에 1~50사이의 난수 20개를 구하여 넣고
		//오름차순으로 정렬하여 출력하시오
		
		int [] nums=new int[20];
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=(int)(Math.random()*50)+1;
		}
		for(int i=0;i<nums.length-1;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]>nums[j])
					{
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
					}
				}
			}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz1();
		//quiz2();
		//quiz3();
	}

}
