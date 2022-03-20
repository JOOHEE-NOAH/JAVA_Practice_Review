package step05_배열_02array;
//가변배열 : 배열에서 가변은 값이 일정하지 않은것, 값이 일정하지 않은 것을 뜻한다.

//\t:줄바꿈 처럼 tab해주는거
public class ArrayEx7 {

	public static void main(String[] args) {
//		int [][] num=new int[][]; 이렇게 표현(행, 열) 또는
			int [][] num=new int[][] { //[행][열]--> 행 우선 표현범
				{10,20},
				{50,60,70,80}, //----------->표의 형태를 가지게 됨. 
				{90,100,110,}
			};
			
			//행,열이 있으므로 for문을 두번 사용 해준다.
			
			//System.out.println(num.length);//행의 개수:3,
			for (int i=0; i<num.length;i++) {
				for(int j=0;j<num[i].length;j++) { //num의 i번째의 j번째 값
					System.out.print(num[i][j]+"\t");  //
				}
				System.out.println();
	}

}
}