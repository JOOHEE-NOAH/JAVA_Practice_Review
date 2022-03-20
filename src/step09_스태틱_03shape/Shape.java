package step09_스태틱_03shape;
//생성자, getter setter
public class Shape {
	private int x;
	private int y;
	public Shape() {		
	}
	public Shape(int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getSize() {// SapeMain에서 Shape sh=null;사용할거면 이거 추가해야함.
		return 0;
	}
}

