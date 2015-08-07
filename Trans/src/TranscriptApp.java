import java.util.Scanner;

public class TranscriptApp {
	
	public static void main(String[] args){
	double gradevalue;
	//display a welcome message
System.out.println("Welcome to the transcript application.");
System.out.println();
Scanner sc=new Scanner(System.in);
String choice="y";
while(choice.equalsIgnoreCase("y"))
{	
	CourseEnrollment mycourse= new CourseEnrollment();
	System.out.print("Enter course: ");
	String course=sc.next();
	mycourse.setCourse(course);
	//read product code
	sc.nextLine();
	//get the input from the user for quantity
	Validator.getInt(sc,"Enter credits: ");
	String credits= sc.next();
	//mycourse.setCredit(credit);
	
	sc.nextLine();
	System.out.print("Enter grade: ");
	String grade=sc.next();
	//mycourse.setGPA(grade);
	
	if(grade.equals("A"))
		gradevalue=4.0;
	else if(grade.equals("B"))
	gradevalue=3.0;
	else if(grade.equals("C"))
	gradevalue=2.0;
	else if(grade.equals("D"))
	gradevalue=1.0;

sc.nextLine();
System.out.println();

if(grade.equals("A"))
	gradevalue=4.0;
else if(grade.equals("B"))
	gradevalue=3.0;
else if(grade.equals("C"))
	gradevalue=2.0;
else if(grade.equals("D"))
	gradevalue=1.0;


//create the Transcript object and set its fields
Transcript transcript=new Transcript();
transcript.setchoice(grade);
transcript.setchoice(credits);
transcript.setchoice(course);

//display the output
System.out.println();
System.out.println("Transcript");
System.out.println(
		"Course:    "+transcript.getCourse());
System.out.println(
		"Credits:    "+transcript.getCredit());
System.out.println(
		"Grade:    "+transcript.getGrade());


System.out.println("Another line item? (y/n) ");
choice=sc.nextLine();
System.out.println();


}}}

	