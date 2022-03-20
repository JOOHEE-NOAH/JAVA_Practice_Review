package step00_과제;
/*[문제5] 다음을 각각 변수에 대입해서 계산하시오

--변수--
name변수 : 민들래
kor변수 : 90 
eng변수 : 70 
mat변수 : 75

--출력--
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오

*/
public class Test05 {

	public static void main(String[] args) {
		String name="�ε鷡";
		int kor=90, eng=70, mat=75;
		int tot= kor+eng+mat;
		double avg=tot/3.0;
		
		System.out.println("�̸� : "+name);
		System.out.println("�հ����� : "+tot+"��");
		System.out.printf("������� :  %.1f",avg);
	}

}
