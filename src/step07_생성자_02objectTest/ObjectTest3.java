package step07_생성자_02objectTest;

/*클래스명 Emp3
-name :String //멤버변수
-dept :String
-salary:int
+getter
+setter
+toString():String
*/
class Emp3{
private String name;
private String dept;
private int salary;

	public String getName() {
	return name;
}

public String getDept() {
	return dept;
}

public int getSalary() {
	return salary;
}

public void setName(String name) {
	this.name = name;
}

public void setDept(String dept) {
	this.dept = dept;
}

public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return name+"은 "+dept+"에 근무하며 "+salary+"원의 급여를 받습니다.";
}
}
public class ObjectTest3 {
 
	public static void main(String[] args) {
		Emp3 em=new Emp3();
		em.setName("뽀로로");
		em.setDept("개발부");
		em.setSalary(1520000);
		System.out.println(em.toString());
		
		System.out.println("이름 : "+em.getName());
		System.out.println("부서 : "+em.getDept());
		System.out.println("급여 : "+em.getSalary()+"원");
	}


}