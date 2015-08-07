public class Book extends Product {
    private String author;
    private int pages;
    private int count;

 public Book()
 {
	 count++;
 }

 public void setAuthor(String author)
 { 
	 this.author = author;
 }
 
 public void setPages(String pages)
 {
	 this.pages = pages;
 }
 
 @Override
 public String toString()
 {
	 return super.toString()+"Author:     "
+ author + "\n" ;
	 return super.toString()+"pages:   "+pages+ "\n";
 }}
}
