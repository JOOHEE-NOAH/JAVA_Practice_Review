package step09_스태틱_05employee;
/*-eno:int
 * -ename:String
 * -phone:String
 * 
 * +Emp()
 * +Emp(eno:int, ename:String, phone:String)
 * +getter
 * 
 * +setSalary(salary:long):void ----abstract
 * 
 * */
abstract public class Emp {
	private int eno;
	private String phone,ename;
	
	public Emp() {	
	}
	public Emp(int eno, String phone, String ename) {
		super();
		this.eno = eno;
		this.phone = phone;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public String getPhone() {
		return phone;
	}
	public String getEname() {
		return ename;
	}
	
	abstract public void setSalary(long salary);
	abstract public void setBonus(long bonus);
	
	}
	
