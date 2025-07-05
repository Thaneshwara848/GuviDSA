package comA;
interface Bank
{
	//it can containonly abstarc tmethdso 
	abstract void ROI() ;		// we are hiding the implementation 
	public abstract void OT();
	abstract void withdraw();
//	void deposit() {
//			//it can containonly abstarc tmethdso 
//	}	: 100% abstarct metghids pnmly : 100%
}
class Sbi implements Bank
{
	@Override
	public void ROI() {					// we are providing the implementation in the child class
		System.out.println("10%");
	}

	@Override
	public void OT() {
			System.out.println("yes we have ");
	}

	@Override
	public void withdraw() {
		System.out.println("50000");
		
	}		
	
}
public class Demo1 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.ROI();s.OT();s.withdraw();
	}
}	
