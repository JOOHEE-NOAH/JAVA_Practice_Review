package step10_다형성_05instance;
//instanceof를 이용한 연산의 결과가 true이며 검사한 자료형으로 형변환 가능.

class Family{}
class Father extends Family{}
class Mother extends Family{}
class Son extends Family{}
public class InstanceofEx1 {

	public static void main(String[] args) {
		Family family=new Family(); // 패밀리만 가지고 객체생성
		Father father=new Father(); //
		Son son=new Son();
		
		System.out.println(father instanceof Family); //주로 instanceof + 클래스명 //true
		// true이면 형변환 가능
		Family fm1=new Father();
		Family fm2=(Family)(new Father());// 형변환
		Family fm3=(Family)father;
		
		System.out.println(son instanceof Family);// true
		System.out.println(family instanceof Father);// false 
		System.out.println(son instanceof Son);// true
		
//		System.out.println(mother instanceof Son); //error
		
	}

}
