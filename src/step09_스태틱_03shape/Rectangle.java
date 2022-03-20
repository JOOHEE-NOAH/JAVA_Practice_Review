package step09_스태틱_03shape;

public class Rectangle extends Shape{

	public Rectangle() {
		super();
	}
	public Rectangle(int x, int y) {
		super(x,y);
	
	}
	@Override
	public double getSize() {
		return getX()*getY();
	}

}

