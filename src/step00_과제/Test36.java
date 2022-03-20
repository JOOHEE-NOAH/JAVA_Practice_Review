package step00_과제;

/*[문제36]생성자 함수를 overloading하여 두수중 큰수를 출력하는 
프로그램을 완성하시오.(단, 계산과 출력은 생성자에서 할것)
(1) main()에서
new Test36(10,20);
new Test36(12.4, 9.45);
new Test36('Z', 'p');

(2) main()함수를 보고 나머지를 완성하시오

[결과화면]
max = 20
max = 12.4
max = p
*/
public class Test36 {
	public Test36() {
		
	}
	public Test36(int a, int b) {
	int c=(a>b)? a:b;
	System.out.println("max = "+c);
	}
	public Test36(double a, double b) {
		double c=(a>b)? a:b;
		System.out.println("max = "+c);
}
	public Test36(char a, char b) {
		char c=(a>b)? a:b;
		System.out.println("max = "+c);
}
	
	public static void main(String[] args) {
		new Test36(10,20);
		new Test36(12.4,9.45);
		new Test36('Z','p');
		
	}

}
