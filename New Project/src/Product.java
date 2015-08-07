public class Product

public class Product extends Book
{

private String code;
private String description;
private double price;
protected static int count = 0;  

 
    public Product()
    {
    	super(); //calls products
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
		return code;
		
		
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
