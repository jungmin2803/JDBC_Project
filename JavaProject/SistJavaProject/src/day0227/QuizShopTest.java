package day0227;

import java.util.Calendar;

public class QuizShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		QuizShop q1=new QuizShop();
		//QuizShop q2=new QuizShop();
		QuizShop q2=new QuizShop("땅콩잼", 100, 11000);
		
		q1.setQuizShop("땅콩버터", 100, 11000);
		//q2.setQuizShop("사과", 200, 5000);
		
		QuizShop.sjName="이마트 강동지점";
		
		System.out.printf("[오늘의 입고상품(%d/%d/%d)]\n",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH));		
		
		
		q1.getQuizShop();		
		q2.getQuizShop();
		
	}

}
