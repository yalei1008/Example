package newnewnew;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dateactivity {
	
	static final int MILLS_IN_DAY=24*60*60*1000;
	public static void main (String []args){
		Display();
	}
	public static String getCurrentDate()
	{
		
		Scanner key = new Scanner(System.in);
		Random r=new Random();
		
		String Date;
		int Year, Month, Day;	
		System.out.println("Please enter the year");
		Year = key.nextInt();
		System.out.println("Please enter the Month");
		Month = key.nextInt();
		System.out.println("Please enter the Date");
		Day=key.nextInt();
		
		GregorianCalendar DATE = new GregorianCalendar(Year, Month - 1, Day);
		
		//System.out.println (DATE.get(Calendar.DAY_OF_WEEK));
		int d= DATE.get(Calendar.DAY_OF_WEEK);
		String dayString;
		switch(d){
		case 1: dayString="That was a Sunday.";
		break;
		case 2: dayString="That was a Monday.";
		break;
		case 3: dayString="That was a Tuesday.";
		break;
		case 4: dayString="That was a Wednesday.";
		break;
		case 5: dayString="That was a Thrusday.";
		break;
		case 6: dayString="That was a Friday.";
		break;
		case 7: dayString="That was a Saturday.";
		break;
		default:dayString="Invalid day.";
		break;
		}
	  return dayString;
		}
	
	
	public static int daysDiff(Date DATE, Date date2)
	{ 
		long D1,D2;
		D1=DATE.getTime();
		D2=date2.getTime();
	    
		long longDiff=D1-D2;
		return (int) (longDiff/MILLS_IN_DAY);    		
	}
	
	
	public static void Display(){
	GregorianCalendar currentGC=new GregorianCalendar();
	int currentYear=currentGC.get(Calendar.YEAR);
	
	String D1=Dateactivity.getCurrentDate();
	
	Date now =new Date();
    String D2=Dateactivity.getCurrentDate();
    daysDiff(D1,now);
    System.out.println(D1+D2);
//    int daysTotoday=Dateactivity.daysDiff(D1, D2);
    
//    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
//	 
//   String formattedDate=dateFormat.format(D1);
//	System.out.println("Today is"+ daysTotoday);
//	
//	}
}
}
