package step03_제어문_02switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 숫자를 입력하세요 : 5
 * 
 * 5는 홀수입니다
 * 
*/
public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		System.out.print("숫자를 입력하세요 : ");
		a=Integer.parseInt(br.readLine()); 
		System.out.println();
		
		//계산 및 출력
		switch(a%2) {  //key 자리에는 계산에서 정수값만 나오면됨
		case 1: System.out.println(a+"는 홀수입니다"); break;
		case 0: System.out.println(a+"는 짝수입니다");  //마지막 case 브레이크는 생략가능
		}
		
//		
//	  case 'g': System.out.println("good"); break;
////	default : System.out.println("fail");
			
//			switch(score/10) {    //95/10 --> 9
//			case 10:
//			case 9: grade='A'; break;
//			case 8: grade='B'; break;
//			case 7: grade='C'; break;
//			case 6: grade='D'; break;
//			default: grade='F';
//		

	}



}

