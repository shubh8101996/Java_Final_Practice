package multithreading;

class Medical extends Thread {

	public void run() {

		System.out.println("Excection start by " + Thread.currentThread().getName());

		try {
			System.out.println("Medical Start");
			Thread.sleep(1000);
			System.out.println("Medical passed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread {

	public void run() {

		System.out.println("Excection start by " + Thread.currentThread().getName());

		try {
			System.out.println("TestDrive Start");
			Thread.sleep(1000);
			System.out.println("TestDrive passed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class OfficerSign extends Thread {

	public void run() {

		System.out.println("Excection start by " + Thread.currentThread().getName());

		try {
			System.out.println("OfficerSign Start");
			Thread.sleep(1000);
			System.out.println("OfficerSign checked");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class LicenceDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Excection start by " + Thread.currentThread().getName());
		Thread mainThread = Thread.currentThread();

		Medical m = new Medical();
		m.start();

//		m.join(2000);
		Thread.yield();
//		Thread.sleep(3000);

		TestDrive t = new TestDrive();
		t.start();
//		Thread.sleep(3000);
//		t.join(2000);
		Thread.yield();

		OfficerSign o = new OfficerSign();
		o.start();

	}

}
