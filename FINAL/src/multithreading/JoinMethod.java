package multithreading;

public class JoinMethod {

	static Thread mainthread;

	public void run() throws InterruptedException {

		mainthread.join();

		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println(Thread.currentThread().getName() + "__" + i);

				Thread.sleep(1000);

			}
		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) throws InterruptedException {

		mainthread = Thread.currentThread();

		YeildMethod y = new YeildMethod();
		y.start();

//		y.join();

		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println(Thread.currentThread().getName() + "__" + i);

				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
