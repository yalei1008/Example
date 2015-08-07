import java.util.Scanner;


public class TranscriptApp {
	
	public static void main(String[] args){
	
	//display a welcome message
System.out.println("Welcome to the transcript application.");
System.out.println();
Scanner sc=new Scanner(System.in);
String choice="y";
Transcript mytranscript= new Transcript();
while(choice.equalsIgnoreCase("y"))
{	
	CourseEnrollmentt mycourse= new CourseEnrollmentt();
	String coursecode=Validator.getString(sc,"Enter course: ");
	mycourse.setcourse(coursecode);
	double credit=Validator.getDouble(sc, "Enter credits: ");
	mycourse.setcredit();
	String grade=Validator.getString(sc, "Enter grade: ");
	mycourse.setgrade(grade);
	mycourse.setGPA();

	choice=Validator.getString(sc, "Another course? (y/n): ");

	System.out.println("Course     "+"Credits     "+"Grade    "+"Quality Points     ");
	System.out.println("------     "+"------      "+"-----    "+"--------------     " );
	System.out.println();
	
	double total=0;
	double number=0;
	
	for (int i=0; i<mytranscript.getTransctipt().size();i++)
	{
		System.out.format(mytranscript.getTransctipt().get(i).getcourse(),
						mytranscript.getTransctipt().get(i).getcredit(),
						mytranscript.getTransctipt().get(i).getgrade(),
						mytranscript.getTransctipt().get(i).getGPA());
						total+=mytranscript.getTransctipt().get(i).getGPA();
		number++;
		}
	double GPA=0.0;
	GPA=total/number;
		
System.out.format("GPA:  "+ String.format("   ",GPA));
}}}
	
	
	



	