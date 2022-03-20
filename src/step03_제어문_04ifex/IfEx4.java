package step03_제어문_04ifex;
/* 중첩 if문을 이용하여 작성하세요
 * 3개 과목의 점수를 입력 받아 합격, 불합격을 출력하세요
 * 3개 과목이 전부 40점 이상이어야 하고 평균이 60이상일때 "합격" 출력
 * 평균이 60이 넘지만 1개 과목이라도 40미만이면 "과락으로 불합격" 출력
 * 평균이 60미만이라면 "불합격" 출력
 * 
 * -----
 * 국어점수입력 : 95
 * 영어점수입력 : 85
 * 수학점수입력 : 73
 * 결과 : 합격
 * 
 * 국어점수입력 : 95
 * 영어점수입력 : 85
 * 수학점수입력 : 33
 * 결과 : 과락으로 불합격
 * 
 * 국어점수입력 : 55
 * 영어점수입력 : 45
 * 수학점수입력 : 33
 * 결과 : 불합격
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int k, e, m, tot;
		double avg;

		
		System.out.print("국어점수입력 : ");  
		k=Integer.parseInt(br.readLine());
		System.out.print("영어점수입력 : ");  
		e=Integer.parseInt(br.readLine());
		System.out.print("수학점수입력 : ");  
		m=Integer.parseInt(br.readLine());
		
		tot=k+e+m;
	    avg=tot/3.0; 
		
	    if(avg<60) {
	    System.out.println("결과 : 불합격");
	    }
	    else {
	    	if(k>=40 && e>=40 && m>=40) {
	    System.out.println("결과 : 합격");
	    	}
	    	else {
	    System.out.println("결과 : 과락으로 불합격");
	    }
	    }
	    
	    
//	    if(avg>=60) {
//	    	//중첩if
//	       if(k<40 || e<40 || m<40){
//	    System.out.println("과락으로 불합격");
//	    }else {
//	    	System.out.println("합격");
//	    }
//	      
//	    }else {
//	    	System.out.println("결과 : 불합격");
//	    }
//	    
		

	}

}
