package step10_다형성_02interfaceex;
//----------인터페이스 표현----------
interface Cryable{
 public void cry();
}
interface Flyable{
 public void fly();
}

class Eagle implements Cryable,Flyable { 
 
 @Override
 public void fly() {
 System.out.println("독수리가 날아다녀요~");   
                
 }
 @Override
 public void cry() {
 System.out.println("까악까악");   
                
 }

 
}
public class InterfaceEx2 {

 public static void main(String[] args) {
    Eagle eg=new Eagle();
    eg.cry();
    eg.fly();
 }

}



/*----------클래스로 표현----------
abstract class Cryable{
 abstract public void cry();
}
abstract class Flyable{
 abstract public void fly();
}

class Eagle extends Flyable {   //클래스 다중상속 불가, but abstract 사용해서 편법으로 만들수있음
 
 @Override
 public void fly() {
 System.out.println("독수리가 날아다녀요~");   //2
 new CryableEx().cry();                //3
 }
 class CryableEx extends Cryable{
    
    @Override
    public void cry() {
    System.out.println("까악까악~");      //4
    }
    
 }
 
}
public class InterfaceEx2 {

 public static void main(String[] args) {
    new Eagle().fly(); //1
 }

}
*/