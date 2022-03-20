package step09_스태틱_08finalex;
//자바에서 생략가능한 것들
//class Test{
//String name="뽀로로";
//	
//	public void view() {
//		System.out.println("이름 : "+name);
//	}
//}
//		public class ObjectEx {
//	
//	
//	public static void main(String[] args) {
//		new Test().view();
//
//	}
//
//		}
import java.lang.Object;
import java.lang.String;
import java.lang.System;


class Test{
	String name="뽀로로";
	public Test() {
		super();
	}
	public void view() {
		System.out.println("이름 : "+this.name.toString()); //this 생략, toString 생략
	}
}
public class ObjectEx {	

	public static void main(String[] args) {
		new Test().view();
		Test ob=new Test();
		ob.view();
	}

		}