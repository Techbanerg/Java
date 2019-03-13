package working_with_calender_data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.lang.StringBuilder;


/*  Local date can be stored dates like 2015-12-27 
 *  without time and time zones. 
 * 	
 * */

public class Main {
	public static void main (String[] args) {
		LocalDate date1 = LocalDate.of(2016, 12, 31);
		LocalDate date2 = LocalDate.of(2018, Month.FEBRUARY, 15);
		LocalDate date3 = LocalDate.now();
		
		LocalDate date4 = LocalDate.parse("2020-11-30");
		
//		 you will get date time parse exception  must be exactly
//       the format 9999-99-99.
	
		
		//using parse method
		
		LocalDate jhinukbirthday = LocalDate.parse("1996-02-02");
		LocalDate sankhabirthday  = LocalDate.parse("1986-02-15");
	    System.out.println(date1 + " \n" + date2 + "\n" + date3);
	    System.out.println(date4.getDayOfMonth() + "\n" + date4.getDayOfYear() + "\n" + date4.getDayOfWeek());
	    System.out.println(jhinukbirthday.isAfter(sankhabirthday));
	    System.out.println(jhinukbirthday.isBefore(sankhabirthday));
	    System.out.println(jhinukbirthday.minusDays(10));
	    System.out.println(jhinukbirthday.isAfter(sankhabirthday));
	    String [] arr = new String[7];
	    System.out.println(arr);
	    
	    LocalDate bday = LocalDate.of(1986, 02, 15);
	    System.out.println(bday.minusDays(10));
	    System.out.println(bday.minusMonths(5));
	    System.out.println(bday.minusWeeks(4));
	    System.out.println(bday.plusDays(10));
	    System.out.println(bday.plusMonths(5));
	    System.out.println(bday.plusWeeks(4));
	    
	    LocalTime timeHrsMin = LocalTime.of(12, 12);
	    LocalTime timeHrsMinSec = LocalTime.of(0, 12, 8);
	    LocalTime timeHrsMinSecNano = LocalTime.of(12, 45, 50, 1000);
	    System.out.println(LocalTime.MIN);
	    System.out.println(LocalTime.MAX);
	    System.out.println(LocalTime.NOON);
	    System.out.println(LocalTime.MIDNIGHT);
	    //querying local time on its hours mins and seconds.
	    LocalTime timex = LocalTime.of(18,  20, 30, 9999);
	    System.out.println(timex.getHour());
        System.out.println(timex.getMinute());
        System.out.println(timex.getSecond());
        
        // manipulating local time.
	    
	    LocalTime movieStartTime = LocalTime.parse("21:00:00");
	    int commuteMin  = 45;
	    LocalTime shankhaStarttime = movieStartTime.minusMinutes(commuteMin);
	    System.out.println("Sankha Should start at : "+shankhaStarttime);
	    
	    //With Method
	    LocalTime startTime = LocalTime.of(5,  6, 7);
	    if (startTime.getMinute() < 30)
	    	startTime = startTime.withMinute(0);
	    System.out.println(startTime);
	    
	    LocalTime s1 = LocalTime.of(10, 30, 45);
	    System.out.println(s1.withHour(1));
	    System.out.println(s1.withMinute(20));
	    System.out.println(bday.minusYears(-4));
	    
	    LocalDate date7 = LocalDate.of(2012,  1,  11);
	    Period period1 = Period.ofMonths(2);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-DD-YY");
	    System.out.println(formatter.format(date7.plus(period1)));
	    
	    
	    //Period People often talk about the period of  years months or days .
	    //The period class represents  
	    //Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
	    //System.out.println(period);
	    
	    Period period113 = Period.of(2, 11, 15);
	    Period period24 = Period.ofDays(-10);
	    Period p5YRS1 = Period.parse("P5y10m0d");
	    Period p5Yrs2 = Period.parse("p5y");
	    System.out.println(p5YRS1 + ":" + p5Yrs2);
	}
	
}
