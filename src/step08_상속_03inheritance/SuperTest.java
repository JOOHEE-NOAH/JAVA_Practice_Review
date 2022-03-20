package step08_상속_03inheritance;
//생성자, 인자 2개 생성자, toString()
public class SuperTest {
public String name;
public String addr;

public SuperTest() {
	  
}
public SuperTest(String name, String addr) {
	  super();
	  this.name=name;
	  this.addr=addr;
}
@Override   //상속한다는 뜻
public String toString() {
	  return "이름은 "+name+"이고 사는 곳은 "+addr+"입니다.";
}
}

