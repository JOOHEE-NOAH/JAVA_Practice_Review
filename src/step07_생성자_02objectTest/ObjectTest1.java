package step07_생성자_02objectTest;
/*클래스명 Emp1
 * -name: String //멤버변수
 * -dept:String
 * -salary: int
 * +setEmp1(name: String, dept: String, salary: int):void
 * +printEmp();void
 * */
//ObjectTest1.java  ---> ObjectTest1.Class, Emp1.class
class Emp1{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp1(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public void printEmp() {
		System.out.println(name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다."); 
	}
}
public class ObjectTest1 {
	// 뽀로로 사원은 개발부에 근무하며 1520000원의 급여를 받습니다.
	
	
	
	public static void main(String[] args) {
		Emp1 ep=new Emp1();
		ep.setEmp1("뽀로로","개발부",1520000);
		ep.printEmp();
		
	}

}
