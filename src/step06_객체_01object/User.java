package step06_객체_01object;

/* +(public),-(private),#(protected), (default)
 * 클래스명 : User
 * +name:String
 * +K:int
 * +e:int
 * +m:int
 * +setUser(name:String, k:int, e:int, m:int):void
 * +getTotal():int
 * +getUser(): String
 * */

	


public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	public void setUser(String name, int k, int e, int m) { //값 대입
	this.name=name;
	this.k=k;
	this.e=e;
	this.m=m;
	}
	public int getTotal() { //계산
		return k+e+m;
	}
	public String getUser() { // 결과 리턴
	 return "이름은 "+name+"이고 총점은 "+getTotal()+"점입니다"; //null;
	}

	public static void main(String[] args) {

	}

}
