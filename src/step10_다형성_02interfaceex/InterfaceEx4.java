package step10_다형성_02interfaceex;
/*
 *클래스와 인터페이스를 이용한 성적 처리
 *클래스 명 :User
 *-name :String
 *+User()
 *+User(name: String)
 *+toString():String
 *
 *인터페이스 명: Score
 *+sol:int(초기값:20)  <---배점
 *+getScore():int  <----맞은수*sol리턴
 *
 * 인터페이스 명:Print
 * toPrint():String
 * 
 * ----InterfaceEx4에서 User,Score,Print 상속받아서 처리
 * 이름 : 홍길동
 * 점수 : 60점 
 * */
//class User  {
//	private String name;
//	public User() {
//		
//	}
//	public User(String name) {
//		super();
//		this.name=name;
//	}
//	public String toString() { //toString()의 역할 : 현재 객체의 상태(변수)를 리턴하는 문자열 생성		
//		return "이름 : "+name;
//	}
//}
//
//interface Score{
//	/*final*/public int sol=20;
//	public int getScore(); //인터페이스는 선언의 역할. 함수의 정의나 대입이 오지 않음.
//}
//
//interface Print{
//	public String toPrint();//인터페이스는 선언의 역할. 함수의 정의나 대입이 오지 않음.
//}
//
//public class InterfaceEx4 extends User implements Score, Print{
//	int n; //전역변수: 클래스 전역에서 인식될수 있는 변수
//	public InterfaceEx4(String name, int n) {//생성자의 역할:객체 생성, 멤버변수 초기화,슈퍼클래스의 생성자 호출
//	super(name);//부모클래스가 가지고 있는 변수의를 가져오기 위해 수퍼 호출
//	this.n=n; //getScore()가 n을 사용할수있도록 전역변수에 대입.
//	}
//	
//	@Override
//	public int getScore() {
//	 return	Score.sol*n;
//	}
//	
//	@Override
//	public String toPrint() {
//		return super.toString()+"\n점수 : "+getScore()+"점";
//	}
//	
//	public static void main(String[] args) {
//		InterfaceEx4 ob=new InterfaceEx4("홍길동",3); // 자동완성으로 생성자 먼저 만들기
//		System.out.println(ob.toPrint());
//	}
//
//}

//-------------같은 내용 다르게 표현-------------
class User  {
private String name;
public User() {
	
}
public User(String name) {
	super();
	this.name=name;
}
public String toString() { //toString()의 역할 : 현재 객체의 상태(변수)를 리턴하는 문자열 생성		
	return "이름 : "+name;
}
}

interface Score{
/*final*/public int sol=20;
public int getScore(); //인터페이스는 선언의 역할. 함수의 정의나 대입이 오지 않음.
}

interface Print{
public String toPrint();//인터페이스는 선언의 역할. 함수의 정의나 대입이 오지 않음.
}

public class InterfaceEx4 extends User implements Score, Print{
	int n;
	
	public InterfaceEx4(String string, int i) {
	super(string);//super클래스 쪽으로 값을 보내야함
	n=i;//값 대입--->멤버 변수를 만들어야 함
	}

@Override
public String toPrint() {
	return super.toString()+"\n점수 : "+getScore()+"점";
}

@Override
public int getScore() {
	return sol*n;
}
public static void main(String[] args) {
	InterfaceEx4 ob=new InterfaceEx4("홍길동",3); // 자동완성으로 생성자 먼저 만들기
	System.out.println(ob.toPrint());
}


}



