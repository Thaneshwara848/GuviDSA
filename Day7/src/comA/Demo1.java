package comA;
			// we can hide the method implementation 
			// hiding the implementation
abstract class Bank
{	
//		int a;			yes we decalare a valiable : default int 0 
//		Bank(){}		yes we can create a constructor in abstarct class
		abstract void loan() ;
		abstract void roi() ;
//		abstract void atm();	we must have to override in child ,compulsary
		void abc() {} // yes with and without body both allowed 
}
class Sbi extends Bank
{
	void loan() {
		System.out.println("EDU,CAR ");
	}
	@Override
	void roi() {
		System.out.println("10%");
	}
}
class Axix extends Bank
{
	void roi() {
		System.out.println("15%");
	}
	@Override
	void loan() {
		System.out.println("All Loan avalaible ");
	}
}
class A1{}
class B1{}
//class C1 extends A1,B1{}		no , multiple Inheriatnce is not possble
public class Demo1 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.loan();s.roi();
		Axix a = new Axix();a.roi();a.loan();
//		Bank b = new Bank();  we cant create a obj of bank class 
	}
}
