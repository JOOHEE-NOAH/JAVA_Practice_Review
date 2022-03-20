package step10_다형성_04family;

public class Son extends Family implements Job{
	public Son() {
		
	}
	public Son(String name) {//이미 부모클래스가 가지고있는 함수이니 오버라이드
	super(name);
	}
	
	@Override
	public String work() {//인터페이스에서 가져올 내용이라 오버라이드
		return "아들은 공부를 한다";
	}
	@Override
	public String toString() {//이미 부모클래스가 가지고있는 함수이니 오버라이드
		return super.toString()+work()+"\n";
	}
}

