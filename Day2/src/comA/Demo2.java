package comA;
class A 
{
	A() {
		
			System.out.println("A class ");
	}
	void display()
	{
		System.out.println("Hi method...!");
		
	}
}
class B
{
	B() {
		
			System.out.println("B class ");
	}
}
class vechil
{
}
public class Demo2 {
	public static void main(String[] args) {
	
			System.out.println("Hi Demo2 class ");
			A a = new A();a.display();a.display();a.display();a.display();
			A a1 = new A();
			B b= new B();
			vechil car = new vechil();
			vechil bus= new vechil();
			vechil cycle = new vechil();
	}

}
