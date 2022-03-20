package step00_과제;

import java.util.Scanner;

/*[문제37] 다음프로그램을 완성하시오  
(1) 클래스명: Shape
        +area:double         ==> 넓이(삼각형, 사다리꼴, 원)를 구하는 실수형변수
        +PI:double             ==> 초깃값=3.141592 , final (값 변경 안됨)
      
        +Shape()
        +menu():int   
                          화면 (***도형선택*** 1.삼각형 2.원 .....)을 작성한다. 
                          값을 입력받고, 입력 받은 값으로 main()에서 다시
                          circle/triangle/trapezoid함수를 호출할것(switch문이용 )

         +circle():void            ==>반지름을 입력받고, 원의넓이 계산한후  출력함수(output)호출
         +triangle():void        ==>밑변,높이를 입력받아,삼각형의넓이를 계산한후  출력함수(output)호출
         +trapezoid():void   ==>아랫변,윗변,높이입력받고,사다리꼴의 넓이 계산한후  출력함수(output)호출
         +output():void 
(2) Test37클래스의 main()에서
      Shape ob=new Shape();
      int n=0;
      while(true){
            n=ob.menu();
            switch(n){
                   case 1:  ob.circle();           break;
                   case 2:  ob.triangle();        break;
	     case 3:  ob.trapezoid();     break;
	     case 4: System.exit(0);
             }	
      }

**** 도형선택 *****
1. 삼각형
2. 원
3. 사다리꼴
4. 종료
선택 : 3

**** 사다리꼴넓이 ****     <== 사다리꼴=(아랫변+윗변)*높이/2
아랫변: 2
윗  변: 3
높  이: 4
넓이 : ?   <---소수이하 2째자리까지


**** 도형선택 *****
1. 삼각형
2. 원
3. 사다리꼴
4. 종료
선택 : 3

**** 삼각형의 넓이 ****
밑변 : 3
높이 : 5
넓이 : 7.5


**** 도형선택 *****
1. 삼각형
2. 원
3. 사다리꼴
4. 종료
선택 : 4

감사합니다^.^
  */
class Shape{ 
	public double area;
	public final double  PI=3.141592;
	//거의 모든 메소드에서 scanner을 중복으로 사용중->따라서 스캐너를 전역에 선언해준다.
	Scanner sc=new Scanner(System.in);
	public Shape() {

		
	}
	
	public int menu() {
		System.out.print("\n**** 도형선택 *****\n1. 원\n2. 삼각형\n3. 사다리꼴\n4. 종료\n선택 : ");
	return sc.nextInt();
	}
	public void circle() {
		System.out.print("**** 원넓이 ****\n 반지름:");
		double r=sc.nextDouble();
		area=r*r*PI;
		
		output();
	}         
	public void triangle() {		
		System.out.println("**** 삼각형의 넓이 ****");
		System.out.print("밑변 : ");
		double base=sc.nextDouble();
		System.out.print("높이 : ");
		double height=sc.nextDouble();
		area=base*height/2;
		
		output();
	}         
	public void trapezoid() {
		System.out.println("**** 사다리꼴의 넓이 ****");
		System.out.print("아랫변 : ");
		double base=sc.nextDouble();
		System.out.print("윗  변 : ");
		double top=sc.nextDouble();
		System.out.print("높이 : ");
		double height=sc.nextDouble();
		area=(base+top)*height/2;
		
		output();
	}
	public void output() {
		System.out.printf("넓이 : %.2f\n",area);
		
	}        
}



public class Test37 {

	public static void main(String[] args) {
		Shape ob=new Shape();
	      int n=0;
	      while(true){
	            n=ob.menu();
	            switch(n){
	                   case 1:  ob.circle();           break;
	                   case 2:  ob.triangle();        break;
	                   case 3:  ob.trapezoid();     break;
	                   case 4: 	System.out.println("\n감사합니다^.^");
	                	   		System.exit(0);
	             }	
	      }
	}

}
