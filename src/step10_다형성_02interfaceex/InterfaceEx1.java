package step10_다형성_02interfaceex;
//인터페이스의 기본구조
interface Shape{
	final int r=10;
	abstract public void draw();
	abstract public void erase();
}
class Circle implements Shape{
	@Override
	public void draw() {//오버랑드 강제성 부여
		System.out.println("반지름이"+r+"인 원을 그린다..");
	}
	@Override
	public void erase() {//오버랑드 강제성 부여
		System.out.println("원을 지운다..");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		Circle cir=new Circle();
		cir.draw();
		cir.erase();
		
	}

}
//----------abstract 클로스로 바꾸어 주기---------

//abstract class Shape{
//	final int r=10;
//	abstract public void draw();
//	abstract public void erase();
//}
//abstract class Circle extends Shape{
//	@Override
//	public void draw() {//오버랑드 강제성 부여
//		System.out.println("반지름이"+r+"인 원을 그린다..");
//	}
//	@Override
//	public void erase() {//오버랑드 강제성 부여
//		System.out.println("원을 지운다..");
//	}
//}
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//	}
//
//}
//






//--------------일반 클래스-------------
//class Shape{
//	final int r=10;
//	public void draw() {}
//	public void erase() {}
//}
//class Circle extends Shape{
//	@Override
//	public void draw() {//강제성 없음.
//		System.out.println("반지름이"+r+"인 원을 그린다..");
//	}
//	@Override
//	public void erase() {//강제성 없음.
//		System.out.println("원을 지운다..");
//	}
//}
//public class InterfaceEx1 {
//
//	public static void main(String[] args) {
//		Circle cir=new Circle();
//		cir.draw();
//		cir.erase();
//		
//	}
//
//}
