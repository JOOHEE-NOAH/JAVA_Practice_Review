package step10_다형성_02interfaceex;
//class가 interface 상속받을때는 implements
//interface가 interface 상속받을때는 extends
interface InterA{
	
}
interface InterB{
	
}
interface InterC extends InterA, InterB{//인터페이스 간에는 다중상속 가능
	
}
public class InterfaceEx3 implements InterC{

	public static void main(String[] args) {

	}

}