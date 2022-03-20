package step03_제어문_01;

import java.util.Random;

//난수 함수 : 컴퓨터가 임의의 숫자를 발생 , 의사난수(pseudo random)
public class RandomEx {

	public static void main(String[] args) {
		//Math 클래스 이용
		System.out.println(Math.random()); //0부터 1미만의 실수난수 생성 0~0.99999999999999...
		System.out.println((int)(Math.random()*10+1)); //1~11미만
		System.out.println((int)(Math.random()*31+50)); //50~81미만의 정수난수 생성
		System.out.println((int)(Math.random()*30+51)); //51~81미만의 난수 생성
		
		//Random 클래스
		Random rd=new Random();
		int a=rd.nextInt(100)+1; //1부터 101 미만의 정수
		int b=rd.nextInt(101)+0; //0부터 101 미만의 정수
		int c=rd.nextInt(31)+50; //50~81 미만
		
		System.out.println(a+" "+b+" "+c);
		
	
		
		

	}

}
