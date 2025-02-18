package day0218;

public class QuizParseArgs_08 {

	public static void main(String[] args) {
		// 메인 파라메타값(args)으로 3과목의 점수를 읽어서 총점과 평균(소수점2자리)을 출력하시오
		//3과목은 java,oracle,html 총점은 tot 평균 avg
		//java=95, oracle=98, html=97
	
		
		
		int java=Integer.parseInt(args[0]);
		int oracle=Integer.parseInt(args[1]);
		int html=Integer.parseInt(args[2]);
		int tot=java+oracle+html;
		
		int cnt=3; // 3과목을 의미하는 결과값
		
		double avg=tot/cnt; //결과는 int
		double avg2=(double)tot/cnt; //결과는 더블
		
		//계산
		System.out.println("총점="+tot);
		System.out.println("평균="+avg);
		
		//printf
		System.out.printf("java=%d,oracle=%d,html=%d\n",java,oracle,html);
		System.out.printf("평균=%.02f\n",avg);
		

	}

}
