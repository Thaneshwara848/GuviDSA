package comA;
class Car
{
	private int speed;
	private int model ;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class Demo1 {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.setSpeed(250);
		c.setModel(2020);
		System.out.println(c.getSpeed());
		System.out.println(c.getModel());
	

	}

}
