//How to write to a file and read from a file
 //don't forget to include Exception handling
 //import these libraries from the java api
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;

public class Readnwrite
  {
  public static void main( String[] args )
    {
	 HashMap<Integer,String>map=new HashMap<Integer,String>();
	 
	map.put(new Integer(10),"Ten");
	System.out.println("map= "+map);
	
	System.out.print;n("A")
    
 String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");

 //write to a file
 PrintWriter writer = null;
 writer = new PrintWriter(new File(filename));
 writer.println("this is a string");
 writer.close();

 //read a file
 BufferedReader reader = new BufferedReader(new FileReader(filename));
 String line = reader.readLine();
 System.out.println(line);
 reader.close();