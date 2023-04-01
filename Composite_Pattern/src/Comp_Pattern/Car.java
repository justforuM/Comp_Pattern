package Comp_Pattern;

public class Car {
	  private Engine engine;
	    private String make;
	    private String model;
	    
	    public Car(Engine engine, String make, String model) {
	        this.engine = engine;
	        this.make = make;
	        this.model = model;
	    }
	    
	    public Engine getEngine() {
	        return engine;
	    }
	    
	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }
	    
	    public String getMake() {
	        return make;
	    }
	    
	    public void setMake(String make) {
	        this.make = make;
	    }
	    
	    public String getModel() {
	        return model;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }
}
