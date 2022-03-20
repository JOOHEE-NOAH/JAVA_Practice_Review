package step10_다형성_03tv1;
//다형성(Polymorphism) : 객체가 다양한 모양으로 변화 할 수 있는 것   //객체 지향의 목표.
//응집도 높을수록(고), 결합도 낮을수록 (저) 좋은 코드 (응고 결저) 

//결합도가 높은 코드
public class TvUser {


	public static void main(String[] args) {
		String com=args[0];
		
		if(com.equals("lg")|| com.equals("LG")){// .equals()객체비교: 입력되어있는 값이 lg인가?를 물어보는 것
		 LgTv tv=new LgTv();
		 tv.powerOn();
		 tv.volumUp();
		 tv.volumDown();
		 tv.powerOff();
		}else if(com.equals("samsung")|| com.equals("SAMSUNG")) {
		SamsungTv tv=new SamsungTv();
		 tv.turnOn();
		 tv.soundUp();
		 tv.soundDown();
		 tv.turnOff();
		}else {
			System.out.println("어디 회사 tv인지??");
		}
		
	}

}
