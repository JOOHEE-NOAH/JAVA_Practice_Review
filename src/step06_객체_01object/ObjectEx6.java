package step06_객체_01object;

import java.util.Scanner;

class MemberPhone{
	 // 선언 할땐 외부에서 선언해야함. 그래야 다른 곳에서도 사용가능
	private String name;
	private String phone;
	
	public void input() { // 받고자하면 반드시 public함수 여야함. 그래야 접근가능.
		//스캐너  또한 객체를 만들어서 사용해야함.// 스캐너: 기본자료형으로 변환 시켜줌.
		Scanner sc=new Scanner(System.in); //스캐너 객체 생성시 입력 소스 명시(System.in:키보드에서 입력받겠다는 의미)
		System.out.print("이름을 입력하세요 : ");  name=sc.nextLine(); //줄단위 입력.
		System.out.print("전화를 입력하세요 : ");  phone=sc.nextLine();
		}
	public void output() {
//		System.out.println("이름 : "+name);
//		System.out.println("전화 : "+phone);
		System.out.println(name+"고객님의 전화번호는 "+phone+"입니다.");
	}
}
public class ObjectEx6 {

	public static void main(String[] args) {
		MemberPhone mp=new MemberPhone();
		mp.input();
		mp.output();
		
		
			
	}

}
