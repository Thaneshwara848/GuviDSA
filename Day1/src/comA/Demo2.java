package comA;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter ID : ");
		int id=sc.nextInt();						// nextInt  reads the INT data
		
		System.out.println("ENter Name : ");
		String name=sc.next();						// next only reads the String data
		
		// age 			int  / byte 
		//salary 		float/double
		//designation     String 
		
		System.out.println("My ID is :" + id);
		System.out.println("My Name is :" + name);	
		//print age , salary , desig 
	}
}