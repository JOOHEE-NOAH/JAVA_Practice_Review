package step03_제어문_01;
/*
 * $ java ArgsEx 10 20 30
 * 
 * 세 수의 합 : 60  
 * 
 */
public class ArgsEx {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		System.out.println("세 수의 합 :"+(a+b+c));

	}

}
