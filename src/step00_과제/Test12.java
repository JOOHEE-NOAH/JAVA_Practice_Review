package step00_과제;

/*[문제12]성적처리프로그램
중간고사,기말고사,레포트,출석점수를 Argument로 입력받아서 계산하시오

조건1) (중간+기말)/2       ---> 60%
  과제                   ---> 20%
  출석                   ---> 20%

조건2)   90이상 'A'학점     (3)A,B학점  ---->"excellent"
   80이상 'B'학점         C,D학점  ---->"good"
   70이상 'C'학점         F학점    ---->"poor"
   60이상 'D'학점        (switch문이용) 
   나머지 'F'학점
   (if~else if문이용)

$ java Test12  90 89 99 100  

[출력화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수이하 둘째자리까지
학점=A              System.out.printf("성적 : %.2f", avg);
평가=excellent
*/
public class Test12 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		char grade1;
		String grade2;
		
		double avg1=(double)(a+b)/2;
		double avg=(((a+b)/2)*0.6)+(c*0.2)+(d*0.2);
		
		System.out.println("중간고사 : "+a);
		System.out.println("기말고사 : "+b);
		System.out.println("과제점수 : "+c);
		System.out.println("출석점수 : "+d);
		
		System.out.println();
		
		System.out.printf("성적=%.2f\n",avg);
		
		if (avg>=90) {
			grade1='A';
		} else if (avg>=80) {
			grade1='B';;
		} else if (avg>=70) {
			grade1='C';;
		} else if (avg>=60) {
			grade1='D';;
		} else {
			grade1='F';
		}
		System.out.println("학점="+grade1);
		
		switch (grade1) {
		case 'A':
		case 'B': grade2="excellent";
			break;
		case 'C':
		case 'D': grade2="good";
		default: grade2="poor";
			break;
		}	
		
		System.out.println("평가="+grade2);
		
		
	}

}
