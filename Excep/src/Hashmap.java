import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Hashmap {
	public static void main(String[] args){
				
HashMap<Integer, String> myMap = new HashMap<Integer, String>();

myMap.put(new Integer (10),"ten");
//get a set of the entries
Set set=myMap.entrySet();
//get an iterator
Iterator i=set.iterator();
while(i.hasNext()){
	Map.Entry me=(Map.Entry)i.next();
	System.out.print(me.getKey()+"    You entered  ");
	System.out.println(me.getValue());
}


}
}