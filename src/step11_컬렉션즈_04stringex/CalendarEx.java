package step11_컬렉션즈_04stringex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Today{
	public void print() {
	//	System.out.println("오늘 날짜 : "+new Date());

	//	Calendar cal=new GregorianCalendar();
	//	Calendar cla=new Calendar();
		Calendar cal=Calendar.getInstance(); //시스템 설정시간 가져오기
	
	//	System.out.println(cal);
		System.out.println("오늘 날짜 : "
				+cal.get(Calendar.YEAR)+"년 "
				+(cal.get(Calendar.MONTH)+1)+"월 " //month 0부터 시작해서 1더해줌
				+cal.get(Calendar.DAY_OF_MONTH)+"일"
				);
		
		System.out.println("현재 시각 : "
				+cal.get(Calendar.HOUR_OF_DAY)+"시 "
				+cal.get(Calendar.MINUTE)+"분 " 
				+cal.get(Calendar.SECOND)+"초"
				);
	}
}
public class CalendarEx {

	public static void main(String[] args) {
		new Today().print();
	}

}
