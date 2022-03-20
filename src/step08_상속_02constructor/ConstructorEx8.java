package step08_상속_02constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		Book bk1=new Book(); //Book에서 디폴트 생성자 이
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
		bk1.setPage(300);
		// 자바의 정석의 저자는 김자바이고 300페이지로 구성되어 있음
		System.out.println(bk1.toString());
		
		//생성자에 "jsp무조건 따라하기", "송jp",200 대입 후 getter를 이용하여 출력
		//책이름 : jsp무조건 따라하기
		//책저자 : 송jp
		//페이지 : 200
		bk1=new Book("jsp무조건 따라하기","송jp",2000);
		Book bk2=new Book("jsp무조건 따라하기","송jp",200);
		
		System.out.println("책이름 : "+bk2.getTitle());
		System.out.println("책이름 : "+bk2.getAuthor());
		System.out.println("책이름 : "+bk2.getPage());
		
	
	}

}
