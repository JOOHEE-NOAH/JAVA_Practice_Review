package step09_스태틱_02animal;

public class Fish extends Animal {
@Override
public void walk() {
	System.out.println("걷지 않아요..");
}
@Override
public void speak() {
	System.out.println("소리가 없어요..");
}

}
