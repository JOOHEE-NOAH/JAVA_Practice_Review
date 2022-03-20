package step00_과제;

/*[문제 24]다중for문을 이용해서 모양을 만드시오
*****
****
***
**
*

1
21
321
4321
54321*/
public class Test24 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
		System.out.println();
		}
		
	}

}
