package step04_메서드_01inputex;
/* eno:101 ename:뽀로로 dept:A score:85.9 를 대입하여 출력하세요
 * printf()를 이용하세요
 * 
 * -----
 * 사원번호 : 101
 * 사원이름 : 뽀로로
 * 부서코드 : A
 * 입사성적 : 85.9
 * 
 */
public class InputTest5 {

	public static void main(String[] args) {
		int eno=101;
		String ename="뽀로로";
		char dept='A';
		double score=85.9;
		
		System.out.printf("사원번호 : %d\n", eno);
		System.out.printf("사원이름 : %s\n", ename);
		System.out.printf("부서코드 : %c\n", dept);
		System.out.printf("입사성적 : %.1f\n", score);

	}

}
