package step00_과제;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/*[문제 21] 아래 배열의 값 중 홀수방의 합과 짝수방의 합을 구하시오(단일 for문)
int[] num={1,5,2,7,3,9,10,4,6,8};

--출력--
홀수방의 합= 33
짝수방의 합= 22

*/public class Test21 {

	public static void main(String[] args) {
		int odd=0, even=0;
		int[] num={1,5,2,7,3,9,10,4,6,8};
			
		
		
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				even+=num[i];
			}else {
				odd+=num[i];
			}
			}
			
			System.out.println("홀수방의 합= "+odd);
			System.out.println("짝수방의 합= "+even);
				
		
	}

}
