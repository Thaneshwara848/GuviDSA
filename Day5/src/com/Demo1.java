package com;
abstract class Bank{
	abstract void ROI() ;		// we are hiding the implementation 
	abstract void OT();
	abstract void withdraw();
	void deposit() {
			// abstarct can have both abstarct methods as well as non abstact methods...!
	}	// 0 -100%
} 
class Sbi extends Bank 		// if any class which extends the abstract class 
							//we must have to override all abstarct methods
{
	@Override
	void ROI() {					// we are providing the implementation in the child class
		System.out.println("10%");
	}

	@Override
	void OT() {
			System.out.println("yes we have ");
	}

	@Override
	void withdraw() {
		System.out.println("50000");
		
	}							 	
}
class Axis extends Bank{
	@Override
	void ROI() {
		System.out.println("12 %");
	}

	@Override
	void OT() {
		System.out.println("Yes we have ");
	}

	@Override
	void withdraw() {
		System.out.println("40000");		// we can provide our only implemetation but we cant skip
		
	}
}
public class Demo1 {
	public static void main(String[] args) {
	
		Sbi s = new Sbi();s.ROI();s.OT();s.withdraw();
		
		Axis a = new Axis();	a.ROI();a.OT();a.withdraw();
	}
}

	// Abstarction : we can hide the implemention ,only showing the funcanualty to end use 
	// if mthods os is abstract , thenclass also must be absyarct 
	// if the class is abstratc , we cant create abject 
	