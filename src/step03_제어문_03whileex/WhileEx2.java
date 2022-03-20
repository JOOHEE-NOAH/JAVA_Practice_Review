package step03_제어문_03whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 단을 입력받아 구구단을 출력하세요
 * 단을 입력하세요 : 7
 * 7 X 1 = 7
 * 7 X 2 = 14
 *   :
 * 7 X 9 = 63
 * 
 */
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a, n=1; 
		
		System.out.print("단을 입력하세요 : ");
		a=Integer.parseInt(br.readLine());
		
		while(n<=9) {
			System.out.println(a+" X "+n+" = "+a*n);
			++n; //한번 출력하고 난 이후에 n 증가
		}

	}

}
