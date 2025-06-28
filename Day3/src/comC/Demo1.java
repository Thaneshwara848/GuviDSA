package comC;
class Bank{
	void rateOfIntrest() {
		System.out.println("!...10%");
	}
}
class Sbi extends Bank{}
class Axis extends Bank{
	@Override
	void rateOfIntrest() {
		System.out.println("!...12%"); // same method name same signature// but diff implementation 
	}
}
class Emp{
	Emp(){
		System.out.println("Emp(){}");
	}
	Emp(int uid,String name, String desig){
		System.out.println("3 paramanert");
	}
	Emp(int uid,String name,int age,int salary, String desig){
		System.out.println("3 paramanert");
	}
	// same constructor name + multiple times + diff diff parametre + in same class = constro over loding
	void draw() {
		System.out.println("Just Draw");
	}
	void draw(int r) {
		System.out.println(" Draw a Circle"+(2 * r * r ));
	}
	void draw(int l,int b) {
		System.out.println(" Draw a Reactange"+( l * b ));
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Sbi s = new Sbi();s.rateOfIntrest();
		Axis a = new Axis();a.rateOfIntrest();
		Emp e= new Emp();e.draw();e.draw(10);e.draw(10,20);
	}
}
