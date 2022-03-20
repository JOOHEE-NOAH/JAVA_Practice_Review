package step00_과제;

/*[문제 23] 단일for문과 if문을 이용해서 
1-10까지의 합을 출력하는 프로그램을 완성하시오

--출력화면--
1+2+3+4+5+6+7+8+9+10=55
*/

public class Test23 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=10;i++) {  
			sum=sum+i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else
			System.out.print("=");
			} 
		System.out.println(sum);
		
	}

}
