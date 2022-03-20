package step10_다형성_03tv2;
////오버라이드는 모두 생략했음
public class LgTv implements Tv{
public void powerOn() {
	System.out.println("LG TV - 전원을 켠다");
}
public void powerOff() {
	System.out.println("LG TV - 전원을 끈다");
}
public void volumeUp() {
	System.out.println("LG TV - 소리를 높인다");
}	
public void volumeDown() {
	System.out.println("LG TV - 소리를 줄인다");	
}
}

