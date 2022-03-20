package step01_기초;

/*
 *  각각변수를 만들어서 값을 대입하고 결과를 출력하세요
 *  (이름, 성별, 입사점수)
 *  ----
 *  이름은 강호동이며 성별은 남자이고
 *  입사성적은 85.35점 입니다
 *  
 */
public class Test1 {

	public static void main(String[] args) {
		String name="강호동";
		char gender='남';
		double score=85.35;
		
//		System.out.println("이름 : "+name);
//		System.out.println("성별 : "+gender+"자");
//		System.out.println("입사성적 : "+score);
		
		System.out.println("이름은 "+name+"이며 성별은 "+gender+"자이고\n입사성적은 "+score+"점 입니다");
		
		

	}

}
