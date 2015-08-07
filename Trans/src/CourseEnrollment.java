import java.util.ArrayList;



public class CourseEnrollment {

	private String course;
	private int credit;
	private String grade;
	private String GPA;
private ArrayList<Transcript>enrolledcourses;


public CourseEnrollment(String course){
	this.course=course;
	enrolledcourses=new ArrayList<Transcript>();
}


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

public ArrayList<Transcript> getEnrolledcourses() {
	return enrolledcourses;
}

public void setEnrolledcourses(ArrayList<Transcript> enrolledcourses) {
	this.enrolledcourses = enrolledcourses;
}

public void setGPA(String gPA) {
	GPA = gPA;
}

public CourseEnrollment(String course, String grade, int credit){
this.course =  course;
this.credit =credit;
this.grade=grade;
}


}
