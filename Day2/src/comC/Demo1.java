package comC;
// parent ---- super ----base   
class A
{
	int a=100;
	int b=200;
	void m1() {
		System.out.println(a+b);
	}
}
// child ---- sub------ Derived 
class B extends A
{
//	int a=100;
//	int b=200;
	int c = 300;
	int d = 400;
	void m1() {
		System.out.println(a+b);
	}
	void m2() {
		System.out.println(c+d);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("======== A class....!=====");
		A  a = new A(); a.m1();
		System.out.println("======== B class....!=====");
		B b = new B();b.m1();b.m2();
	}
}
