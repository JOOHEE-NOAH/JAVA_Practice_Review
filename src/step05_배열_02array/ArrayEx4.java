package step05_배열_02array;
//args를 이용하여 세 수를 입력받아서 최댓값, 최솟값 출력
//$ java ArrayEx4 10 15 23
//
//최대값 : 23
//최소값 : 10

public class ArrayEx4 {

	public static void main(String[] args) {
		int [] num=new int[3]; //또는 int [] num= {1,2,3} 이런식으로 확정해주던지
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
	
//		System.out.println(num);
		//최대값 최소값
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) { // 자기 자신과 비교할 필요는 없기때문에 i=1을 초기값으로 정해준다.
			if(num[i]>max) max=num[i];
			if(num[i]<min) min=num[i];
			
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}
