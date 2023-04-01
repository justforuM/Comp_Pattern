package Comp_Pattern;

public class Main {
	  public static void main(String[] args) {
	        Engine engine = new Engine("V6");
	        Car car = new Car(engine, "Toyota", "Camry");
	        
	        System.out.println("Make: " + car.getMake());
	        System.out.println("Model: " + car.getModel());
	        System.out.println("Engine Type: " + car.getEngine().getType());
	    }
}
