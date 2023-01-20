package abc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("*****************DATE********************");

		LocalDate date = LocalDate.now();

		System.out.println(date);

//		System.out.println(date.toString().replace("-", "_"));

		LocalTime time = LocalTime.now();
		System.out.println(time);

		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();

		System.out.println(day + " " + month + " " + year);

		System.out.printf("%d-%d-%d", day, month, year);

		System.out.println();

		System.out.println("*****************TIME********************");

		int hours = time.getHour();
		int minutes = time.getMinute();
		int seconds = time.getSecond();
		int nanosec = time.getNano();

		System.out.printf("%d:%d:%d:%d", hours, minutes, seconds, nanosec);

		System.out.println();

		System.out.println("*****************DATE AND TIME BOTH********************");

		LocalDateTime dt = LocalDateTime.now();

		System.out.println(dt);
		System.out.println(dt.toString().replace("T", " "));

		int day1 = dt.getDayOfMonth();
		int month1 = dt.getMonthValue();
		int year1 = dt.getYear();
		int hours1 = dt.getHour();
		int minutes1 = dt.getMinute();
		int seconds1 = dt.getSecond();
		int nanosec1 = dt.getNano();

		System.out.printf("%d-%d-%d  %d:%d:%d:%d", day1, month1, year1, hours1, minutes1, seconds1, nanosec1);

		System.out.println();

		System.out.println("**************Specific date and time print*************");

		LocalDateTime dd2 = LocalDateTime.of(1996, Month.OCTOBER, 10, 12, 45);
		System.out.println(dd2);

		System.out.println("After six month: " + dd2.plusMonths(6));
		System.out.println("before six month: " + dd2.minusMonths(6));
		System.out.println("After six days: " + dd2.plusDays(6));
		System.out.println("before six days: " + dd2.minusDays(6));

		System.out.println("*******FIND YOUR AGE YEARS DAY MONTH************");

		LocalDate birthday = LocalDate.of(1996, 10, 8);

		LocalDate today = LocalDate.now();

		Period p = Period.between(birthday, today);

		System.out.println("Your Age: " + p.getYears());
		System.out.println("Your Months: " + p.getMonths());
		System.out.println("Your days: " + p.getDays());

	}

}
