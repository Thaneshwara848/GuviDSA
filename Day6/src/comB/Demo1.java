package comB;
class Car									// final class Car : we cant inheriate 
{
	final int speed= 250;					// we cant re assign 
	private int model = 2024;
	private String color = "Red";
//	1000 variable 
//	100o method			: private ? 
	final void gare() {						// we cant over ride 
		System.out.println("5 gare car ");
	}
}
class Benz extends Car
{
	// speed
	// model
	// color
}
class Varna extends Car
{
//	@Override
//	void gare() {
//		System.out.println("Auto gare car ");		we cant over ride bcz its final method
//	}
}
public class Demo1 {
	public static void main(String[] args) {
		Benz b = new Benz();
		System.out.println(b.speed);
		//b.speed=2500; we cant re assign 
		System.out.println(b.speed); // 2500 
		b.gare();
		
		Varna v = new Varna();
		v.gare();
	}
}
