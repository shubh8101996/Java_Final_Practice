package multithreading;

public class YeildMethod extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + "__" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		YeildMethod y = new YeildMethod();
		y.start();
		
        Thread.yield();		


		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + "__" + i);
		}

	}

}
