package step08_상속_01objectarray;
//객체배열, 오브젝트 배열....[]
public class UserEx2 {

	public static void main(String[] args) {
//		int []num=new int[3];
//		num[0]=10;
//		num[1]=20;
//		num[2]=30;
		
//	}
	User [] ob=new User[3];
	ob[0]= new  User("kim","010-222-1111"); 
	ob[1]= new  User("lee","010-222-1111");
	ob[2]= new  User("park","010-333-1111");
	//출력해주기	
	
	for(int i=0; i<ob.length;i++)
		System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
	
	//향상된 for문(잘 안 씀)
	for (User x:ob)
		System.out.println(x.getName()+"\t"+x.getPhone());

	}
}
