package step03_제어문_04ifex;
/* --변수 a를 선언하고 55또는 46을 대입한후
 * 1. 단순 if이용
 *       조건식에서 50보다 크면 "55는 50보다 크거나 같다"
 *                50보다 작으면 "46은 50보다 작다"               
 * 2. if~else 이용(a%2==0)
 *        a 변수의 값이 홀수 인지 짝수 인지 출력하세요
 * 3. if~else~if 이용
 *        a 변수의 값이 "양수", "음수", "zero"인지를 출력
 *        
 * -------
 * 55는 50보다 크거나 같다
 * 55는 홀수입니다
 * 55는 양수입니다
 * 
 */
public class IfEx3 {

	public static void main(String[] args) {
//		내풀이 
//		int a=55;
//		String str;
//		
//		if (a>=50) {
//			System.out.println(a+"는 50보다 크거나 같다");
//		}
//		if (a<=50) {
//			System.out.println(a+"은 50보다 작다");
//		}
//		
//
//		if (a%2==0)  {
//			System.out.println(a+"은 짝수입니다");
//		}
//		else {
//			System.out.println(a+"는 홀수입니다");
//		}
//		
//		if (a>=0)  {str="양수";
//		System.out.println(a+"는"+" 양수입니다");
//		}
//		else if(a<=0) {str="음수";
//		System.out.println(a+"는"+" 음수입니다");
//		}
//		else if(a==0) {str="zero";
//		System.out.println(a+"는"+" zero입니다");
//		}
				

		int a=55;
		
//		1.-----------------
		if(a>=50) {
		System.out.println(a+"는 50보다 크거나 같다");
		}
		if(a<50) {
			System.out.println(a+"은 50보다 작다");
		}
		
//		2.-----------------
		if(a%2==0)
			System.out.println(a+"는 짝수입니다");
		else
			System.out.println(a+"은 홀수입니다");
		
//		3.-------------------
		if(a>0)  System.out.println(a+"는 양수입니다 ");
		else if(a<0) System.out.println(a+"은 음수입니다 ");
		else System.out.println(a+"은 zero입니다");

		

	}

}
