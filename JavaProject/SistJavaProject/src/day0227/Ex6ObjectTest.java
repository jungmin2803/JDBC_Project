package day0227;

class MyDate{
	private int year;
	private int month;
	private int day;
	
	//명시적 생성자 (인자 3개)
	public MyDate(int y,int m, int d)
	{
		year=y;
		month=m;
		day=d;
	}
	
		
	//getter 메서드
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
}
//////////////////////////////////
public class Ex6ObjectTest {

	public static void main(String[] args) {


		MyDate my=new MyDate(1996, 9, 8);
		System.out.println("내 출생년도: "+my.getYear()+"년 "+my.getMonth()+"월 "+my.getDay()+"일");
		
		 
	

	}

}
