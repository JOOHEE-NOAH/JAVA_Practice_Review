package step10_다형성_04family;

public class MainEx {

	public static void main(String[] args) {
//		Father fa=new Father("홍길동");
//		System.out.println(fa.toString());
		
	//	Family fa=new Father("홍길동");
	//	System.out.println(fa.toString()); //이걸 아래처럼 배열로 바꾸자
		
		Family [] family= new Family[]{
			new Father("홍길동"),//배열에 참조 자료형 대입
			new Mother("패티"),
			new Son("뽀로로")
		}; //배열이니 세미콜론
		
		for(Family ob:family)//패밀리 객체 생성
			System.out.println(ob.toString());//System.out.println(ob); 동일한 표현
		
		
		
		
		
		
//-------------내가한거---------------		
//		String com=args[0];
//	    Job fm=null; 
//	
//		if(com.equals("father")|| com.equals("FATHER")){
//		 fm=new Father(); 
//		
//		}else if(com.equals("mother")|| com.equals("MOTHER")) {
//		fm=new Mother();
//		
//		}else if(com.equals("son")|| com.equals("SON")) {
//			fm=new Son();
//		}
//		fm.work();
//		
	}


}
