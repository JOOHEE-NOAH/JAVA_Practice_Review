package step05_배열_01methodex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MethodEx8 {
	  public static void view1() {
	      System.out.println("static method");  
	   }
	
	public void view2(){//인스턴스 메서드 만들때는 static없이.
			System.out.println("non-statci method");
		}
	
	public static void main(String[] args) {
		//클래스 메서드(static) :객체 없이 호출 가능
		Math.random();//자기 자신이 가지누메서드가 아닌 경우 클래스 이름 생략 불가.
		MethodEx8.view1();
		view1();// 자기 자신이 가진 메서드에 접근할때는 클래스 이름 생략 가능.
		
		//인스턴스 메서드(instance method) : 반드시 객체를 만들어서 함수 호출-- 주로사용함.
//		Random rd=new Random(); // Random()는 생성자.
//		rd.nextInt();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
		MethodEx8 ob=new MethodEx8(); 	//앞으로 인스턴스 메서드는 주로 이런 방식으로 만듦.
		ob.view2();						//앞으로 인스턴스 메서드는 주로 이런 방식으로 만듦.

	}

}
