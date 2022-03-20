package step03_제어문_04ifex;
//중첩 if문 : if 안에서 또 다른 if 문의 동작

public class IfEx2 {

	public static void main(String[] args) {
		int age=15;
		
		if(age<=19) {
			System.out.println("애들은 가라~");
		}else {
			if (age>=30) {
				System.out.println("국빈관으로 가세요~");
			}else {
				System.out.println("어서오세요~");
			}
		}

		
		
		
	}

}
