package step00_과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제 20] for문을 이용해서 제곱승을 구하시오
x값을 입력하시오: 2
y값을 입력하시오: 3

2의 3승은 8입니다
*/
public class Test20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		
		System.out.print("x값을 입력하시오: ");
		x=Integer.parseInt(br.readLine());
		System.out.print("y값을 입력하시오: ");
		y=Integer.parseInt(br.readLine());
		
		int cal=x;
		
		for(int i=0;i<y-1;i++) {	
		 cal*=x;
		
			}
		System.out.println(x+"의 "+y+"승은 "+cal+"입니다");
		}
		
	}


