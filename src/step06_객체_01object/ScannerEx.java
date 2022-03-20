package step06_객체_01object;

import java.util.Scanner;

//입력처리 객체
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 : "); String str=sc.nextLine();
		System.out.print("정수 : "); int a=sc.nextInt();
		System.out.print("실수 : "); double b=sc.nextDouble();
		System.out.print("문자 : "); char c=sc.next().charAt(0);
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); //입력을 반복해서 받아야하는 경우에는 사용하지 않도록 한다.
		
	}

}
