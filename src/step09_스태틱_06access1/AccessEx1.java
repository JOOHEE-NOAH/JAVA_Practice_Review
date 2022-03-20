package step09_스태틱_06access1;

import step09_스태틱_07access2.AccessEx3;
//import 패키지명, 클래스명;
import step09_스태틱_07access2.AccessEx4;
//임포트 단축키 Ctrl+Shit+o
public class AccessEx1 extends AccessEx4{
	private int x=10;
	private int y=20;
	public static void main(String[] args) {
		AccessEx1 a1=new AccessEx1();//멤버 변수에 접근 가능
		System.out.println(a1.x+"\t"+a1.y);
		
		AccessEx2 a2=new AccessEx2();//동일 패키지 안이라 접근 가능
		System.out.println(a2.x+"\t"+a2.y);
		
		AccessEx3 a3=new AccessEx3();
		System.out.println(a3.x+"\t"+a3.y);

		
		
		
		
//		AccessEx4 a4=new AccessEx4();
//		System.out.print(a4.x+"\t"+a4.y); //엑4는 protected라 다른 패키지에서 사용 불가.
		//따라서 엑1에서 엑4를 모체화하면 된다 extends AccessEx4
		System.out.println(a1.a+"\t"+a1.b);
	}

}

