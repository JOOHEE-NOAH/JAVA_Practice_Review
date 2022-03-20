package step07_생성자_01constructor;
/*클래스 명 : ConstructorEx4
 * x:int
 * y:int
 * +ConstructorEx4()-----입력받기 (스캐너)
 * +cal():int----x*y를 리턴
 * +display():void-----출력하기
 * 
 * */
/*-----------------------
 * 가로를 입력 : 4
 * 세로를 입력 : 5
 * 사각형의 넓이 :20
 * */

import java.util.Scanner;

public class ConstructorEx4 {
		int x;
		int y;
		public ConstructorEx4() {
			Scanner sc=new Scanner(System.in);
			System.out.print("가로를 입력 : ");
			x=sc.nextInt();
			System.out.print("세로를 입력 : ");
			y=sc.nextInt();
		}
		public int cal() {
			return x*y;
		}
		public void display() {
			System.out.println("사각형의 넓이 : "+cal());
			
			
		}
	public static void main(String[] args) {
		new ConstructorEx4().display();
		//=ConstructorEx4 ob=new ConstructorEx4();
		//ob.display();
	}

}
