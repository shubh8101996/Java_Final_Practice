package multithreading;

public class InterruptMethod extends Thread {

	public void run() {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		System.out.println(Thread.interrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println(i);
				Thread.sleep(2000);
//				System.out.println(Thread.interrupted());

			}
		} catch (InterruptedException e) {

			System.out.println("Thread is interuupted" + e);
		}

	}

	public static void main(String[] args) {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		InterruptMethod i = new InterruptMethod();
		i.start();

		i.interrupt();

	}

}
