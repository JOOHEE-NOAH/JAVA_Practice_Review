package step09_스태틱_02animal;
//정적 바인딩: 컴파일 시점에 호출될 함수의 결정 // 동적보다 속도 빠름
import java.util.Scanner;

public class AnimalMain1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Dog dg=null; Cat ct=null; Duck dk=null; Fish fs=null;
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5Exit\n 선택하세요 : ");
			n=sc.nextInt();
			
			switch(n) {
			case 1: dg=new Dog(); dg.speak(); dg.walk(); break;
			case 2: ct=new Cat(); ct.speak(); ct.walk(); break;
			case 3: dk=new Duck(); dk.speak(); dk.walk(); break;
			case 4: fs=new Fish(); fs.speak(); fs.walk(); break;
			default : System.out.println("***** 종료합니다 *****");
			sc.close();
			System.exit(0);
			}
			
		}
	}

}
