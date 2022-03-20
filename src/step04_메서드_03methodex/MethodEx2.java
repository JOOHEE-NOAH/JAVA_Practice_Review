package step04_메서드_03methodex;
//call by name : 이름에 의한 호출
//문법: 접근지정자 static 리턴값의 자료형 함수명(){} static은 생략 가능

public class MethodEx2 {
	
	public static int view1() { //int 의미: 리턴 할 값의 자료형
		return 10; //반드시 리턴을 해야한다.
	}
	public static char view2() { 
		return 'A';
	}	
	public static float view3() { 
			return 50.3f;
	}
	public static double view4() { 
		return 100.4;
}
	public static String view5() { 
		return "hello";
	}
	public static boolean view6() { 
			return true;
	}	

	
	
	public static void main(String[] args) {
		
		int a=view1(); System.out.println(a); // 출력을 해야지만 사용할 수 있음
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c);
		System.out.println(view3()); // 이렇게도 표현가능
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
	}
	


}
