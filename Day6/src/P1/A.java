package P1;

public class A {
	private int a =100;
	public int b =200;
	protected int c = 300;
			int d = 400;// same package 
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class B extends A
{
	void display() {
		//System.out.println(a); only for sinlge class 
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class C
{
	void display() {
		A a1= new A();
		//System.out.println(a1.a);// only for sinlge class 
		System.out.println(a1.b);
		System.out.println(a1.c);	// protect 
		System.out.println(a1.d);   // default 
	}
}