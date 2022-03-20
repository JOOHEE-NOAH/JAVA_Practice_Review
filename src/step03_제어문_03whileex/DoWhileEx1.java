package step03_제어문_03whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//while(조건식{})은 while 안에서 조건이 만족할때 동작하게끔.
//		int n=0;
//		do {
//		
//		while(n<5) { //입력을 하기전에 반복검사를 할 수 없는 것처럼 이럴 땐 do while문을 사용한다.
//			++n;
//			System.out.println("hello java");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		do {
			System.out.print("점수를 입력하세요 : ");
			num=Integer.parseInt(br.readLine());
		}while(num<0 || num>100); 
		
		System.out.println("입력하신 점수는 "+num+"점입니다");
		
	
		

	}

}

