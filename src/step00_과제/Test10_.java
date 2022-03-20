package step00_과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
조건) 성별 : M 이면 "남자", 나머지 "여자" 
     (삼항연산자 이용)

Input name: 들국화
Input gender: F
Input age:  25
Input tall: 173.3 

--결과--
이름 : 들국화
성별 : 여자 
나이 : 25세
신장 : 173.3cm */
public class Test10_ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		double tall;
		char g='M';
		
		System.out.print("Input name: ");
		name=br.readLine();
		System.out.print("Input gender: ");
		gender=br.readLine().charAt(0);
		System.out.print("Input age: ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Input tall: ");
		tall=Double.parseDouble(br.readLine());
		
gender=(g=='M'||g=='m')?'남':'여';
		
		System.out.print("이름 : "+name);
		System.out.print("\n성별 : "+gender+"자");
		System.out.print("\n나이 : "+age+"세");
		System.out.printf("\n신장 : %.1fcm",tall);
	}

}
