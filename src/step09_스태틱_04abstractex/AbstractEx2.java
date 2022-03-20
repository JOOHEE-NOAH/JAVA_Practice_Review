package step09_스태틱_04abstractex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract class Shape{ //다른 패키지에 있는 이름 중복돼도 됨.
	abstract public void OnDraw();
	abstract public void OnDelete();
}
class Rectangle extends Shape{
	@Override
	public void OnDraw() {
		System.out.println("사각형을 그려요...");
	}
	@Override
	public void OnDelete() {
		System.out.println("사각형을 지워요...");
}
}
	class Triangle extends Shape{
		@Override
		public void OnDraw() {
			System.out.println("삼각형을 그려요...");
		}
		@Override
		public void OnDelete() {
			System.out.println("삼각형을 지워요...");
	}
	}
public class AbstractEx2 {

	public static void main(String[] args) {
		Shape sh=null;
		sh=new Rectangle();
		sh.OnDraw();
		sh.OnDelete();
		
		sh= new Triangle();
		sh.OnDraw();
		sh.OnDelete();
		
		Rectangle rt=new Rectangle();
		rt.OnDraw();
		rt.OnDelete();
		
		Triangle tr=new Triangle();
		tr.OnDraw();
		tr.OnDelete();
	}

}
