package brewery;

public class Stoffe {

	private double kg;
	private String stoff;
	
	public Stoffe() {
		super();
	}
	
	public Stoffe(double kg, String stoff) {
		super();
		this.kg = kg;
		this.stoff = stoff;
	}
	
	public double getKg() {
		return kg;
	}
	
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public String getStoff() {
		return stoff;
	}
	
	public void setStoff(String stoff) {
		this.stoff = stoff;
	}
	
}
