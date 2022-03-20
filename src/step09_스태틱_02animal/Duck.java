package step09_스태틱_02animal;

public class Duck extends Animal {

@Override //메소드마다 붙여줘야함.
public void walk() {
	System.out.println("두발로 걸어요..");
}
@Override
public void speak() {
	System.out.println("꽥꽥");}
}

