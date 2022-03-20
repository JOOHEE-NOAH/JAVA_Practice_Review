package step04_메서드_03methodex;

public class MethodEx4 {
	public static int total(int k, int e, int m) {
		return k+e+m;
	}
	public static double avg(int total) {
		return total/3.0;
	}
	
	public static char grade(double avg) {
			char ck;
			switch ( (int)(avg/10)) { //avg는 숫자라서 char에 사용 불가 그래서 int로 형변환 해주기 
			case 10:
			case 9:  ck= 'A'; 
					 break;    //마지막이 return이라 break 중간에 들어가도 됨.
			case 8:  ck='B'; 
					break;
			case 7:  ck='C'; 
					break;
			case 6:  ck='D'; 
					break;
			default: ck='F';
			}	return ck;
			
			
//			switch ( (int)(avg/10)) {
//			case 10:
//			case 9: return  'A'; 
//					 
//			case 8: return 'B'; 
//					 
//			case 7: return 'C'; 
//					 
//			case 6: return 'D';
//					 
//			default: return 'F';	// 중간 중간 return이 있어서 break하면  에러남. 다시 돌아가야하는데 브레이크 해버리니까.
			
		}
		public static String result(char grade) {
			String rs=null;
			
			if (grade=='F') {
				 rs="불합격";
			}
			else  rs="합격";
				
			return rs;
			}
			
		
		
		public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("총점: "+total(k,e,m)+"점");
		System.out.printf("총점: %.2f\n",avg(total(k,e,m))); //avg(253)과 같다
		System.out.println("학점: "+grade(avg(total(k,e,m))));
		System.out.println("결과: "+result(grade(avg(total(k,e,m)))));
	
		
		
		//학점: switch를 이용하여 결과 구하기
		//90이상 A 80이상B 70이상 C 60이상 D 나머지 F
		
		// 결과: if~else를 이용하여 'F'인 경우 "불합격", 나머지는 합격
//		---
//		총점 : 253점
//		평균 : 84.33
//		학점 : B
//		결과 : 합격
//		
		
		
		
		
		
		
		}
		private static String result(String grade) {
			return null;
		}
		
		
		}
	


