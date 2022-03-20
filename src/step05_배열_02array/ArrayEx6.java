package step05_배열_02array;
//2차원 배열 : 배열의 기억공간을 표의 형태로. []][] 두세트 사용
public class ArrayEx6 {

	public static void main(String[] args) {
	//	int [][] num=new int[3][5]; 이렇게 표현(행3, 열5) 또는
		int [][] num=new int[][] { //[행][열]--> 행 우선 표현범
			{10,20,30,40},
			{50,60,70,80}, //----------->표의 형태를 가지게 됨. 
			{90,100,110,120}
		};
		
		//행,열이 있으므로 for문을 두번 사용 해준다.
		
		//System.out.println(num.length);//행의 개수:3,
		for (int i=0; i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) { //num의 i번째의 j번째 값
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
