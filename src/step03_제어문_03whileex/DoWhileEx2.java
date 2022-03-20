package step03_제어문_03whileex;
/* do-while을 이용하여 반복 처리 하세요
 * 
 * 다시 실행 할까요?(y/Y) y
 * 다시 실행 할까요?(y/Y) Y
 * 다시 실행 할까요?(y/Y) n
 * 
 * ***** 수고하셨습니다 *****
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//1변수선언
		char ck;
		
		do {// 반복문
			// 메시지 출력 후 입력처리
			System.out.print("다시 실행 할까요?(y/Y) ");
			ck=br.readLine().charAt(0);
			
		}while(ck=='y' || ck=='Y');
		System.out.println("***** 수고하셨습니다 *****");
			
//		===========나의 풀이++++++++++	
		
//		//변수선언
//			String a;
//			
//			
//			//반복문
//			
//			do {
//				System.out.print("다시 실행할까요?(y/Y) ");
//				a=br.readLine();
//				} while (a!="y" || a!="Y");
//			
//			switch(a) {
//			case "n": System.out.println("***** 수고하셨습니다 *****");
//			System.exit(0);
//			}
//			
//			//프로그램 종료}
//			
//				//메시지 출력후 입력처리
//			// 조건검사
//			
			//수고요...		
			
	
		


	}

}
