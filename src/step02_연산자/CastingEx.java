package step02_연산자;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;  //3.3%
		//급여-(급여*세금)
		int rPay=pay-(int)(pay*tax);  //나눠줄때 정수로 나눠주기 위해 정수형으로 바꿔준거임
//		double rPay=pay-(pay*tax);
		
		System.out.println("실 수령액 : "+rPay);
		
		
		
//		----------------------------------------
//		int k=87, e=88, m=75;
//		int tot=k+e+m;
////		double avg=tot/3.0;  //3.0 자동형변환 유도  <성능이 좋음
//		double avg=(double)tot/3; //강제형변환 후 자동형변환 발생 <실무에서 더 많이 사용
//		
//		System.out.println("총점 : "+tot);
//		System.out.println("평균 : "+avg); //몫
//		System.out.printf("평균 : %.2f", avg); //몫
//		
//		byte a=100;
//		int b=a; //자동형변환
//		
//		double c=73.45;
//		int d=(int)c; //강제형변환
//		
//		System.out.println(a + " " + b);
//		System.out.println(c + " " + d);

	}

}
