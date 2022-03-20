package step10_다형성_01exception;
//사용자 정의 익셉션
class MyException extends Exception{//익셉션 상속
	public MyException() {
		System.out.println("미성년자 출입금지\n집으로 가셔~\n");
	}
}
public class ExceptionEx4 {

	public static void main(String[] args)/* throws MyException */{//이거 사용 안할거면 try-catch로 설정도 가능
		int age=Integer.parseInt(args[0]);
		
		if(age<19)
			try {
		/*throws아님*/	throw new MyException(); //익셉션 상속을 받아야 익셉션 처리 가능
			}catch (Exception e) {
				// TODO: handle exception
			}
			else
			System.out.println("어서오세요 고객님...");
		System.out.println("-------");
	}

}

