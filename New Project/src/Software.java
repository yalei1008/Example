public class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    
    public Software()
    {
    	super();
    }
    

    public String getProgrammer()
{
    	return programmer;
}

    @Override
public String toString()
{
    	return super.toString()+"Programmer:     "+ programmer + "\n";
}}