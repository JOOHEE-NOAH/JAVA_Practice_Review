package step06_객체_01object;

/*클래스명: Sales
-item:String
-qty:int
-cost:int
+setter
+getter

+toString():String <--- 출력문장
+getPrice():int    <---- 수량*단가를 리턴



품목 : apple	<-----toString()을 이용하여 출력
수량 : 5
단가 : 1200원
금액 : 6000원



apple 1200원 짜리 5개 구입하려면 6000원이 필요함    <---getter를 이용하여 main에서 출력



*/
class Sales{
	private String item;
	private int qty;
	private int cost;
	
	public int getPrice() {  //꼭 setPrice()가 필요한건 아님
		return cost*qty;
	}
	
	public String getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	public String toString() { //결과로 보여주고 싶은 문자열을 만드는 함수
		return "품목 : "+item+"\n수량 : "+qty+"\n단가 : "+cost+"원\n금액 : "+ getPrice() +"원";              //
	}
	
}


public class ObjectEx5 {

	public static void main(String[] args) {
		Sales em=new Sales();	//변수선언
		em.setItem("apple"); //초기화, 값의 대입
		em.setQty(5);
		em.setCost(1200);
		
		
		System.out.println(em.toString());//.toString()생략가능.
	
		System.out.println();
		
		
		System.out.println(em.getItem()+em.getCost()+"원 짜리 "+em.getQty()+"개 구입하려면 "+em.getPrice()+"원이 필요함");
		

		
		
	
	}

}
