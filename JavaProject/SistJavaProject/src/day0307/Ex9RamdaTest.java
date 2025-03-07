package day0307;

import java.util.List;
import java.util.Vector;

@FunctionalInterface
interface MySawon
{
	public void sawonAdd(String name);
}

@FunctionalInterface
interface Sales
{
	public void sangpumadd(String sangpum,int su,int dan);
}

public class Ex9RamdaTest {

	MySawon sawon1=(name)->System.out.println(name+"사원을 추가함!!!");
	Sales add=(sangpum,su,dan)->{
		System.out.println(sangpum+"상품 등록됨");
		System.out.println("수량: "+su+"개");
		System.out.println("단가: "+dan+"원");
		System.out.println("총금액: "+su*dan);
	};	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9RamdaTest ex9=new Ex9RamdaTest();
		ex9.sawon1.sawonAdd("홍길동");
		ex9.sawon1.sawonAdd("고길동");
		System.out.println("------------------------------");
		ex9.add.sangpumadd("딸기", 20, 3000);
		ex9.add.sangpumadd("텀블러", 30, 15000);
		
		//리스트
		List<String> list1=new Vector<String>();
		
		list1.add("사과");
		list1.add("오렌지");
		list1.add("사과");
		list1.add("오렌지");
		System.out.println("------------------------------");
		//출력
		for(String s:list1)
		System.out.println(s+" ");		
		
	}

}
