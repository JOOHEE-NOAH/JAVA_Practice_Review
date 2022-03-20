package step03_제어문_03whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* switch와 while을 이용하여 메뉴 프로그램 작성
 * 1.사각형 2.삼각형 3.원 4.종료
 * 선택하세요 : 1
 * 사각형이 선택되었습니다
 * 
 * 1.사각형 2.삼각형 3.원 4.종료
 * 선택하세요 : 4
 * ***** 프로그램을 종료합니다 *****
 * 
 */
public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n; //"선택하새요" 입력받을 변수
		
		while(true) {
		System.out.print("1.사각형 2.삼각형 3.원 4.종료\n선택하세요 : ");
		n=Integer.parseInt(br.readLine());
		
		switch(n) {
		case 1: System.out.println("사각형이 선택되었습니다"); break;
		case 2: System.out.println("삼각형이 선택되었습니다"); break;
		case 3: System.out.println("원이 선택되었습니다"); break;
		case 4: 
			System.out.println("***** 프로그램을 종료합니다 *****"); 
			System.exit(0); // 0 정상종료, 강제 종료
		
		
		default: System.out.println("입력된 값이 잘못되었습니다");
		}
		
		}
		

	}

}
