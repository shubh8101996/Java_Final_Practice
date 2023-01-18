package syncronization;

class TotalEarning extends Thread {

	int total = 345;

	@Override
	public void run() {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		synchronized (this) {

			for (int i = 1; i <= 10; i++) {

				total = total + 100;
			}
			
			this.notify();
		}
	}
}

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		TotalEarning t = new TotalEarning();

		t.start();

		synchronized (t) {

			t.wait();
			System.out.println("Total Earning :" + t.total + "rs");

		}

	}

}
