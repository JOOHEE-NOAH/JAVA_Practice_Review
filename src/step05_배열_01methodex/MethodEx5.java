package step05_배열_01methodex;

public class MethodEx5 {

	public static void show1() { //call by name 방식
		System.out.println("안녕하세요~");
		return;} //생략가능
	
	public static void show2(char a, int b) { //call by name 방식
		System.out.println("코드 : "+a);
		System.out.println("값 : "+b);
	}
	
	public static String show3() {
	 return "hello";
	}
	
	public static float show4(int k, int e, int m) {
	return (float)(k+e+m)/3;  //int정수 에서 소숫값 뽑아내는거라 형변환 해줌 
	}
	
	public static void main(String[] args) {
		
		show1();
		show2('A', 25);
		System.out.println("리턴값 : :" +show3()); 
		show4(95,85,73);
		System.out.printf("리턴값 : %.2f", show4(95,85,73));

	}

	

}
