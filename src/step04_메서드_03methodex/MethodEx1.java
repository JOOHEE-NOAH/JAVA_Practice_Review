package step04_메서드_03methodex;
//함수 :동작을 나타냄. 상태: 변수
//함수, function, procedure, method(객체지향에서 함수를 표현할때 메소드라고 함. 자바에서는 함수를 메소드라고 함.)
//call by name
public class MethodEx1 {

		public static void view() {// 함수 정의, 반드시 클래서 내, 함수외부에서 정의해야함.
		System.out.println("hello");
//		return; // 제어만 이동, 생략 가능
	}
	
		public static void star() { // 함수정의
			System.out.println("******");
		}
		
		
	public static void main(String[] args) {
			System.out.println();
			view(); //함수 호출/ 함수 호출은 함수 내부에서 다른 함수를 호출한다.
			star();
			view();
			star();
	
	}

}
