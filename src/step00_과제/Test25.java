package step00_과제;

/*[문제 25] argument에서 데이터를 받아 프로그램을 구현하시오
(1) main() 메서드
              :
     System.out.println("더하기: "+sum(x,y));
     System.out.println("빼기: "+sub(x,y));
     System.out.println("곱하기: "+multi(x,y));
     System.out.printf("나누기: %.2f\n", divi(x,y));

(2)입.출력 화면
$ java Test25  5 3 

더하기 : 8
빼  기 : 2
곱하기 : 15  
나누기 : 1.67*/
public class Test25 {
	public static int sum(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int multi(int x, int y) {
		return x*y;
	}
	
	private static double divi(int x, int y) {
		return (double)x/y;
	}
	
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		System.out.println("더하기: "+sum(x,y));
	     System.out.println("빼기: "+sub(x,y));
	     System.out.println("곱하기: "+multi(x,y));
	     System.out.printf("나누기: %.2f\n", divi(x,y));
	}


}
