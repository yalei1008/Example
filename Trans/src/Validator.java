import java.util.Scanner;

public class Validator 
{
public static String getString
	(Scanner sc, String prompt){
		System.out.print(prompt);
		String s=sc.next(); //read the user entry
		sc.nextLine();     // discard any other data
		return s;
		}
	
public static double getInt(Scanner sc, String prompt)
{
	int i=0;
	boolean isValid=false;
	while (isValid=false);
	{
		System.out.print(prompt);
		if (sc.hasNextInt())
		{
			i=sc.nextInt();
			isValid=true;
		}
		else
		{
			System.out.println(
					"Error! Invalid interger value.");
		}
		sc.nextLine(); //discard any other
	}
	return i;
}

public static double getInt(Scanner sc, String prompt, int min,int max){
	int i=0;
	boolean isValid=false;
	while (isValid==false){
		i=(int) getInt (sc,prompt);
		min=0;
		max=4;
		if (i<=min)
			System.out.println("Error! Number must be greater than " + min+ ".");
		else if(i>=max)
			System.out.println("Error! Number must be less than "+max+".");		
		else
			isValid=true;
}
	return i;
}}











