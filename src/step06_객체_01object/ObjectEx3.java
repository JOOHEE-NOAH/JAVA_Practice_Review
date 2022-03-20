package step06_객체_01object;
//property: getter/setter 지칭
//setter: 멤버변수 하나당 하나씩 값을 대입하는 함수
//getter: 멤버변수 하나당 하나씩 값(setter로 대입한 값)을 리턴하는 함수
class Member{
	private String name;
	private int age;
	private double tall;
	
	public void setName(String name){//setter //퍼블릭으로 지정해야 외부에서 접근가능
	 this.name=name;
	}
	
	public void setAge(int age){
	this.age=age;
	}
	public void setTall(double tall) {
		this.tall=tall;
	}
	
	public String getName() { //getter
		return name;	
	}
	public int getAge() {
		return age;
	}
	public double getTall() {
		return tall;
	}
	}
public class ObjectEx3 {

	public static void main(String[] args) {
		Member ob=new Member();
		ob.setName("뽀로로");
		ob.setAge(23);
		ob.setTall(175.5);
		System.out.println("이름 : "+ob.getName());
		System.out.println("나이 : "+ob.getAge());
		System.out.println("신장 : "+ob.getTall());
	}

}
