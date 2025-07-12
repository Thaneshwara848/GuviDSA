package comA;
interface I 
{
	int a; 		// no we must have to assign a valie : int a =100;
	I(){}		// no we cant Create constructor 
	void loan();	// by default its abastarct 
	public abstract void roi();
	void abc() {}  // it will not allow thw with body 
}
interface J
{	
}
interface K extends I,J 	// its possible 
{}
class Impl implements I
{

	@Override
	public void loan() {
	}

	@Override
	public void roi() {
		
	}
	@Override
	public void abc() {	
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
		I  i = new I(); // not possible 
		Impl i = new Impl();
		i.loan();i.roi();i.abc();
	}
}
