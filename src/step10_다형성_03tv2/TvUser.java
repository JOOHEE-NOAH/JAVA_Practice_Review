package step10_다형성_03tv2;
//다형성(Polymorphism) : 객체가 다양한 모양으로 변화 할 수 있는 것   //객체 지향의 목표.
//응집도 높을수록(고), 결합도 낮을수록 (저) 좋은 코드 (응고 결저) 

//다형성을 이용하여 결합도가 낮은 코드 생성
public class TvUser {


	public static void main(String[] args) {
		String com=args[0];
	    Tv tv=null; //tv변수를 null로 지정. // 다형성
	//	Tv tv=new LgTv();//-->마치 부모클래스의 참조변수로 자식 객체를 만드는 것과 같은 형식.
		if(com.equals("lg")|| com.equals("LG")){// .equals()객체비교: 입력되어있는 값이 lg인가?를 물어보는 것
		 tv=new LgTv(); //if lg면 tv를 lgtv로
		
		}else if(com.equals("samsung")|| com.equals("SAMSUNG")) {
		tv=new SamsungTv();//if samsug이면 tv를 samsungtv로
		
		}else {
			System.out.println("어디 회사 tv인지??");
		}
		tv.powerOn();
		 tv.volumeUp();
		 tv.volumeDown();
		 tv.powerOff();
		
	}

}
