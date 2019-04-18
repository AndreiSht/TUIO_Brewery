package brewery;

import java.util.ArrayList;

public class Item {
	
	private String name;
	private ArrayList<Energie> inputEnergies;
	private ArrayList<Stoffe> inputStoffe;
	private ArrayList<Energie> outputEnergies;
	private ArrayList<Stoffe> outputStoffe;
	private double flaschePro10Hl;
	
	public Item() {
		super();
	}
	
	public Item(String name, double inputEnergieName, double inputEnergieKWh, double inputStoffeName,
			double inputStoffeKg, double outputEnergieName, double oututEnergieKWh, double oututStoffeName,
			double oututStoffeKg, double flaschePro10Hl) {
		super();
		this.name = name;
		this.inputEnergies = new ArrayList<Energie>();
		this.inputStoffe = new ArrayList<Stoffe>();
		this.outputEnergies = new ArrayList<Energie>();
		this.outputStoffe = new ArrayList<Stoffe>();
		this.flaschePro10Hl = flaschePro10Hl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Energie> getInputEnergies() {
		return inputEnergies;
	}

	public void setInputEnergies(ArrayList<Energie> inputEnergies) {
		this.inputEnergies = inputEnergies;
	}

	public ArrayList<Stoffe> getInputStoffe() {
		return inputStoffe;
	}

	public void setInputStoffe(ArrayList<Stoffe> inputStoffe) {
		this.inputStoffe = inputStoffe;
	}

	public ArrayList<Energie> getOutputEnergies() {
		return outputEnergies;
	}

	public void setOutputEnergies(ArrayList<Energie> outputEnergies) {
		this.outputEnergies = outputEnergies;
	}

	public ArrayList<Stoffe> getOutputStoffe() {
		return outputStoffe;
	}

	public void setOutputStoffe(ArrayList<Stoffe> outputStoffe) {
		this.outputStoffe = outputStoffe;
	}

	public double getFlaschePro10Hl() {
		return flaschePro10Hl;
	}
	
	public void setFlaschePro10Hl(double flaschePro10Hl) {
		this.flaschePro10Hl = flaschePro10Hl;
	}

}
