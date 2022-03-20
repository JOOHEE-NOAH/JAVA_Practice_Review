package step08_상속_03inheritance;
/// Branch, Leaf





//--------------------3=-----------------------------
class Branch {
	 public Branch() {
		 System.out.println("Branch default constructor"); //5.출력
	 }
	 public Branch(String str) {
		 this(); //4. 해당 생성자에서 매개변수 없는 생성자 호출
		 System.out.println(str+"Branch constructor");//6.출력
	 }
}
class Leaf extends Branch {
	public Leaf() {
		super("마바사");//3.부모 생성자에서 매개변수 하나인 생성자 호출
		System.out.println("Leaf default constructor");//7.출력
	}
	public Leaf(String str,int n) {	
	this();  //2. Leaf생성자의 매개변수 없는 디폴트 생성자 호출
		System.out.println(str+ "" +n+" Leaf constructor");//8.출력
	}
}
	
public class InheritanceEx3 {

	public static void main(String[] args) {
		new Leaf("가나다",10); //1: 매개 변수 두개짜리 Leaf생성자 호출 9.
	}

}



//------------------------------2-------------------
//class Branch {
//	 public Branch() {
//		 System.out.println("Branch default constructor"); //4. 3으로부터 호출되어 출력
//	 }
//	 public Branch(String str) {
//		 this(); //3. 매개변수 없는 이 클래스 내의 생성자 호출
//		 System.out.println(str+"Branch constructor");//5 출력
//	 }
//}
//class Leaf extends Branch {
//	public Leaf(String str) {	
//	super(str);  //2. 매개변수 하나짜리 부모 클래스의 생성자 호출
//		System.out.println(str+" Leaf constructor");//6 출력
//	}
//}
//	
//public class InheritaneceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf("hi~"); //1: 매개 변수 하나짜리 호출 7.
//	}
//
//}


//------------------------1-----------------------------
//class Branch {
//	 public Branch() {
//		 System.out.println("Branch default constructor"); //4
//	 }
//	 public Branch(String str) {
//		 this(); //3
//		 System.out.println(str+"Branch constructor");//5
//	 }
//}
//class Leaf extends Branch {
//	public Leaf() {	
//	super("hi~");  //2
//		System.out.println("Leaf default constructor");//6
//	}
//}
//public class InheritaneceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf(); //1,7
//	}
//
//}