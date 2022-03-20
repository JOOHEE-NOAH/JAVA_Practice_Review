package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* A값을 입력하세요 : 15
 * B값을 입력하세요 : 7
 * 
 * 15 + 7 = 22
 * 
 */
public class InputTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int a;
		int b;
		
		System.out.print("A값을 입력하세요 : ");  
		a=Integer.parseInt(br.readLine());
		System.out.print("B값을 입력하세요 : ");  
		b=Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println(a+" + "+b+" = "+(a+b));
				

	}

} 
