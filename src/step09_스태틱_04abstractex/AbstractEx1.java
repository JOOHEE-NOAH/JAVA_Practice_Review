package step09_스태틱_04abstractex;

//----------3--------------------------
abstract class A{ //abstract 클래스 (추상 클래스/ 미완성 클래스)
	public void view1() {System.out.println("view1 method");}//abstract 메서드가 없어도 abstract클래스 생성 가능
	public void view2() {System.out.println("view2 method");}
}
class B extends A{
	@Override
	public void view1() { //A클래스의 view1()을 재정의---강제성이 없음
		System.out.println("view11 method");}
}
public class AbstractEx1 {

	public static void main(String[] args) {
//		A ob1=new A(); // 객체생성 불가능
//		ob1.view1(); //v1
//		ob1.view2(); //v2
		
		B ob2=new B();
		ob2.view1(); //v11
		ob2.view2(); //v2
		
		A ob3=new B();
		ob3.view1(); //v11
		ob3.view2(); //v2
	}

//---------************-2-*************--------------------
//abstract class A{ //abstract 클래스 (추상 클래스/ 미완성 클래스)
//	abstract public void view1(); //abstract 메서드(추상메서드/미완성 메서드)-->선언의 의미 
//	public void view2() {System.out.println("view2 method");}
//}
//class B extends A{
//	@Override
//	public void view1() { //A클래스의 view1()을 재정의---강제성이 있음.
//		System.out.println("view11 method");}
//}
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
////		A ob1=new A(); // 객체생성 불가능
////		ob1.view1(); //v1
////		ob1.view2(); //v2
//		
//		B ob2=new B();
//		ob2.view1(); //v11
//		ob2.view2(); //v2
//		
//		A ob3=new B();
//		ob3.view1(); //v11
//		ob3.view2(); //v2
//	}
//-----------1-------------------
//class A{ //일반 클래스
//	public void view1() {System.out.println("view1 method");}
//	public void view2() {System.out.println("view2 method");}
//}
//class B extends A{
//	@Override
//	public void view1() { //A클래스의 view1()을 재정의---강제성이 없음.
//		System.out.println("view11 method");}
//}
//public class AbstractEx1 {
//
//	public static void main(String[] args) {
//		A ob1=new A(); // 객체생성 가능
//		ob1.view1(); //v1
//		ob1.view2(); //v2
//		
//		B ob2=new B();
//		ob2.view1(); //v11
//		ob2.view2(); //v2
//		
//		A ob3=new B();
//		ob3.view1(); //v11
//		ob3.view2(); //v2
//	}

}
