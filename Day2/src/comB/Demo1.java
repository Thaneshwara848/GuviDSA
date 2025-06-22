package comB;
class Car
{
	int model=2024;				// with obj 
	void display() {
		System.out.println("instance method...!");
	}
	static int speed=250;		// without obj 
	static void gare()
	{
		System.out.println("5 gares...!");
	}
}
public class Demo1 {
	public static void main(String[] args) {

//	Car benz = new Car();			 //through the obj only we have to cal
//	System.out.println(benz.speed);
//	benz.gare();
		
//		without creating obj : (STATIC)

//		Class.variablename
//		Classname.methodName
		System.out.println(Car.speed);
		Car.gare();
	
		Car c = new Car();				// instance varaible 
		System.out.println(c.model);
		c.display();
		
	}
}
