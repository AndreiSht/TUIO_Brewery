package brewery;

public class Energie {

	private double kWh;
	private String type;
	
	public Energie() {
		super();
	}
	
	public Energie(double kWh, String type) {
		super();
		this.kWh = kWh;
		this.type = type;
	}
	
	public double getkWh() {
		return kWh;
	}
	
	public void setkWh(double kWh) {
		this.kWh = kWh;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
