package step04_메서드_01inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* bufferedreader를 이용하여 값을 입력 받아서 출력하세요
 * 사원번호 입력 : 101
 * 사원이름 입력 : 뽀로로
 * 부서코드 : A
 * 입사성적 : 85.9
 * 
 * -----
 * 사원번호 : 101     <---println()
 * 사원이름 : 뽀로로
 * 부서코드 : A
 * 입사성적 : 85.90  <---printf()
 * 
 */
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("사원번호 입력 : "); eno=Integer.parseInt(br.readLine());
		System.out.print("사원이름 입력 : "); ename=br.readLine();
		System.out.print("부서코드 입력 : "); dept=br.readLine().charAt(0);
		System.out.print("입사성적 입력 : "); score=Double.parseDouble(br.readLine());
		System.out.println("-----");
		System.out.println("사원번호 : "+eno);
		System.out.println("사원이름 : "+ename);
		System.out.println("부서코드 : "+dept);
		System.out.printf("입사성적 : %.2f\n", score);

	}

}
