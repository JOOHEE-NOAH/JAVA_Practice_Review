package step09_스태틱_02animal;
//동적 바인딩: 실행 시점에 호출될 함수의 결정
import java.util.Scanner;

public class AnimalMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Animal ani=null; //AnimalMain1처럼 생성해야하는 객체가 너무 많을 때 
		//수퍼객체를 대표로 만들어 작성하면 작성이 더 수월해짐. 해당방식을 더 많이 사용. 
		
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Duck 4.Fish 5Exit\n 선택하세요 : ");
			n=sc.nextInt();
			
			switch(n) {
			case 1: ani=new Dog();break;//전역변수처럼 사용  
			case 2: ani=new Cat(); break;
			case 3: ani=new Duck(); break;
			case 4: ani=new Fish();  break;
			default : System.out.println("***** 종료합니다 *****");
			sc.close();
			System.exit(0);
			}
			ani.speak(); //마지막에 알려줌. 보이는건 정적이랑 별차이 없음.
			ani.walk(); 
			
		}
	}

}
