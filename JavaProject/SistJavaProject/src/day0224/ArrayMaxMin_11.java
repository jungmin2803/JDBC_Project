package day0224;

public class ArrayMaxMin_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {56,52,8,2,90,1111,53,79,16,-11};

		System.out.println("nums의 갯수: "+nums.length);
		
		int max=nums[0];//첫데이타를 무조건 최대값에 저장
		int min=nums[0];//첫데이타를 무조건 최대값에 저장
		
		//두번째 데이타부터 끝까지 max랑 비교 min랑 비교
		for(int i=1;i<nums.length;i++)
		{
			if(max<nums[i])
				max=nums[i]; 
			if(min>nums[i])
				min=nums[i];
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}	

}
