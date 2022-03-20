package step01_기초;

/* System.out.printf("메시지 or 서식문자", 변수1, 변수n) -서식문자 개수와 변수 개수 일치 시키기
 * --제어문자
 * %s : 문자열 String
 * %c : 문자 char
 * %d : 정수 int, char, long
 * %f : 실수 float, double
 */

//1byte=8bit
//자리값의 가중치

public class DataType2 {

	public static void main(String[] args) {
		String name="이순신";
		String dept="개발부";
		char gender='M';
		double score=85.3;
		int age=25;
		float tall=183.4f;  //float tall=(float)183.4;

		System.out.printf("이름 : %s\n",name);
		System.out.printf("부서 : %s\n",dept);
		System.out.printf("성별 : %c\n",gender);
		System.out.printf("점수 : %.2f\n",score);  //소숫점 아래 둘째자리까지 표기 
		System.out.println(score);
		System.out.println(String.format("점수 : %.2f\n",score));
		

		
		
		System.out.printf("점수 : %10.2f\n",score);
		System.out.printf("점수 : %-10.2f\n",score);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("신장 : %.1f\n",tall);
		
		
		
		
	}

}
