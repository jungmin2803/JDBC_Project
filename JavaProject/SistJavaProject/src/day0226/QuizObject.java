package day0226;

public class QuizObject {

	
	static String processName; //과정명
	String stuName; //학생명
	int age; //학생들의 나이
	private String city; //사는곳
	private String hobby; //취미
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public void setHobby(String hobby)
	{
		this.hobby=hobby;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getHobby()
	{
		return hobby;
	}
	
}
