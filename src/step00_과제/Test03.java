package step00_과제;
/*[문제3] 급여명세서를 작성하시오
조건1) 기본급이 1,500,000원,시간수당이 55,000원,세금은 기본급의 10%
조건2) 실수령액 = 기본급 + 시간수당 - 세금

--출력--     
실수령액 : 1405000원
*/
public class Test03 {

	public static void main(String[] args) {
		int a=1500000, b=55000; 
		double t=0.1;
		int r=a+b-(int)(a*t);
		
		System.out.println("실수령액 : "+r+"원");
	}

}
