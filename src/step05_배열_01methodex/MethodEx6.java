package step05_배열_01methodex;
//------
//입사 총점 : 815점
//입사 결과 : 합격   <---------총점이800이상이라면 합격 아니면 불합격

public class MethodEx6 {
	public static int total(int toeic, int it) { //지역 변수
		return toeic+it;
		
	}
	
	public static String rs(int total) {
		if (total>=800) { //return (total>=800)? "합격":"불합격"; 으로 표현가능
			return"합격";
			}
			else return"불합격";	
					
	}
	public static void main(String[] args) {
		int toeic=750, it=65;
		
		System.out.println("입사 총점: "+total(toeic, it)+"점");
		System.out.println("입사 결과: "+rs(total(toeic, it)));
		
	}

	//call by value (기본자료형에 대해서 적용) 
	//=byte,char, int ,float, double, long-->자주색 글씨들 public static class 이런건 제외
	//call by reference(공유하는 공간 생성.) -->배열,객체
	}


