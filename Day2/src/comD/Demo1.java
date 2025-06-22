package comD;

class A
{
	static{
		System.out.println("This is Static block ");
	}
	{
		System.out.println("This is instance block ");	 
	}
	
	A()
	{
		System.out.println("Hi Constructors....!");
	}
	void display()
	{
		System.out.println("Dispay method..!");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new A();
//		A a2 = new A();
//		A a3 = new A();
		
	}
}
