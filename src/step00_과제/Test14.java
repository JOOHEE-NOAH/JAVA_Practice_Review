package step00_과제;

import java.util.Iterator;
import java.util.Random;

/*
 * [문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
조건1) 0 - 100 사이의 수 일것
조건2) 1줄에 6개씩 표시하시오  

--출력--
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
합=2420
*/
public class Test14 {

	public static void main(String[] args) {
	int [] random=new int[50];
	int cnt=0;
	int sum=0;
	for(int i=0;i<50;i++) { //뽑고자 하는 자료의 갯수정하기
		random[i]=(int)(Math.random()*101+0);
		System.out.print((int)(Math.random()*101+0)+"\t");
			sum+=random[i];
		
			
			// 한줄에 n개씩 표시하기:n으로 나누어 나머지가 0 
			cnt++;
			if (cnt%6==0) {
				System.out.println();
			
			}
		
		
	}
	System.out.println();
	System.out.println("합="+sum);
	}

}
