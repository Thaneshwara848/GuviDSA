package ComCcollection;

import java.util.ArrayList;
import java.util.Iterator;
				// size is Dynimic in nature 
				// allow the hetroginus values 
				// freamworks : we  have many read made methods are avaliable 
public class Demo2 {
	public static void main(String[] args) {
		//List l = new List();	// bcz its interface : list 
				ArrayList al = new ArrayList(4);
				al.add(100);
				al.add(500);
				al.add("Thanesh");
				al.add(12.6);
				al.add('A');
				al.add(240);					// add method 
				System.out.println(al);
				Iterator i =al.iterator();		// iterator
				while(i.hasNext()) {
					System.out.println(i.next());//100,500,240/120.340
				}
				System.out.println(al.contains(500));//if(arr[i]==54) {}
				al.add(2, 222);						// if(i==2) arr.push(222);
				System.out.println(al);
				al.remove(2);						// if(i==2) arr.pop(222);		
				System.out.println(al);
				System.out.println(al.isEmpty());	// if(arr[i]==null){}
				System.out.println(al.size());
										
				ArrayList al2= new ArrayList();
				al2.add(12);
				al2.add(34);
				al2.add(45);
				al.addAll(al2);				// addig the both Array 
				System.out.println(al);
				al2.clear();				// delete all the elememts
				System.out.println(al2);
	}
}
