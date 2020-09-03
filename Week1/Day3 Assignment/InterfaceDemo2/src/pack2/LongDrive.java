package pack2;

import pack1.Car;

public class LongDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(1947, "Q3", 40, 160, "sedan");
		System.out.println(c.start());
		if (c.increaseSpeed(180) != 0) {
			System.out.println(c.increaseSpeed(80));
		} else {
			System.out.println("Stop the car..... Maximum speed " + c.getMaxSpeed() + " reached");
		}
		System.out.println(c.stop());

	}

}
