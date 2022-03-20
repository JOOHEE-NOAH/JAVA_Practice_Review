package step00_과제;

import java.util.Arrays;

/*[문제 34] 크기가 5인 정수형배열을 만들고 난수(1~50)를 저장하여 출력하시오

[결과화면]
-정렬 전-
num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25

-정렬 후-
num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
합 = 156*/
public class Test34 {
//임의의 기억공간 만들어서(변수) 그 공간에서 비교하며 교체하는 작업->다시 잘 교체됐는지 반복. 
	public static void main(String[] args) {
		int [] num=new int[5];	
		int sum=0;
		System.out.println("-정렬 전-");
		
		for(int i=0;i<num.length;i++) {
		num[i]=(int)(Math.random()*50+1);
		System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println("\n-정렬 후-");
		//정렬하는 코드
		int tmp=0;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {//j:비교하는 숫자, i번째의 오른쪽->ㅑ+1
				//값을 바꾸는 코드
				tmp=num[i]; //변수값 서로 바꿀때는 tmp에 미리 값 1개 옮기기.
				num[i]=num[j];
				num[j]=tmp;}
		}
		 Arrays.sort(num);
		 
		for(int i=0;i<num.length;i++) {
				System.out.println("num["+i+"]="+num[i]);
			
		}
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		
		System.out.println("\n합 = "+sum);
		
	}
}
		
		
	
	

			
		
		
	


