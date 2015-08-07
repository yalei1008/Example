import java.util.ArrayList;
import java.util.ArrayList;

public class Transcript {
	
	private ArrayList<CourseEnrollmentt> courseArray;


	public Transcript()
	{
		courseArray=new ArrayList<CourseEnrollmentt>();
		
	}

	public void addItem (CourseEnrollmentt course)
	{
		courseArray.add(course);
	}
	
	public ArrayList<CourseEnrollmentt>getTransctipt()
	{
		return courseArray;
	}}