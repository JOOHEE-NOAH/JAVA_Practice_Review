package step10_다형성_04family;

public class Mother extends Family implements Job{
	public Mother() {
		
	}
	public Mother(String name) {//이미 부모클래스가 가지고있는 함수이니 오버라이드
	super(name);
	}
	
	@Override
	public String work() {//인터페이스에서 가져올 내용이라 오버라이드
		return "엄마는 집안일을한다";
	}
	@Override
	public String toString() {//이미 부모클래스가 가지고있는 함수이니 오버라이드
		return super.toString()+work()+"\n";
	}
}

