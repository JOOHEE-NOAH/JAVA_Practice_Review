package step07_생성자_02objectTest;
/*클래스명 Emp2
 * -name: String //멤버변수
 * -dept:String
 * -salary: int
 * +setEmp1(name: String, dept: String, salary: int):void
 * +printEmp();void
 * */
//ObjectTest1.java  ---> ObjectTest1.Class, Emp1.class
class Emp2{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp2(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String printEmp2() {
		return name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다."; 
	}
}
public class ObjectTest2 {
	// 크롱 사원은 개발부에 근무하며 1530000원의 급여를 받습니다.
	
	
	
	public static void main(String[] args) {
		Emp2 ep=new Emp2();
		ep.setEmp2("크롱","개발부",1530000);
		System.out.println(ep.printEmp2());
		
	}

}
