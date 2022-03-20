package step08_상속_02constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		Member ob1=new Member("가나다", 22); 
		ob1.view();
		
		Member ob2=new Member(); // 디폴트 생성자를 만들어 놓지 않으면 자동으로 만들어지지않고 에러가 난다. 따라서 디폴트 생성자는 꼭 만들어두자.
		ob2.view();
		
	}

}

