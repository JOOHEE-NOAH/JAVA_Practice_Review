package step07_생성자_01constructor;
/*클래스명 : UserInfo
 * +name:String
 * +addr:String
 * +UserInfo()
 * +UserInfo(name:String, addr:String) --->생성자
 * +getter
 * --------------------------------------
 * ***** 주소록 *****  <---디폴트 생성자에서 출력
 * 이름 : 윈터   <----main 메서드에서 getter을 이용하여 출력
 * 주소 : 마포구/대흥동
 * 
 * */
class UserInfo{
	public String name;
	public String addr;
	
	
	public UserInfo() { //---> 디폴트 생성자
		System.out.println("***** 주소록 *****");
	}
	public UserInfo(String name, String addr) {
		this();//매개변수가 없는 생성자를 호출.
		this.name= name;
		this.addr= addr;
		
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ui=new UserInfo("윈터","마포구 대흥동");
		System.out.println("이름 : "+ui.getName());
		System.out.println("주소 : "+ui.getAddr());
		
	}

}
