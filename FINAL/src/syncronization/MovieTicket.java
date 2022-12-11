package syncronization;

class Ticket {

	int total_seats = 10;

	public void bookTicket(int seat) { // we can use synchronized method or block

		synchronized (this) {

			if (total_seats >= seat) {

				System.out.println("ticket book successfully");
				total_seats = total_seats - seat;
				System.out.println(total_seats + " only seat left");
			} else {

				System.out.println("ohhhh sorry seats cannot be booked");
				System.out.println(total_seats + " only seat left");

			}

		}

	}
}

public class MovieTicket extends Thread {

	static Ticket t;
	int seat;

	@Override
	public void run() {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		t.bookTicket(seat);

	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Excu by Thread  " + Thread.currentThread().getName());

		t = new Ticket();

		MovieTicket m1 = new MovieTicket();
		m1.seat = 5;
		m1.start();

//		m1.join();

		MovieTicket m2 = new MovieTicket();
		m2.seat = 5;
		m2.start();

	}

}
