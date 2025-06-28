package comA;
class A
{
	A(){
		System.out.println("A constructro,,,.,!");
	}
	A(int a){
		System.out.println("A(int a) constructro,,,.,!");
	}
	void abc()
	{
		System.out.println("Hi Abc method...!");
	}
}
class B extends A
{
	B(){
		System.out.println(" B constuctor");
	}
	void xyz() {
		System.out.println("Hi XYZ methids,,,!");
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
		B b = new B();
	}
}
