package step07_생성자_01constructor;
import java.util.Scanner;

/*생성자에서 두수를 입력받아 큰수와 작은수를 출력하세요.
 * show() 에서 maxValue(), minValue()를 호출할 것. //삼항연산자나 if 사용
 * 클래스명:Max
 * -a:int
 * -b:int
 * +Max()
 * +minValue():int
 * +maxValue():int
 * +show():void   --->출력을 위한
 * 
 * */
/*------------------------
 * input A : 5
 * input B : 3
 * 
 * 큰수 : 5
 * 작은수 : 3
 * 
 * */

 
 class Max {
	  private int a;
	  private int b;
	  
	  public Max() {
	  
	  Scanner sc=new Scanner(System.in);
		 System.out.print("input A : ");
		 a=sc.nextInt();
		 System.out.print("input B : ");
		 b=sc.nextInt();
		sc.close(); 
	  }
	 
	 public int minValue() {
		 return (a<b)? a:b ;
	 }
	 public int maxValue() {
		 return (a>b)? a:b ;
	 }
	 public void show() {
		 System.out.println();
		 System.out.println("큰수 : "+maxValue());
		 System.out.println("작은수 : "+minValue());
	 }
	 }
public class ConstructorEx5 {

	public static void main(String[] args) {
		new Max().show();
	
	}

}
