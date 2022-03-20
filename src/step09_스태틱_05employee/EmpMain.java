package step09_스태틱_05employee;

import step09_스태틱_03shape.Rectangle;
import step09_스태틱_03shape.Shape;
import step09_스태틱_03shape.Triangle;

/*사원번호 : 101
 *사원이름 : 뽀로로
 *내선번호 : 1234
 *기본급여 : 250000
 *보너스+수당 : 450000
 *지급금액 : 295000원
 *
 *사원번호 : 201
 *사원이름 : 크롱
 *내선번호 : 5678
 *기본급여 : 150000
 *보너스+수당 : 225000
 *지급금액 : 1725000원
 * 조건: 보너스의 값에 150000을 수당으로 지급
 
 * */
public class EmpMain {

	public static void main(String[] args) {
		Emp em=null;
		em=new Engineer(201,"크롱","5678");
		em.setSalary(1500000);
		em.setBonus(75000);
		System.out.println(em.toString());
		
		
		em=new Developer(101,"뽀로로","1234");
		em.setSalary(2500000);
		em.setBonus(35000);
		System.out.println(em.toString());
		
		Engineer eng=new Engineer(201,"크롱","5678");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng.toString());
		
		
		Developer dev=new Developer(101,"뽀로로","1234");
		dev.setSalary(2500000);
		dev.setBonus(35000);
		System.out.println(dev.toString());
	}

}
