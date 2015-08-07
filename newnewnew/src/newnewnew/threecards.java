package newnewnew;
import java.util.Random;
import java.util.Scanner;

public class threecards {

public static void main(String[] args){
	Random r = new Random();
	int x; 
	int userchoice;
	String choice = "y";
	Scanner sc = new Scanner (System.in);

	while (choice.equalsIgnoreCase("y"))
	{
		x = 1 + r.nextInt(3);
		System.out.println("Which one is the ace? ");
		System.out.println("## ## ## ");
		System.out.println("## ## ## ");
		System.out.println("1  2  3 ");
		userchoice=sc.nextInt();
		
		if ( userchoice == x )
		{
			System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." );
		}
		else if ( userchoice != x )
		{
			System.out.println( "Ha! Fast Eddie wins again! " );
		}
		if (userchoice==1)
		{   System.out.println( "The random number is 1 " );
			System.out.println("AA ## ## ");
			System.out.println("AA ## ## ");
			System.out.println("1  2  3 ");
		}
		if (userchoice==2)
		{   System.out.println( "The random number is 2 " );
			System.out.println("## AA ## ");
			System.out.println("## AA ## ");
			System.out.println("1  2  3 ");
		}
		if (userchoice==3)
		{	System.out.println( "The random number is 3");
			System.out.println("## ## AA ");
			System.out.println("## ## AA ");
			System.out.println("1  2  3 ");
		}
		System.out.println("Do you want to countinue?");
		choice=sc.next();
	}}}