import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
	  try{
	
  int a, b = 0, result;
  if (b==0);
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
  result = a / b;
  System.out.println("Result = " + result);
	  }
 
  catch(Exception e){
	  System.out.println("Please do not enter 0");
  }
 
  
 
	  finally {
	      System.out.println("finally block will execute.");
	  }}}
