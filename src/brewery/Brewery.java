package brewery;

import java.util.ArrayList;

public class Brewery {

	public static  ArrayList<Item> createItems() {
		ArrayList<Item> items = new ArrayList<Item>();
		
		// Schroten
		Item schroten = new Item();
		schroten.setName("Schroten");
		schroten.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>();
		inputEnergies.add(new Energie(1.0,"elektrisch"));
		schroten.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(170,"Malz"));
		schroten.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		schroten.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(170, "Malzschrot"));
		schroten.setOutputStoffe(outputStoffes);
		
		items.add(schroten);
	
		
		//TODO: Die andere Items ergänzen
		
		// Maischen
		
		return items;
	}
	
}
