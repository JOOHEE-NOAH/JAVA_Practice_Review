package step09_스태틱_09staticex;
//jvm가배지컬렉션: 적정한 시점에 jvm이 정리 static 초기화부터 프로그램 종료시까지 있다가 프로그램 종료 후 jvm이 정리
import java.util.Scanner;

class EC{
	private static double rate; //달러당 원화
	
	public static void setRate(double r) {
		rate=r;
	}	
	public static double toDollar(int won) { 
		return won/rate;}
		public static double toWon(int dollar) { 
			return dollar/rate;}
	}

public class StaticEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rate;
		System.out.println("달러당 환율을 입력하세요 : ");
		rate=sc.nextDouble();
		
		EC.setRate(rate);
//		System.out.println("1 달러는 "+EC.toDollar(1000000)+"원입니다");
	}

}
