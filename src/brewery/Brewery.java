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
	
		//TODO: Die andere Items ergaenzen
		
		// Maischen
		Item maischen = new Item();
		maischen.setName("Maischen");
		maischen.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); // hier meckert er wegen duplicate local variable inputEnergies (und weiter auch...), soll ich das inputEnergiesMaischen benennen?
		inputEnergies.add(new Energie(92.5,"thermisch"));
		maischen.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(170,"Schrot"));                  
		inputStoffes.add(new Stoffe(800,"Trinkwasser"));               // hier sind 2 Einträge, bin nicht sicher, ob ich die richtig gemacht habe (jeder als neue Zeile) 
		maischen.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		maischen.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(800, "Maische"));
		maischen.setOutputStoffe(outputStoffes);
				
		items.add(maischen);
		
		//Laeutern
		Item laeutern = new Item();
		laeutern.setName("Laeutern");
		laeutern.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(0.052,"elektrisch"));
		laeutern.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(800,"Maische"));                  
		inputStoffes.add(new Stoffe(700,"Trinkwasser"));               
		laeutern.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		laeutern.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1350, "Vorderwuerze"));
		outputStoffes.add(new Stoffe(150, "Abwasser"));
		outputStoffes.add(new Stoffe(190, "Treber"));
		laeutern.setOutputStoffe(outputStoffes);
		
		items.add(laeutern);
		
		//Wuerzekochen
				
		Item wuerzekochen = new Item();
		wuerzekochen.setName("Wuerzekochen");
		wuerzekochen.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(0.1,"elektrisch"));
		inputEnergies.add(new Energie(112,"thermisch"));
		wuerzekochen.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1350,"Vorderwuerze"));                  
		inputStoffes.add(new Stoffe(1.3,"Hopfen"));               
		wuerzekochen.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		wuerzekochen.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1215, "Wuerze"));
		outputStoffes.add(new Stoffe(135, "Abwasser"));
		wuerzekochen.setOutputStoffe(outputStoffes);
		
		items.add(wuerzekochen);
		
		
		//Ausschlagen
				
		Item ausschlagen = new Item();
		ausschlagen.setName("Ausschlagen");
		ausschlagen.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(0.006,"elektrisch"));
		ausschlagen.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1215, "Wuerze"));                  
		ausschlagen.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		ausschlagen.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1000, "Ausschlagwuerze"));
		outputStoffes.add(new Stoffe(215, "Abwasser"));
		ausschlagen.setOutputStoffe(outputStoffes);
		
		items.add(ausschlagen);
		
		//Abkuehlen
				
		Item abkuehlen = new Item();
		abkuehlen.setName("Abkuehlen");
		abkuehlen.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		abkuehlen.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1000, "Ausschlagwuerze"));                  
		abkuehlen.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		outputEnergies.add(new Energie(98,"Abwaerme"));
		abkuehlen.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1000, "Ausschlagwuerze"));
		abkuehlen.setOutputStoffe(outputStoffes);
		
		items.add(abkuehlen);

		//Gaerung
				
		Item gaerung = new Item();
		gaerung.setName("Gaerung");
		gaerung.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(0.012,"elektrisch"));
		gaerung.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1000, "Ausschlagwuerze"));
		inputStoffes.add(new Stoffe(10, "Hefe"));
		gaerung.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		gaerung.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1000, "Jungbier"));
		outputStoffes.add(new Stoffe(10, "Hefe"));
		gaerung.setOutputStoffe(outputStoffes);
		
		items.add(gaerung);
		
		//Lagerung_Reifen_Kuehlen
				
		Item lagerungReifenKuehlen = new Item();
		lagerungReifenKuehlen.setName("Lagerung_Reifen_Kuehlen");
		lagerungReifenKuehlen.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(22.045,"elektrisch"));
		lagerungReifenKuehlen.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1000, "Jungbier"));
		lagerungReifenKuehlen.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		outputEnergies.add(new Energie(75.5,"Abwaerme"));
		lagerungReifenKuehlen.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1000, "Bier"));
		lagerungReifenKuehlen.setOutputStoffe(outputStoffes);
		
		items.add(lagerungReifenKuehlen);
		
		//Abfuellung_Etikettieren
		
		Item abfuellungEtikettieren = new Item();
		abfuellungEtikettieren.setName("Abfuellung_Etikettieren");
		abfuellungEtikettieren.setFlaschePro10Hl(1);
		
		ArrayList<Energie> inputEnergies = new ArrayList<Energie>(); 
		inputEnergies.add(new Energie(17.2,"elektrisch"));
		abfuellungEtikettieren.setInputEnergies(inputEnergies);
		
		ArrayList<Stoffe> inputStoffes = new ArrayList<Stoffe>();
		inputStoffes.add(new Stoffe(1000, "Bier"));
		abfuellungEtikettieren.setInputStoffe(inputStoffes);
		
		ArrayList<Energie> outputEnergies = new ArrayList<Energie>();
		abfuellungEtikettieren.setOutputEnergies(outputEnergies);
		
		ArrayList<Stoffe> outputStoffes = new ArrayList<Stoffe>();
		outputStoffes.add(new Stoffe(1000, "Bier, abgef."));
		abfuellungEtikettieren.setOutputStoffe(outputStoffes);
		
		items.add(abfuellungEtikettieren);
		
		return items;
	}
	
}
