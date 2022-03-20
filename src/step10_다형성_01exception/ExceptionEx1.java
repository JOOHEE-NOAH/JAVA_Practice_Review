package step10_다형성_01exception;
///*예외처리: 에러보다는 낮음.
//* 입력값이 숫자인지 검사하는 방법 --->실수변환 시도
//* */
public class ExceptionEx1 {
//	//어떤 종류의 예외가 발생해도 Exception하나로 퉁치는 방법.
	public static void main(String[] args) {
//		int var=5;
//		try {
//		int n=Integer.parseInt(args[0]);
//		System.out.println(var/n);
//		}catch (Exception e) {
//			System.out.println("입력값에 뭔가 문제가 있습니다.");
//		}finally {//예외가 발샐해도 뭔가 처리를 해야될게 있다면 처리.
//			System.out.println("익셉션과 관련없이 항상 실행");//종료가 된다면 주로 객체를 닫아주는 작업.
//		}
//		
		
		
//===================1======================		
//try-catch:개별적으로 처리		
		/*$java ExceptionEx1 2--->2
		 **$java ExceptionEx1 0--->0으로 나눌수 없습니다
		 *$java ExceptionEx1 a--->0으로 나눌수 없습니다
		 *$java ExceptionEx1 --->0으로 나눌수 없습니다
		*/
		int var=5;
		try {int n=Integer.parseInt(args[0]);
		System.out.println(var/n);
		//exception이 발생했을 경우 원래 여기서 종료되지만 
							//예외처리를 하면 종료되지않지 않고 계속 진행할 수 있는 환경 마련.
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력된 값이 없습니다");
		}//예외 발생시 각 종류마다 이런걸 지정해 주는게 best이긴 함.
		finally {//예외가 발샐해도 뭔가 처리를 해야될게 있다면 처리.
			System.out.println("익셉션과 관련없이 항상 실행");//종료가 된다면 주로 객체를 닫아주는 작업.
		}
	//	System.out.println("-------");
	}
}

