package step03_제어문_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 다음과 같이 출력하세요
 * 반지름을 입력하세요 : 5
 * 
 * 원의 넓이 : 78.5      <---3.14*r*r
 * 원의 둘레 : 31.4      <---2*3.14*r
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		double size, round;
		
		//입력(키보드입력, 파일, 네트워크, 대입)
		System.out.print("반지름을 입력하세요 : ");
		r=Integer.parseInt(br.readLine());
		
//		double area=3.14*r*r;
//		double cir=2*3.14*r;
		
		//계산
		size=3.14*r*r;
		round=2*3.14*r;
		
		//출력
		System.out.println();
		System.out.printf("원의 넓이 : %.1f\n", size);
		System.out.printf("원의 둘레 : %.1f", round);

	}

}
