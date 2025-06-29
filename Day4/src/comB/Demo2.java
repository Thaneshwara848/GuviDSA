package comB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
class Developer
{
	
}
public class Demo2 {

	public static void main(String[] args) {
	
				// hetosGinus 
				// size os not fixed ...!
		ArrayList al = new ArrayList(5);
		al.add(100);
		al.add(100);
		al.add(300);
		al.add(700);
		al.add(250);
//		al.add("Thanesh");
//		al.add(10.6);
//		al.add(new Date());
//		al.add(new Developer());
		//System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
