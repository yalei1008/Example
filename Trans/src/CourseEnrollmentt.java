import java.util.ArrayList;



public class CourseEnrollmentt {

	private String course;
	private double credit;
	private String grade;
	private double GPA;


public String getcourse(){
	return course;
}
	public void setcourse(String course){
		this.course=course;
	}

	public CourseEnrollmentt(){
		this.course=course;
}
	public String getgrade(){
		return grade;
	}
	public void setgrade(String grade){
	this.grade=grade;
	}
	public double getcredit(){
		return credit;}
	public void setcredit(){
		this.credit=credit;
		
	}
	public double getGPA(){
		return GPA;
	}
	public void setGPA(){
		if(grade.equalsIgnoreCase("A"))
		{
			GPA=4.0;			
		}
		else if (grade.equalsIgnoreCase("B"))
				{
			GPA=3.0;
				}
		else if (grade.equalsIgnoreCase("C"))
		{
			GPA=2.0;
		}
		else if (grade.equalsIgnoreCase("D"))
		{
			GPA=1.0;
		}
	}
	
}
