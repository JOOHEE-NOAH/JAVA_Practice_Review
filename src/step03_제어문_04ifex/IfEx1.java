package step03_제어문_04ifex;
//if 문 : 조건 검사를 수행한 후 결과에 따라 동작을 결정
public class IfEx1 {

	public static void main(String[] args) {

//		if~else if~else 문  <조건 여러개를 검사해야 할때 쓰임
		int score=95;
		char grade='\0';
		
		if (score>=90)  grade='A';  //일반적으로 쓰는 방식
		else if(score>=80)  grade='B';
		else if(score>=70)  grade='C';
		else if(score>=60)  grade='D';
		else grade='F';
		
//		if(score>=90 && score<=100)  grade='A'; //이 수식을 사용할 땐 초기화 필요
//		if(score>=80 && score<=90)  grade='B';
//		if(score>=70 && score<=80)  grade='C';
//		if(score>=60 && score<=70)  grade='D';
//		if(score>=0 && score<=60)  grade='F';
		
		System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다");
		
		

////		if~else 문
//		int score=45;
//		if(score>=60) {
//			System.out.println("합격");
//			System.out.println("점수는 "+score+"점입니다");
//		}else {
//			System.out.println("불합격");
//			System.out.println("점수는 "+score+"점이며 다음기회에...");
//		}
//		
//		
//		System.out.println((score>=60)?"합격":"불합격"); //위의 if~else문과 같은 의미의 수식
//		
//		System.out.println((score>=60)?200:100); // 200,100자리에 함수가 오면 안됨 문자, 숫자 가능
		
		
////		단순 if문------------------------
//		String str="hello";
//		
//		if(str=="hello") {
//			System.out.println("헬로우 ");
//			System.out.println("자바");
//		}
//		System.out.println("연습중"); //if 다음의 문장, if와는 관계없음

	}

}
