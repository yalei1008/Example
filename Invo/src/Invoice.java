import java.util.ArrayList;
public class Invoice {
	
private ArrayList<LineItem> invoiceArray;
private String choice;
private ProductDB DB;

public Invoice(){
	this.invoiceArray= new ArrayList<LineItem>();
	this.choice="y";
	this.DB= new ProductDB();	
	
}

public String getchoice(){
	return choice;
	
}
public void setchoice(String choice){
	this.choice=choice;}
public void addItem (LineItem myItem){
myItem.setMyProduct(DB.getProduct(myItem.myProduct().getCode()));
System.out.println(invoiceArray);

}
	public ArrayList<LineItem> getLineItem(){
		return invoiceArray;
	}
}

