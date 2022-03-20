package step04_메서드_02forex;

import java.util.Iterator;

public class ForEx2 {

	public static void main(String[] args) {
		int [] num={10,20,30,40,50}; // 배열 자료 선언. 배열은 {}안에 값을 대입해준다.값을 대입해줄 경우;입력.
		//			0, 1, 2, 3, 4
		// 보통 num의 첫번째, 두번째, 세번째 ....자료로 본다.
		// 인덱스로 읽을 때 가장 1번 방은 0, 2번방은 1.....로 표현한다. 보통 0번째부터 시작. R언어는 1번째 부터 시작.or 엑셀
		//[]는 string이던 뭐든 아무거에 사용 가능
		
		//int i=0;// 반복을 사용하는 경우에는 for의 괄호 안에 초기값을 선언
		for(int i=0; i<num.length; i++) { // num.length는 자동적으로 5가 된다. 위에 5개의 자료가 있기 때문. 1씩 증가. for-반복하고자 하는 횟수 지정 (초기값이 의미를 가지진 않고 그냥 반복 횟수만 잘 맞으면 됨.)
 		 System.out.print(num[i]+" "); //[]안에는 증감시키고 싶으면 i넣고, 한방만 반복시켜 5개 나오고 싶으면 원하는 번째 방 수 적으면 됨
 		 								// [i]넣으면 10 20 30 40 50나오고, [2] 넣으면 2번째 방인 30 30 30 30 30이 출력됨
		}
 		 
		System.out.println();
		
		//위의 방법이 불편해서 간단한 방법이 있음.
		for(int n:num) {
			System.out.print(n+" ");
		}
		
		// 편리하긴한데 좀 제한적인 방법 (배열에서 많이 사용)
		// 정수자리형을 가지는 변수를 만들어서 반복시키자. // 임의의 기억공간 n.
		//배열에 대한 반복작업 하고 싶을 때 사용. 배열 없으면 그냥 for 사용해야함
		// 역순이 없고 중간에 끊는 거 없이 그냥 끝까지 
		
		
		System.out.println();
		
//		--------------------------------------------
		String[] color= {"red","green","blue"};
		for(int n=0; n<color.length;n++) {
			System.out.print(color[n]+" ");
		}
		//반복을 위한 카운트를 해야해서 반복 선언은 정수로.
		System.out.println();
		
		//역순으로 하고싶으면, 2번째 1번째 0번째
		for(int n=color.length-1; n>=0;n--) { //length-1하는 이유: 
			System.out.print(color[n]+" ");
		}
		System.out.println();
		
		//향상된 for문으로 출력하기
		for(String col:color) {
			System.out.print(col+" ");
		}
		
		System.out.println();
		
		
		//continue, break
		for(int a=1; a<=10;a++) { //for가 멈추는 것으로 접근해야함.
			if(a==5) { 
//				break; // 1 2 3 4 : 5번째는 안나옴
			continue; //  1 2 3 4 6 7 8 9 10열개중 다섯번째 값만 빠지고 루프의 처음으로 돌아간다.
			}
			System.out.print(a+" ");
		
		
		
	}

	}}
