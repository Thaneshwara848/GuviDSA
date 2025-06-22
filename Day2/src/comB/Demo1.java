package comB;
class Car
{
	static int speed=250;
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
		
	}
}
