package step09_스태틱_01override;
//오버라이드: 함수 재정의
//상속관계에서 사용. 부모와 같은이름의 함수를 사용하지만 내용은 다를때.

class Test1{
	public void view1() {System.out.println("view1 method");}
	public void view3() {System.out.println("view3 method");}
}
class Test2 extends Test1 {
	@Override
	public void view1() {System.out.println("view11 method");}
	public void view2()	{System.out.println("view22 method");}
}
public class OverrideEx {

	public static void main(String[] args) {
		Test1 ob=new Test2(); 	//부모클래스의 참조변수로 자식객체 생성
	//	부모 참조변수    자식객체생성
		ob.view1(); //먼저 부모로 감->자식으로 가서 오버라이드 되어있는지 확인함
//					->자식에 오버라이드 돼있으면 자식에서 출력.(이 방식이 실제에선 더 효율적)
		ob.view3(); //부모 -> 자식에 가도 없음 -> 부모의 view3출력.
		//view2()는 사용 불가. 부모가 가지고 있지 않기 때문
		
//		Test2 ob=new Test2(); //클래스명 변수명 =new 생성자();
//		ob.view1(); // 자식으로 먼저가서 존재하면 출력,
//		ob.view2(); // 자식으로 먼저가서 존재하면 출력,
//		ob.view3(); // 자식으로 갔더니 없어서 부모한테 가서 출력.
		

	}

}
