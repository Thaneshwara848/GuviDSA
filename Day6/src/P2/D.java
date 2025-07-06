package P2;
import P1.A;
public class D extends A {

	void display() {
		//System.out.println(a);	// private we cant 
		//System.out.println(b);
		System.out.println(c);	// bcz its sub class but in other package
		//System.out.println(d);	// its only in same package 
	}
}
class E extends D
{
	//A a2= new A();
	void display() {
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(a2.c);
		//System.out.println(d);
	}
}
class F
{
	
	void display() {
		A a1= new A();
		//System.out.println(a1.a);// only for sinlge class 
		System.out.println(a1.b);
		//System.out.println(a1.c);	// protect  is not child / sub class 
		//System.out.println(a1.d);   // default 
	}
}
