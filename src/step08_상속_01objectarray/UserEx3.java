package step08_상속_01objectarray;
//오브젝트 객체배열-------2
public class UserEx3 {

	public static void main(String[] args) {
//		int [] num=new int[] {10,20,30};
		
//		User[] ob=new User[] {
//			new  User("kim","010-222-1111"),
//			new  User("lee","010-222-1111"),
//			new  User("park","010-333-1111")
//		}; //큰 배열 덩어리로 보자. 따라서 ,이고 마지막엔 ;세미콜론 추가 ->기존의 배열 문법과 다를게 없음.
		
		User[] ob= {new  User("kim","010-222-1111"), // 세미 콜론이 아니고 콤마임.
					new  User("lee","010-222-1111"),
					new  User("park","010-333-1111")	
		}; //-->세미콜론 주의! 배열은 선언이라 세미콜론으로 마무리
		
		for(int i=0; i<ob.length;i++)
			System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
		
		//향상된 for문(잘 안 씀)
		for (User x:ob)
			System.out.println(x.getName()+"\t"+x.getPhone());
	}
					
		
}
