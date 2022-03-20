package step07_생성자_01constructor;
/*생성자가 여러개일때 다른 생성자의 호출이 가능
 * this() 사용
 * 객체가 자기자신을 참조할때 사용하는 this는 생성자를 호출하기 위한 this()형태로 사용.
 * this()생성자 호출은 생성자에서만 사용 가능 /메서드에서 생성자 호출불가.
 * 생성자 내부에서 this()생성자 호출은 항상 최상단에 위치해야함.
 * */
public class ConstructorEx2 {
	public ConstructorEx2() {
		
		System.out.println("default constructor"); //4
	}
	public ConstructorEx2(int n) {
		this("가나다",n);//2
		System.out.println(n+"constructor"); //6
		}
		
	public ConstructorEx2(String str,int n) { //this(); 자기자신의 객체 , this 생성자 호출
		this();  //3
		System.out.println(str+" "+n+"constructor");//5
	}
	public static void main(String[] args) {
		new ConstructorEx2(10); //1 ,7
	}
//=====================2===================================
	/*
	 * public class ConstructorEx2 { 
	 * public ConstructorEx2() { 
	 * this("가나다",10);//2
	 * System.out.println("default constructor"); //6 
	 * } 
	 * public ConstructorEx2(String str) { 
	 * System.out.println(str+"constructor"); //4 
	 * }
	 * 
	 * public ConstructorEx2(String str,int n) { //this(); 자기자신의 객체 , this 생성자 호출
	 * this(str); //3 
	 * System.out.println(str+" "+n+"constructor");//5 
	 * } 
	 * public static void main(String[] args) { 
	 * new ConstructorEx2(); //1 ,7 
	 * }
	 */

/*
================1========================================
public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor"); //4
	}
	public ConstructorEx2(String str) {
		this(); //3
		System.out.println(str+"constructor"); //5
	}
	public ConstructorEx2(String str,int n) { //this(); 자기자신의 객체 , this 생성자 호출
		this(str);  //2
		System.out.println(str+" "+n+"constructor");//6
	}
	public static void main(String[] args) {
		new ConstructorEx2("가나다",10); //1 ,7
	}*/

}
