package step07_생성자_01constructor;

public class ConstructorEx6 {

	public static void main(String[] args) {
		Student st=new Student();
		st.setName("홍길동");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		//홍길동의 점수는 253점이며 평균은 84.33이고 학점은 B입니다
		System.out.println(st);
		/* System.out.println(st.toString()); */
	
		//인자 4개 생성자를 이용하여 "뽀로로",90,75,88을 대입한 후
		//getter를 이용하여 출력
		// 이름 : 뽀로로
		// 국어 : 90
		// 영어 : 75
		// 수학 : 88
		// 총점 : 253
		// 평균 : 84.33
		// 학점 : B
		Student ob=new Student("뽀로로",90,75,88);
		
		System.out.println("이름 : "+ ob.getName());
		System.out.println("국어 : "+ ob.getKor());
		System.out.println("영어 : "+ ob.getEng());
		System.out.println("수학 : "+ ob.getMat());
		System.out.println("총점 : "+ ob.getTotal());
		System.out.printf("평균 : %.2f", ob.getAvg());
		System.out.println("학점 : "+ ob.getGrade());
		
		
	}	

}



