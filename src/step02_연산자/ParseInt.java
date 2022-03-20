package step02_연산자;
//파싱(parsing) : 구문 분석 
public class ParseInt {

	public static void main(String[] args) {
	String a="100"; //문자열 100
	String b="200";
//	int a=100; // 숫자 100
	
	int a1=Integer.parseInt(a);  //"100"-->100으로 변환
	int b1=Integer.parseInt(b);
	
	float a2=Float.parseFloat(a); // 여긴 f 붙일 필요 없음
	float b2=Float.parseFloat(b);
	
	double a3=Double.parseDouble(a); 
	double b3=Double.parseDouble(b);
	
	System.out.println(a+b); //연결의 의미
	System.out.println(a1+b1); //더하기
	System.out.println(a2+b2);
	System.out.println(a3+b3);

	
	}

}
