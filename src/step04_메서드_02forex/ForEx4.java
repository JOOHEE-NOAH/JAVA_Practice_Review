package step04_메서드_02forex;
//1~100 사이의 7의 배수를 출력하세요 (continue 사용)
//7 14 21....98
public class ForEx4 {

	public static void main(String[] args) {
		//7로 나누어서 나머지가 0인값을 출력
		
		//continue, break

		for(int i=1; i<=100;i++) { //for가 멈추는 것으로 접근해야함.
			if(i%7!=0) { 
			
			continue; //  if가 아닌거 컨티뉴로 출력.
			
			}
			System.out.print(i+" ");
			
		}
		
//	--------------------내 답안------------------------	
//		for(int i=1; i<=100;i++) { //for가 멈추는 것으로 접근해야함.
//					if(i%7<=6) { 
//					break; // 1234 5번째만 빠짐
//					continue; //  1 2 3 4 6 7 8 9 10열개중 다섯번째 값만 빠지고 루프의 처음으로 돌아간다.
//					
//					}
//					System.out.print(i+" ");
					
				}
					
				
	}

	
	