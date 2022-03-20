package step01_기초;

/*
 * + 기호의 의미
 * 1. 더하기
 * 2. 연결하기
 * 3. 단항연산자
 */
public class SumTest {

	public static void main(String[] args) {
		//세미콜론 문장의 끝을 알려주는 의미
		int a=5, b=7; //변수 선언
		System.out.println(a+b); // 더하기
		System.out.println("a+b="+(a+b)); // 연결하기 (앞의 문자열과 뒤의 문자열의 연결)
		System.out.println(a+"+"+b+"="+(a+b));
		

	}

}
