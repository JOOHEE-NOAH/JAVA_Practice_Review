package step03_제어문_02switchex;
/*args로 입력된 month로 일수를 구하세요   // /*누르고 Ctrl+엔터
 * $ java SwithchEx3 3
 * 
 * 3월은 31일까지 있습니다
 */
public class SwitchEx3 {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int day=0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31; break;
		case 2: day=28; break;
		default: day=30;
		}
		System.out.println(month+"월은 "+day+"일까지 있습니다");

	}

}

