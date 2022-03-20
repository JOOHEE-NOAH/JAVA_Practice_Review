package step03_제어문_03whileex;
/* 65~90사이의 난수 10개를 생성하세요
 * 
 * 72 69 ... 88
 */
public class DoWhileEx3 {

	public static void main(String[] args) {
		
		//??
		
		 int num, cnt=0;
			
		do {
		num=(int)(Math.random()*26+65); 
		System.out.println(num+" ");
		cnt++;
		}while(cnt<10);
		
		
		
//        int cnt=0;
//		
//		do {
//		System.out.print((int)(Math.random()*26+65)+" "); //미만이니까 26!!!!
//		cnt++;
//		}while(cnt<10);
		
		
		
		
		//내 답안
//		int a=0;
//		
//		do {
//		System.out.print((int)(Math.random()*26+65)); //미만이니까 26!!!!, print!!!!!
//		a++;
//		}while(a<10);
		
		
		
	}

}

