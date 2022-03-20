package step09_스태틱_09staticex;
//인스턴스 변수와 관련되는 작업을 하는 메서드를 인스턴스메서드라고한다.(static이 붙지 않은 메서드)
//static변수와 관련되는 작업을 하는 메서드를 static메서드(클래스 메서드)

class Test{
	int x;
	int y;
	static int z;
	static {
	//z=100;
		System.out.println("static 초기화영역");
	} //디폴트 생성자보다 먼저 동작하고 객체가 만들어진다. //
	public Test() {
		
	}
	public Test(int x, int y, int z1) {
		this.x=x;
		this.y=y;
	//	this.z=z; // static 변수라 이렇게 표기 못하고
	//	Test.z=z; // 클래스명.변수이름=매개변수;
		z=z1; 
	}
	public void view() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}
public class StaticEx1 {

	public static void main(String[] args) {
	//	new Test().view();
		Test ob1= new Test(1,2,3);
		
		Test ob2= new Test(4,5,6);
		ob1.view();
		ob2.view(); 
		
		 
	}

}
