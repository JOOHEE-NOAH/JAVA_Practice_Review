package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {

		//변수의 초기화
		int a=0;
		float b=0.0f; // b=0f;
//		String c="";
		String c=null; //일반적으로 위의꺼보다 더 많이 사용
		char d='\0';
		
		System.out.println(a+" "+b+" "+c+" "+d);

		
		
		
		
//		============================================
		char code='남';
		String gender;
		int x=0;

		//3항연산자 ? :
		gender=(code=='M' || code=='남')?"man":"woman";
		x=(x>=4 || x<2)?5:9;
		System.out.println("성별 : "+gender);
		
		boolean ck=true;
		System.out.println(!ck);
		
//		--------------------------------------------
//		대입연산자
//		int p=7; //우변에 있는 항을 좌변에 보내주는 것, type mismatch일어나면 우변 수정해주는 게 좋음
//		p+=2;    //p=p+2  --> p+2 --> 9
//		p*=6;    //9*6  --> 54
//		p-=4;    //50
//		p%=8;    //50%8 --> 2 (50을 8로 나눈 나머지)
//		System.out.println(p);
//		
		
		
		
//		단항연산자 ++ --
//		int k=7;
////		                            화면    메모리
//		System.out.println(k++); //  7      8      출력하고 연산
//		System.out.println(++k); //  9      9      연산하고 출력  <잘 모르겠으면 이거 사용
//		System.out.println(k);   //  9      9
//		System.out.println(--k); //  8      8
//		System.out.println(k--); //  8      7
//		System.out.println(k);   //  7      7
		
//		----------------------------------------------------
//		//산술연산자
//		System.out.println(5/3); // 몫 연산
//		System.out.println(5/3.0); // 나누기 연산
//		System.out.println(5%3); // 나머지 연산 
//	 	
//		//관계연산자
//		int a=5;
//		System.out.println(a==5); // a와 5가 같은가?
//		System.out.println(a>=5); // a가 5보다 크거나 같은가?
//		System.out.println(a<=5); // a가 5보다 작거나 같은가?
//		System.out.println(a!=5); // a와 5가 같지 않은가?
//		
//		//논리연산자 ||  &&
////		String str="korea";
////		System.out.println(str=="korea" || str=="KOREA");  //OR연산
////		
////		int score=77;
////		System.out.println(score>=70 && score<90); //AND연산
////		
//		//논리자료형
//		System.out.println("-----------------");
//		int score=77;
//		boolean sw=(score>=70 && score<90); //조건검사, 참 또는 거짓으로만 표현
//		System.out.println(sw);
		

	}

}
