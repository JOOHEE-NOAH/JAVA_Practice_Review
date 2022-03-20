package step05_배열_02array;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] car= {"소나타","스파크","모닝","아반떼","말리부"}; //1차원 배열
		car[3]="산타페";
		
		for(String st:car)
			System.out.println(st);
	
	
	}

}

