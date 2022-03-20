package step05_배열_01methodex;
//배열은 참조자료형을 사용한다.
//call by reference ;참조에 의한 호출, 함수의 매개변수를 참조주소로 전달하는 방식
//call by vaule와 다른점: main에서 쓰인 변수의 값을 메소드에서 바꿀수 있냐 없냐의 차이. value는 불가능.
//reference는 메소드에서 배열의 값을 바꾸면 main의 값에도 영향을 준다.
public class MethodEx7 {

	public static void view1(int[] num) {//받는 쪽에서도 똑같이 정수 배열 형으로. main에서 사용하는 지역변수와 동일해야함.
		System.out.println("view1의 수정전 : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		num[0]=100;
		System.out.println("view1의 수정후 : ");
		for(int n:num)
			System.out.print(n+" ");
	}
	
	
	public static void main(String[] args) {
		int [] num= {10,20,30,40,50};
		System.out.println("view1 호출전 : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		view1(num); //call by value와 달리 ()변수의 이름만 들어감
		System.out.println();
		System.out.println("view1 호출후 : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		
		String str="happy";
		System.out.println("view2 호출전 : "+str);
		view2(str);
		System.out.println("view2 호출후 : "+str);
		
	}


	public static void view2(String str) {
	 System.out.println("view2 수정전 : "+str);
	 str="hello";
	 System.out.println("view2 수정후 : "+str);
	}

	

}
