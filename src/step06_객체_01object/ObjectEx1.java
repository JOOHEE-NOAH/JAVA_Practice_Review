package step06_객체_01object;

/*접근 지정자
+(public) 클래스는 반드시 public 사용. 외부에서의 접근을 허용한다는 의미.
-(private),#(protected), (defalut)명시를 하지않는경우
UML 공통적인 모델링 언어
Unit       //클래스명
-------
+          // public,변수
+
-------
+		   // 함수
+


예시

클래스명: Person
+name: String
+age: Int
+score:float


+setPerson(name:String,a:int,s:float):void
+viewPerson():void
*/
class Person { //파일이름에 한해서 앞에 public이 붙음 안그럼 에러남. //클래스명은 관행적으로 대문자로 시작 
	public String name;   //전역변수, 멤버변수(클래스가 가지고 있는 변수 )---객체지향에서는 필드라고 함. 
	public int age;
	public float score;
	public void setPerson(String name, int age, float s) { //멤버함수---->메서드(method)//관행적으로 매개변수와 멤버 변수 명을 같게 해준다.
				//set값을 대입하는 역할을 하는 애한테 보통 이름앞에 set붙여줌
		//대입-계산-출력 순
		this.name=name; //this. : 자기 자신의 객체를 의미.
		this.age=age;
		score=s;
	}
	public void viewPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
	}
}
public class ObjectEx1 {

	public static void main(String[] args) {
		int a=0; // 변수 선언 //참조에서 만들어지는 변수는 참조변수라고 함.
		Person ps=new Person(); //객체 생성-->재활용성 높아짐
		//객체 , 오브젝트, 인스턴스, 클래스 ----> 변수와 함수의 조합.
		//클래스의 오브젝트는 인스턴스---> 객체
		//클래스 다이어그램--->클래스에 대한 설계
		
		ps.setPerson("뽀로로", 23, 73.5f); //ps. : ps가 가지고있는 이라는 뜻.
		ps.viewPerson(); 
		System.out.println("뽀로로 해시: "+ps.hashCode());
		// hashCode() 해시코드: 객체 구분을 위한 고유의 정수값을 출력해주는 메서드
		
//		a=0;
//		a=100; //개별대입 가능. ps에서 다시 초기화 해주어야함.
		ps=new Person();  //객체의 변화/메모리 상에 뽀로로 데이터가 남아있지만 ps연결이 끊어져 접근이 불가.
		ps.setPerson("크롱", 20, 85.5f);
		ps.viewPerson();
		System.out.println("크롱 해시: "+ps.hashCode());//함수가 같은지 다른지 확인하는 함수.
		System.out.println(ps.toString());//객체 참조주소 리턴.
		System.out.println(ps); //객체값만 출력: 객체 참조주소 리턴
		
	}

}
