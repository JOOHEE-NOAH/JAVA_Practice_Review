package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException  {
		InputStreamReader isr=new InputStreamReader(System.in); //입력스트림처리
		BufferedReader br=new BufferedReader(isr);
		//표준입력장치 : 키보드, 표준출력장치 : 모니터, 입력장치 : 마우스, 출력장치 : 프린트
		//System.in : 콘솔 --> 키보드
		//System.out : 콘솔 --> 모니터
		
		String name;
		char gender;
		int age;
		float tall;
		double weight;
		
		System.out.print("이름을 입력하세요 : ");    name=br.readLine();
		System.out.print("성별을 입력하세요 : ");    gender=br.readLine().charAt(0); //"남\r\n
		/* charAt(index) 인덱스로 주어진 위치값에 해당하는 문자를 리턴
		 * 인덱스는 0부터 시작, 가장 큰수는 문자열-1
		 * . 의 의미
		 * 1. 포함 : 특정 객체 내부의 함수를 호출 할때 객체명, 함수명()
		 * 2. 입력 : charAt() 사용방식 
		 */
		System.out.println("나이를 입력하세요 : ");  
		age=Integer.parseInt(br.readLine());  //"23"--->23
		
		System.out.println("신장을 입력하세요 : ");  
		tall=Float.parseFloat(br.readLine());   //"175.5"--->175.5
		
		System.out.println("체중을 입력하세요 : ");  
		weight=Double.parseDouble(br.readLine()); //"63"--->63
		
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender+"잡니다");
		System.out.println("나이 : "+age+"세입니다");
		System.out.println("신장 : "+tall+"cm");
		System.out.println("체중 : "+weight);

		
		
		

	}

}
