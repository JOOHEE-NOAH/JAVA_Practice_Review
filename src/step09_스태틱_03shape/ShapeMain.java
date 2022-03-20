package step09_스태틱_03shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape sh=null;
		sh= new Rectangle(4, 5);
		System.out.println("사각형의 넓이 : "+sh.getSize());
		
		sh=new Triangle(3, 7);
		System.out.println("삼각형의 넓이 : "+sh.getSize());
	
//		Rectangle rt=new Rectangle(4,5);
//		System.out.println("사각형의 넓이 : "+rt.getSize());
//		
//		Triangle tr=new Triangle(3, 7);
//		System.out.println("삼각형의 넓이 : "+tr.getSize());
	}

}