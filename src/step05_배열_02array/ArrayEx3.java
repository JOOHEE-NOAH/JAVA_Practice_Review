package step05_배열_02array;
//java ArrayEx3 abcd 가나다 123 12345
public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args의 길이 : "+args.length);
	
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"] : "+args[i]);
			System.out.println("args["+i+"]의 길이 : "+args[i].length()+"\n");
		}
	
		System.out.println(args);//출력하면 [Ljava.lang.String;@7de26db8 이렇게 나오는데, 참조 주소값임. 그냥 언어마다 다름.
		
	
	
	
	
	}

}
