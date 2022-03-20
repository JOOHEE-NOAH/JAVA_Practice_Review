package step04_메서드_02forex;

public class ForEx1 {

	public static void main(String[] args) {
		
		//100 97 94 ... 82
		
		
		for(int i=100; i>=80;i-=3) { //  i에서 3씩 감소한다는 의미
			System.out.print(i+" ");	
			}
		
		for(char i='A'; i<='Z'; i++) {
			System.out.println(i+" ");
		}
		
//		내답안
//		for(int i=100; i>=82;i--) {  
//			
//		System.out.print(i+" ");	
//			i=i-2;
//		}
		
		
		
//		for(char i='a'; i<='z'; i++) {
//			System.out.print(i+" ");
//		}
//		
		
		
//		----------------1-----------------------------
//		int sum=0, odd=0, even=0; //반드시 초기화 해주어야함 
//		
//		for(int i=1; i<=100;i++) {   //초기값을 선언    -->1부터 100까지
//		
//			sum+=i; // sum=sum+i;
//			//짝수합, 홀수합을 계산하여 출력하세요
//			switch(i%2) {
//			case 1: odd+=i; break;
//			case 0: even+=i; break;
//			}
//			
//		}
//		
//		System.out.println("1-100 까지의 합 : "+sum);
//		System.out.println("1-100 까지의 홀수합 : "+odd);
//		System.out.println("1-100 까지의 짝수합 : "+even);
//		
		
		
		
		//내 (틀린)답안
//for(int i=1; i<=100;i++) { 
//			
//			i++;
//			odd+=i;
//			
//		}
//        for(int i=2; i<=100;i++) { 
//			
//			i++;
//			even+=i;
//			
//		}
		
		
	}

}
