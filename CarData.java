public class CarData implements CarInterface{
	private String brand;
	private String model;
	private double engine;
	private double gasMileage;
	private int doors;
	private String transmission;
	
	public CarData (String brand, String model, double engine, double gasMileage,
			int doors, String transmission){
		
		this.brand=brand;
		this.model=model;
		this.engine=engine;
		this.gasMileage=gasMileage;
		this.doors=doors;
		this.transmission=transmission;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getModel(){
		return model;
	}
	
	public double getEngine(){
		return engine;
	}
	
	public double getGasMileage(){
		return gasMileage;
	}
	
	public int getDoors(){
		return doors;
	}
	
	public String getTransmission(){
		return transmission;
	}
}
