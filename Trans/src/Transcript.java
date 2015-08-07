import java.util.ArrayList;
import java.util.ArrayList;
public class Transcript {
	private ArrayList<CourseEnrollment> courseArray;


private ArrayList<CourseEnrollment> invoiceArray;
private String choice;
public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public int getCredit() {
	return credit;
}

public void setCredit(int credit) {
	this.credit = credit;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}
private String course;
private int credit;
private String grade;
private String GPA;

public Transcript(){
	this.invoiceArray= new ArrayList<CourseEnrollment>();
	this.choice="y";
	
}

public String getchoice(){
	return choice;
	
}
public void setchoice(String choice){
	this.choice=choice;}
public void addItem (CourseEnrollment myItem){

}
	public ArrayList<CourseEnrollment> getLineItem(){
		return invoiceArray;
	}
}

