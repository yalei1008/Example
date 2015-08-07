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
	
public static int getInt(Scanner sc, String prompt)
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
	
//	
//	private String code; 
//	private int quantity;
//	
//	Scanner sc=new Scanner(System.in);
//	
//	boolean running=true;
//	{
//	while(running){
//		
//		System.out.println("Welcome to the invoice application.");
//		System.out.println("Enter product code: ");
//		code=sc.next();
//		System.out.println("Enter quantity: ");
//		quantity=sc.nextInt();
//	}
//	
	}