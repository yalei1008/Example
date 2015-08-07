import java.text.NumberFormat;


public class LineItem {
double Price;
double total;
private int Quantity;
private Product myProduct;



public LineItem(Product myp, int qua){
this.myProduct =  myp;
this.Quantity=0;
this.total =0;
}

public void setMyProduct(Product product){
	this.myProduct=myProduct;
}
public Product myProduct(){
	return myProduct;
}
public void setquantity(){
	this.Quantity=Quantity;
}
public int getquantity(){
	return Quantity;	
}
public void setTotalPrice(){
	this.total=total;
}
public double getTotalPrice(){
	return total;
}
private void calculateTotal()
{
	total=Quantity*myProduct.getPrice();
}
public String getFormattedTotal()
{
	NumberFormat currency=NumberFormat.getCurrencyInstance();
	return currency.format(this.getTotalPrice());
}
}