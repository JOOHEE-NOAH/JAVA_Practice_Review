package step06_객체_01object;
//이름은 뽀로로이고 개발부에 근무하며 급여는 1500000원, 입사성적은85.75점입니다.
/*
* 
* 
* 
* setEmployee()를 이용하여 값을 대입하고 출력하세요
* 사원이름 : 진달래
* 근무부서 : 총무부
* 받는급여 : 1500000원
* 입사성적 : 85.75점

*/
public class ObjectEx4 {

	public static void main(String[] args) {
		
		int a; // 변수 선언
		a=100; // 초기화, 값의 대입 
		// 계산
		System.out.println(a); //결과 출력
		
		Employee em=new Employee();	//변수선언
		em.setName("뽀로로"); //초기화, 값의 대입
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(85.75);
		
		System.out.println(em.toString());
	
		System.out.println();
		
		
		em=new Employee();//객체의 멤버변수 초기화
		em.setEmployee( "진달래", "총무부", 1500000, 85.75);// 초가화, 값의 대입
		System.out.println("사원이름 : "+em.getName());
		System.out.println("근무부서 : "+em.getDept());
		System.out.println("받는급여 : "+em.getPay()+"원");
		System.out.println("입사성적 : "+em.getScore()+"점");
		
		Employee ob=new Employee();//새로운 변수 넣으려면 앞에 Employee 나와야함
		ob.setEmployee( "진달래", "총무부", 1500000, 85.75); //ob 초기화된 상태
		
		System.out.println("사원이름 : "+ob.getName());
		System.out.println("근무부서 : "+ob.getDept());
		System.out.println("받는급여 : "+ob.getPay()+"원");
		System.out.println("입사성적 : "+ob.getScore()+"점");
		}
	}	
	
		
	

