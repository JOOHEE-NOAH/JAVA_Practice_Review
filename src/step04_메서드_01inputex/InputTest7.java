package step04_메서드_01inputex;


/* argument를 이용하여 입력을 받아서 출력해주세요
 * $ java InputTest7 101 뽀로로 A 85.9
 * 
 * 사원번호 : 101     
 * 사원이름 : 뽀로로
 * 부서코드 : A
 * 입사성적 : 85.90  
 * 
 * ---printf()를 한번만 사용하여 출력해주세요
 * 
 */
public class InputTest7 {

	public static void main(String[] args)  {
		
		int eno=Integer.parseInt(args[0]);
		String ename=args[1];
		char dept=args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.2f", eno, ename, dept, score);
		
		
		
		
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int c=Integer.parseInt(args[2]);
//		
//		System.out.println("세 수의 합 :"+(a+b+c));
		
		
//		System.out.printf("부서 : %s\n성적 : %.1f점", dept, score);
		
//		System.out.printf("사원번호 : %d\n", eno);
//		System.out.printf("사원이름 : %s\n", ename);
//		System.out.printf("부서코드 : %c\n", dept);
//		System.out.printf("입사성적 : %.1f\n", score);

	}

}
