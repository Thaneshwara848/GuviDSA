package comC;
class Parent
{
	int site = 4;
	int money=50000;
	String car ="BMW";
	void use() {
		System.out.println("Site :"+ site);
		System.out.println("Money :"+ money);
		System.out.println("Car :"+ car);
	}
}
class Child extends Parent
{
	int money=20000;		// instance 	
	void use() {
		int money=5000;	 //	first prefrence 
		System.out.println("Site :"+ site);
		System.out.println("Money :"+ money);
		System.out.println("Money :"+ this.money);  // same class / current class 
		System.out.println("Money :"+ super.money); // parent class / super class 
		System.out.println("Car :"+ car);
	}
	void abc() {
		System.out.println(money); // 200000 : bcz its globle var
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.use();
		
		Child c = new Child();
		c.use();
	}
}
