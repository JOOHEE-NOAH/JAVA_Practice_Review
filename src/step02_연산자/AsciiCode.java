package step02_연산자;

/* ascii 코드
 * A : 65
 * a : 97
 *  
 * 
 */

public class AsciiCode {

	public static void main(String[] args) {
		System.out.println('A'+" : "+(int)'A'); //정수변환
		System.out.println('a'+" : "+(int)'a');
		
		System.out.println(65+" : "+(char)65); //문자변환
		System.out.println(97+" : "+(char)97);
		
		System.out.println("---------------------------");
		
		System.out.println('A'+1); //char+int-->int
		System.out.println((char)('A'+1)); //괄호 묶는게 중요
		
		System.out.println('a'-32); //char+int-->int
		System.out.println((char)('a'-32));
		
		System.out.println('a'+'b'); // char+char --> int, char자리엔 반드시 문자 한개만
		System.out.println("a"+"b"); // 문자열+문자열 --> 문자열문자열

	}

}
