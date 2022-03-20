package step07_생성자_01constructor;
//constructor 생성자 : 객체 초기화 담당(메모리 할당 담당)
//문법:접근지정자 클래스명(){}

public class ConstructorEx1 {
	//접근지정자는 사용하지 않아도 동작에 큰 이상은 없으나 사용하길 권장.
	public ConstructorEx1() { //디폴트 생성자 함수형태와 비슷하나, return타입을지정하지 않는다.
		System.out.println("default constructor"); //1
	}
	public ConstructorEx1(String str) {
		System.out.println(str+" constructor"); //2
	}
	public ConstructorEx1(String str, int n) {
		System.out.println(str+""+n+" constructor");//3
	}	
	public static void main(String[] args) {
		new ConstructorEx1(); //객체 생성 ,(디폴트) 생성자 호출
		new ConstructorEx1("뽀로로"); //매개변수 생성
		new ConstructorEx1("크롱",23);
	}

}
