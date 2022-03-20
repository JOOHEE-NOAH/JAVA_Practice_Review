package step05_배열_02array;
//배열 : 동일한 자료형의 연속된 기억공간
public class ArrayEx1 {

	public static void main(String[] args) {
//		1차원 배열
		
//		int [] num= {10,20,30,40,50}; //int a=10;
		int [] num=new int[5];//--->기억공간이 5개라는 뜻 //int a; 이렇게만 선언한 상태
		num[0]=10;	          //0번째 방에 10을 대입해준다	
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
		
		System.out.println();
		//향상된 for문을 이용하여 출력해주세요
		
		for(int n:num) {
			System.out.println(n+" ");
		}
		
		System.out.println();
		
		//역순으로 num을 출력해주세요.
		
		for(int i=num.length-1; i>=0;i--) {
			System.out.println(num[i]+" ");
		}
		
		
		
		
		
		
	}

}
