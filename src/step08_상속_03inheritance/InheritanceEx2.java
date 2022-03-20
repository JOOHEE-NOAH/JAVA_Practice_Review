package step08_상속_03inheritance;
//생성자


class ParentEx{//부모
	public ParentEx() {//디폴트 생성자
		super(); //object 클래스에서 상속받음
		System.out.println("parent class");//3.출력
	}
}
class ChildEx extends ParentEx{// ParentEx를 상속받는다.
	public ChildEx() {
		//이 사이에 super(); 생략가능, 없어도 동작됨. 2.슈퍼생산자 호출 super();
		System.out.println("child class"); //4.호출한 곳으로 다시 돌아와서 출력
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx(); //--->1.객체생성 5.호출한곳으로 되돌아오고 끝
	}

}

/*this. 변수
* this.메스드()
* this()
* thi(인자,인자,...) ---생성자(자기 자신의 객체가 가진 생성자 호출)
*
* super.변수
* super.메서드)
* super()
* super(인자,인자,...) -----생성자(부모 클래스의 생성자 호출)
* 
*this와 super는 같이 사용 못함
* */