package step06_객체_01object;
/*-base:int
-top:int
-height:int

+setTrapezoid(base:int, top:int, height:int):void
+cal():double //사다리꼴의 넓이를 구해서 리턴 //사다리꼴 넓이를 구해서 리턴(base+top)*height/2
+toString():String
*/
public class Trapezoid {
	private int base;
	private int top;
	private int height;

	public void setTrapezoid(int base, int top, int height) {
		this.base=base;
		this.top=top;
		this.height=height;	
	}
	public double cal() {
		return ((double)(base+top)/2)*height;
	}
	public String toString() {
		return "넓이 : "+ cal(); //출력문장
	}
		
}
