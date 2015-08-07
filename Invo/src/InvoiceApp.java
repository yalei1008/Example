import java.util.Scanner;


public class InvoiceApp {
	public static void main(String[] args){
//display a welcome message
		System.out.println("Welcome to the invoice application.");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the product code: ");
			String productCode=sc.next();
			//read product code
			sc.nextLine();
			//get the Product object
			Product p=ProductDB.getProduct(productCode);
			//display the output
			System.out.println();
			//get the input from the user for quantity
			Validator.getInt(sc, "Please enter quantity");
			//System.out.println("Enter product quantity ");
			String quantity= sc.next();
			if (p!=null)
				System.out.println(p);
			else
				System.out.println("No product mathes this product "+ "code.\n");
	//see if the user wants to continue			
			System.out.println("Another line item? (y/n) ");
			choice=sc.nextLine();
			System.out.println();
		}
}}