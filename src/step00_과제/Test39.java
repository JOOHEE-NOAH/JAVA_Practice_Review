package step00_과제;

/*[문제 39]다음과 같은 결과가 나오도록 수정하시오
(단, main()안의 내용수정과 새로운 Method추가하지마시오)

[결과화면]
**** x,y,z에 값채우기***
10을 넘겨받은 생성자
10   20   을 넘겨받은 생성자
10   20   30  을 넘겨받은 생성자
10   20   30
합 : 60
------------------------------------
*/
class SuperEx
{
	int x,y,z;
	
	public SuperEx(){
		System.out.println("**** x,y,z에 값채우기***");//6
	}
	public SuperEx(int k){
		this();
		System.out.println(k + "을 넘겨받은 생성자");//5
	}
	public SuperEx(int a, int b){
		this(a);
		System.out.println(a + "   " +b+"   을 넘겨받은 생성자");//4
	}
	public SuperEx(int x,int y,int z){
    this(x,y);
    	this.x=x;
		this.y=y;
		this.z=z;
	System.out.println(x+ "   " +y+"   " +z+"   을 넘겨받은 생성자");//3
	}
	public void display(){
		
		System.out.println(this.x+"   "+this.y+"   "+this.z);//2
	}
}
class SubEx extends SuperEx
{
	public SubEx(int a,int b,int c){
		super(a,b,c);
	    this.sumData();
	    
	}	
	public void sumData(){
		super.display();
		System.out.println("합 : " + (x+y+z));//1
	}
}

public class Test39 {

	public static void main(String[] args) {
		new SubEx(10,20,30);//1. SubEx의 인자 3개인 생성자 호출
	}

}
