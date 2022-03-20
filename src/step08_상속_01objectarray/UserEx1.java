package step08_상속_01objectarray;
//참조변수, 객체변수, 오브젝트변수
public class UserEx1 {

	public static void main(String[] args) {
		User ob1=new User("kim","010-111-1111");
		User ob2=new User("lee","010-222-1111");
		User ob3=new User("park","010-333-1111");
		
		System.out.println(ob1.getName()+"\t"+ob1.getPhone());
		System.out.println(ob2.getName()+"\t"+ob2.getPhone());
		System.out.println(ob3.getName()+"\t"+ob3.getPhone());
	}

}
