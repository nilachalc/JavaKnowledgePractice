package generalpurpose;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bDay = LocalDate.of(1991, 04, 04);
		Period age = Period.between(today, bDay);
		System.out.println(age);
		
		ZonedDateTime nowKolkata = ZonedDateTime.now();
		ZonedDateTime nowNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(nowKolkata);
		System.out.println(nowNewYork);
		System.out.println(nowKolkata.until(nowNewYork, ChronoUnit.MINUTES)); // should be zero as it's the same time.
	}
}
