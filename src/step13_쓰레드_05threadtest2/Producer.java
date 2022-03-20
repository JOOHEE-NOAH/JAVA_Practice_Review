package step13_쓰레드_05threadtest2;

public class Producer extends Thread {
	   private VendingMachine vm;

	   public Producer(VendingMachine vm) {
	      this.vm=vm;
	   }
	   
	   @Override
	   public void run() {
	      
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() +
						" : 음료수 No. " + i + " 자판기에 넣기");
				vm.putDrink("음료수 No. " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	      
	   }
	   
	   

	}
