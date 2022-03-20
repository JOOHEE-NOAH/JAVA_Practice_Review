package step03_제어문_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* inputstreamreader, bufferedereader
 * 이름 : 강호동
 * 나이 : 23
 * 성별 : 남
 * 
 * 이름은 강호동입니다
 * 나이는 23세입니다
 * 성별은 남자 입니다
 * 
 */
public class InputTest3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(isr);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String name;
		int age;
//		String gender;
		char gender;
		
	
		System.out.print("이름 : ");  
		name=br.readLine();
		System.out.print("나이 : ");  
		age=Integer.parseInt(br.readLine());
//		System.out.print("성별 : ");  
//		gender=br.readLine();
		System.out.print("성별 : ");
		gender=br.readLine().charAt(0);
		
		
//		System.out.println("이름은 "+name+"입니다\n나이는 "+age+"세입니다\n성별은 "+gender+" 입니다");
		System.out.println("이름은 "+name+"입니다");
		System.out.println("나이는 "+age+"입니다");
		System.out.println("성별은 "+gender+"자 입니다");

	}

}
