package step05_배열_02array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {
	//크기가 5개인 정수형 배열을 선언하고 배열에 데이터를 입력 받아서 출력하고 최대, 최소값을 출력하세요
	// bufferedreader 사용, for 사용
	//
	//----
	//
	//ar[0]의 값을 입력하세요 : 25
	//ar[1]의 값을 입력하세요 : -25
	//ar[2]의 값을 입력하세요 : 15
	//ar[3]의 값을 입력하세요 : 23
	//ar[4]의 값을 입력하세요 : 33
	//
	//25 -25 15 23 33
	//
	//최대값 : 33
	//최소값 : -25
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] ar=new int[5];
		
		for(int i=0; i<ar.length;i++) {
		System.out.print("ar["+i+"]의 값을 입력하세요 : ");
		ar[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println();
		
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
			}
		System.out.println();
		System.out.println();
		
		int max=ar[0];
		int min=ar[0];
		
		for(int i=1; i<ar.length; i++) { // 자기 자신과 비교할 필요는 없기때문에 i=1을 초기값으로 정해준다.
			if(ar[i]>max) max=ar[i];
			if(ar[i]<min) min=ar[i];
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		//------------------내 답안----------------------		
			/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				int [] num=new int[5];
				for(int i=0; i<num.length; i++) {
					System.out.print("ar["+i+"]의 값을 입력하세요 : ");
				num[i]=Integer.parseInt(br.readLine());
				
				}
				
				System.out.println();
				for(int i=0; i<num.length; i++) {
				System.out.print(num[i]+" ");
				
				}
				
				System.out.println();
				System.out.println();
				
				
				int max=num[0];
				int min=num[0];
				
				for(int i=1; i<num.length; i++) { // 자기 자신과 비교할 필요는 없기때문에 i=1을 초기값으로 정해준다.
					if(num[i]>max) max=num[i];
					if(num[i]<min) min=num[i];
				}
				System.out.println("최대값 : "+max);
				System.out.println("최소값 : "+min);
		*/
		
	}

}