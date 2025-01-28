package javaPractice2025;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
		car.applyBreak();
		car.drive();
		//car.changeGear();// Goes with error as the car object has been created with the vehicle reference
		
		Car car1 = new Car();
		car1.drive();
		car1.changeGear();
		

	}

}
