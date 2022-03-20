package step00_과제;

/*
 * [문제33]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1)클래스명:  BookShop
    -bname:String   (책이름)
    -author:String   (저자) 
    -price:int          (가격) 
    +setBook(bname:String,  auth  or:String, price:int):void
    +viewBook():void
    +setter & getter

(2)조건
    1) Test33클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
    2) setBook("자바완성","황완성",25000)로 값을 대입한후 viewBook()메서드로 출력한다
    3) setBname("JSP잡기"),  setAuthor("송JP"), setPrice(3500)로 값을 대입한후
         getBname(), getAuthor(), getPrice()로 출력한다

[출력화면]
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원
*/
class BookShop{
	private String bname;
	private String  author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	public void viewBook() {
		System.out.println("책이름 : "+bname);
		System.out.println("저  자 : "+author);
		System.out.println("가  격 : "+price+"원");
		
	}
	public String getBname() {
		return bname;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

//3) setBname("JSP잡기"),  setAuthor("송JP"), setPrice(3500)로 값을 대입한후
  //   getBname(), getAuthor(), getPrice()로 출력한다

public class Test33 {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		ob.setBook("자바완성","황완성",25000);
		ob.viewBook();
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		System.out.println();
		System.out.println("책이름 : "+ob.getBname());
		System.out.println("저  자 : "+ob.getAuthor());
		System.out.println("가  격 : "+ob.getPrice()+"원");
	}

}
