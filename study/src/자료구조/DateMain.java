package 자료구조;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) throws ParseException {

		//��¥
		//Date, Calander, Timestamp, SimpleDateFormat, LocalDateTime
		
		//long current = System.currentTimeMillis();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = sdf.parse("2022-11-08");
		
		long ms1 = d1.getTime();
		
		long nextDay = ms1 + (1000*60*60*24);
		
		System.out.println(new Date(nextDay));
		
	}

}
