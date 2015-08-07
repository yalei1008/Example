import java.awt.print.Book;
import java.util.Arrays;


public class ProductDB {

public static Product getProduct(String productCode)
{
Product p=null;

if(productCode.equalsIgnoreCase("java")||
		productCode.equalsIgnoreCase("jsps"))
{
	Product b=new Product();
	if(productCode.equalsIgnoreCase(("java"))){
		b.setCode(productCode);
		b.setDescription("Murach's Beginning Java");
		b.setPrice(49.5);
	}
	else if(productCode.equalsIgnoreCase("jsps")){
		b.setCode(productCode);
		b.setDescription("Murach's Java Servlets and JSP");
		b.setPrice(49.5);
	}
		p=b; //set Product variable equal to the book object
	}
			
		return p;
	
}
}