package step08_상속_02constructor;

public class Member {
	private String name="뽀로로";
	private int age=25;    //보통 입력을 하는 경우에는 객체의 형태로 저장하지는 않는다
	
public Member() { //디폴트 생성자
		
	}

	public Member(String name, int age) { //매개변수가 하나라도 있는 생성자가 존재하면 디폴트 생성자는 자동으로 생성(활성화)되지 않는다.
		super();
		this.name = name;
		this.age = age;
	}
	public void view() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

