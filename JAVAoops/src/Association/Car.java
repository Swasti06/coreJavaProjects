package Association;

public class Car {
	private int carId;
	private Engine engine;
	
	public Car(int carId, Engine engine) {
		super();
		this.carId=carId;
		this.engine=engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", engine=" + engine + "]";
	}
	
	
}
