import java.util.Scanner;

public class Validator 
{
public static String getString(Scanner sc, String prompt)
	{
	  
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

public static int getInt(Scanner sc, String prompt, int min,int max){
	int i=0;
	boolean isValid=false;
	while (isValid==false){
		i= getInt (sc,prompt);
		if((i>max||(i<min)))
				System.out.println("Error! Number must be less than "+max+".");
		else
		isValid=true;
	}
		return i;
	}
public static double getDouble(Scanner sc,String prompt, double min,double max)
{
	double c=0;
	boolean isValid=false;
	while(isValid==false){
		c=getDouble(sc,prompt);
		if(((c>max||c<min)))
			System.out.println("Error! Number must be less than"+max+".");
		else isValid=true;
		
	}
	return c;
}
public static double getDouble(Scanner sc, String prompt){
	double c=0;
	boolean isValid=false;
	while(isValid==false){
		System.out.print(prompt);
		if(sc.hasNextDouble()){
			c=sc.nextDouble();
			isValid=true;}
		else{
			System.out.println("Error! Invalid decimal value. Try again.");
		}
sc.nextLine();}
return c;}
	
	

}








