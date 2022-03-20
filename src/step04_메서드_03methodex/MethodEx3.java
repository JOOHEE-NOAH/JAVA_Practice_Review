package step04_메서드_03methodex;
//call by value : 값에 의한 호출 -->매개 변수가 있는 경우
public class MethodEx3 {

	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	public static int show2(int k, int e, int m) {
		return k+e+m;
	}
	
	public static double show3(int k, int e, int m) {
		return (k+e+m)/3.0; // 이값이 더블형
	}
	
	public static String show4(int k, int e, int m) { //return이 문자열로 나오므로 String 사용
		double avg=(k+e+m)/3.0;
		if(avg>=60)
			 return "합격"; //return은 결과가 반드시 하나가 되어야 한다. 합 아니면 불합격이라 가능.
		else
			return "불합격"; 
	}
	
	public static void main(String[] args) { //()안의 값을 매개변수라고함
		
		System.out.println(show4(95, 85, 73));
		
		System.out.printf("평균 : %.2f\n", show3(95, 85, 73));
		
		
		int sum=show2(95, 85, 73); 
		System.out.println("합계 : "+sum);
		//또는
		System.out.println("합계 : "+show2(95, 85, 73));
		
		
		
		show1(10,'A', 10.5, 100.3f);
		
		
		
		
		
		
		
		
		
	}

}
