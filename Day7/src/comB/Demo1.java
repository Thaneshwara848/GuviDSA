package comB;
interface A
{
	void sonu();
}
interface  B
{

	void sonu();
}
class C implements A,B
{

	@Override
	public void sonu() {
		System.out.println("Callling Sonu....!");
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		
		C c = new C();
			A a =c;
			B b =c;
//		c.sonu();
//			A a = new A();	// we cant crerate a obj of Interface 
			a.sonu();		// through A interface 
			b.sonu();		// through B interface 
	}

}
