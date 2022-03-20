package step09_스태틱_08finalex;
//상수 : 이름을 가지는 고정값, 매개변수를 주고 받을때 사용.

class Final{
	final int n=100;// 변수의 상수화, final 변수 n
	public void view(final int a) { //메인에서 파이널 지정이 안되는 건 아니지만 관행적으로 부모에 만듦
		
//		n=200; //final 변수는 값의 변경이 불가능
//		a=300; //지역변수 a는 final 변수이기 때문에 변경 불가
		System.out.println(a);
	}
}
class FinalEx extends Final{
//	@Override
//	public void view(final int a) {// final 메서드는 오버라이드 불가
//		
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		Final ob=new Final();
		
		ob.view(200);
	}

}

