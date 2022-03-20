package step09_스태틱_05employee;
/*
 * Emp 상속
 * -salary:long
 * -bonus: long
 * 
 * +Engineer()
 * +Engineer(int eno, String phone, String ename)
 * 
 * +toString():String
 * 
 * 조건: 보너스의 값에 150000을 수당으로 지급
*/
public class Engineer extends Emp{
 
	private long salary;
	private long bonus;
	
	public Engineer() {}

	public Engineer(int eno, String phone, String ename) {
		super(eno, phone, ename);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+150000;
	}
	public String toString() {
		return "사원번호 : "+/*super. 생략*/getEno()+
				"\n사원이름 : "+getEname()
				+"\n내선번호 : "+getPhone()
				+"\n기본급여 : "+salary
				+"\n보너스+수당 : "+bonus
				+"\n지급금액 : "+(salary+bonus)+"원\n";
	}
}