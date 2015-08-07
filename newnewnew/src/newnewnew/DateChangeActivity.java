package newnewnew;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateChangeActivity
{
public static void main ( String[] args )
{

	 java.util.Date date= new java.util.Date();
	 String timeStamp = new SimpleDateFormat("hh:mm").format(new Date());
	 System.out.println(timeStamp);
	
	 int day, month, year;
     int second, minute, hour;
     GregorianCalendar date1 = new GregorianCalendar();

     day = date1.get(Calendar.DAY_OF_MONTH);
     month = date1.get(Calendar.MONTH);
     year = date1.get(Calendar.YEAR);

     second = date1.get(Calendar.SECOND);
     minute = date1.get(Calendar.MINUTE);
     hour = date1.get(Calendar.HOUR);

     System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
     System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
	
}
}

 