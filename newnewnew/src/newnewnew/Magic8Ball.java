package newnewnew;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		
		
		String response = "";
		String yesorno = "y";
		Scanner sc = new Scanner (System.in);
		ArrayList<Magic8> questions = new ArrayList<Magic8>();

		while (true)
		{
			
			Magic8 myball = new Magic8 ();
			System.out.println("Ask? ");
			String question = sc.nextLine();
			if(question.equalsIgnoreCase("history"))
			{
				break;
			}
			myball.setQuestion(question);
			
			int choice = 1 + r.nextInt(20);
			
			if ( choice == 1 )
				{response = "It is certain";
				myball.setAnswer(response);}
			else if ( choice == 2 )
			{
				response = "It is decidedly so";
				myball.setAnswer(response);}
			else if ( choice == 3 )
				{
				response = "Without a doubt";
				myball.setAnswer(response);}
			else if ( choice == 4 )
			{
			response = "Yes - definitely";
			myball.setAnswer(response);}
			else if ( choice == 5 )
				{response = "You may rely on it";
				myball.setAnswer(response);
				}
			else if ( choice == 6 )
				{
				response = "As I see it, yes";
				myball.setAnswer(response);}
			else if ( choice == 7 )
				{response = "Most likely";
				myball.setAnswer(response);
				}
			else if ( choice == 8 )
				{response = "Outlook good";
				myball.setAnswer(response);
				}
			else if ( choice == 9 )
				{response = "Signs point to yes";
				myball.setAnswer(response);
				}
			else if ( choice == 10 )
				{response = "Yes";
				myball.setAnswer(response);
				}
			else if ( choice == 11 )			
				{response = "Reply hazy, try again";
				myball.setAnswer(response);
				}
			else if ( choice == 12 )
				{response = "Ask again later";
				myball.setAnswer(response);
				}
				else 
				{response = "8-BALL ERROR!";
				myball.setAnswer(response);
				}
	
			System.out.println( "MAGIC 8-BALL SAYS: " + response );
			questions.add(myball);
			
		}
		
		for (int i=0; i < questions.size(); i++)
		{
			System.out.println(questions.get(i).getAnswer()); 
		}
	}
}