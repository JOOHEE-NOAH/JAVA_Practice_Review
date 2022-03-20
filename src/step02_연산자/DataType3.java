package step02_연산자;

/* 각 변수를 만들고 값을 대입하여 출력하세요
 * -------
 * 이름 : 이순신    <---printIn
 * 나이 : 25세     <---print()
 * 부서 : 개발부    <---printf() 부서 성적 함께 출력
 * 성적 : 87.5점
 * 
 */



public class DataType3 {

	public static void main(String[] args) {
		String name="이순신";
		int age=25;
		String dept="개발부";
		double score=87.5;

//		System.out.println("이름 : "+name);
//		System.out.print("나이 : "+age+"세");
//		System.out.printf("\n부서 : %s\n",dept+"\n성적 : "+score+"점");
		
		System.out.println("이름 : "+name);
		System.out.print("나이 : "+age+"세\n");
		System.out.printf("부서 : %s\n성적 : %.1f점", dept, score);

	}

}
