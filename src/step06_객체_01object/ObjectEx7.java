package step06_객체_01object;


import java.util.Scanner;

/* *******사다리꼴 넓이 구하기 ******
 * 밑변을 입력하세요 : 4
 * 윗변을 입력하세요 : 5
 * 높이를 입력하세요 : 6
 * 넓이 : 27.0
 * 한번 더 수행 할까요? (Y/y) y
 * *******사다리꼴 넓이 구하기 ******
 * 밑변을 입력하세요 : 4
 * 윗변을 입력하세요 : 5
 * 높이를 입력하세요 : 6
 * 넓이 : 27.0
 * 한번 더 수행 할까요? (Y/y) y
*/
public class ObjectEx7 {

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int base, top, height;
	char ck;
	
	do {
	System.out.println("***** 사다리꼴 넓이 구하기 *****");
	System.out.print("밑변을 입력하세요 : ");
	base=sc.nextInt();
	System.out.print("윗변을 입력하세요 : ");
	top=sc.nextInt();
	System.out.print("높이를 입력하세요 : ");
	height=sc.nextInt();
	
	//Trapezoid 클래스로 객체를 만들어서 넓이를 구하기
	//1.Trapezoid 클래스로 객체 만들기
	//2.넓이 계산하기 값 대입, 계산
	//3.출력문장 만들기
	//4.출력하기
	Trapezoid tz=new Trapezoid();  //1.객체 생성
	tz.setTrapezoid(base,top,height); //2.값 대입 // 계산은 Trapezoid에 이미 생성
	System.out.println(tz.toString());// 3.출력문장은 Trapezoid에 생성
									//4. 출력하기
	
	
	System.out.print("한번 더 수행 할까요?(y/Y) ");
	ck=sc.next().charAt(0);
	
	} while(ck=='y' || ck=='Y');
	System.out.println("***** 수고요~ *****");
	sc.close();
	
	 
}	
}
