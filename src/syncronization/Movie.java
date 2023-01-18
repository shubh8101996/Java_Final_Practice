package syncronization;

class TicketBook {

	static int total_seats = 50;

	public static synchronized void ticketBook(int seat) { // static synchronized we use when we have do synchronized
															// class level(not object level)

		if (total_seats >= seat) {

			System.out.println(seat + " ticket booked successfully");
			total_seats = total_seats - seat;
		} else {

			System.out.println("ohhhh sorry no ticket left");
		}

		System.out.println("only " + total_seats + " tickets are left");

	}

}

class MyThread1 extends Thread {

	TicketBook t;
	int seat;

	public MyThread1(TicketBook t, int seat) {

		this.seat = seat;
		this.t = t;
	}

	public void run() {

		t.ticketBook(seat);

	}

}

class MyThread2 extends Thread {

	TicketBook t;
	int seat;

	public MyThread2(TicketBook t, int seat) {

		this.seat = seat;
		this.t = t;
	}

	public void run() {

		t.ticketBook(seat);

	}

}

public class Movie {

	public static void main(String[] args) throws InterruptedException {

//		Thread.currentThread().setName("Main_Thread");
//
//		System.out.println("----------------------************-----------------------------");
//
//		System.out.println("Exceuting operation by Thread which is " + Thread.currentThread().getName());

		TicketBook t1 = new TicketBook();

		MyThread1 m1 = new MyThread1(t1, 15);

		m1.start();

		MyThread1 m2 = new MyThread1(t1, 15);

		m2.start();

		System.out.println("----------------------------------##########---------------------------------------");

		TicketBook t2 = new TicketBook();

		MyThread1 m3 = new MyThread1(t2, 15);

		m3.start();

		MyThread1 m4 = new MyThread1(t2, 15);

		m4.start();

	}

}
