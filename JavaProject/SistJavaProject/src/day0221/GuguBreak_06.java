package day0221;

public class GuguBreak_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++) 
			{
				if(j==5)
					break; //자기가 속한 반복문 빠져나간다			
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//반복문앞에 이름을 붙혀 break 사용함으로서 둘이상의 반복문을 빠져나가는것이 가능하다
		dog:	for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++) 
			{
				if(j==4)
					break dog; //for문 전체를 다빠져나갈수 있다 (for문 앞에 "이름:"),(break 뒤에 "이름;")
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
