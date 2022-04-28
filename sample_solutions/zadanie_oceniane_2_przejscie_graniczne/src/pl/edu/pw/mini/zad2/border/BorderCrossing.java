package pl.edu.pw.mini.zad2.border;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.zad2.traveller.Traveller;
import pl.edu.pw.mini.zad2.traveller.Smuggler;
import pl.edu.pw.mini.zad2.traveller.Spy;
import pl.edu.pw.mini.zad2.traveller.Tourist;

public class BorderCrossing {

	private List<Traveller> travellers;
	private List<CustomsOfficer> customsOfficers;
	private Jail jail;
	
	public BorderCrossing() {
		this.travellers = new LinkedList<>();
		for(int i = 0 ; i < 50 ; i++)
			travellers.add(new Tourist());
		for(int i = 0 ; i < 50 ; i++)
			travellers.add(new Spy());
		for(int i = 0 ; i < 50 ; i++)
			travellers.add(new Smuggler());
		Collections.shuffle(travellers);
		
		this.jail = new Jail();
		
		this.customsOfficers = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i++)
			customsOfficers.add(new CustomsOfficer(this.travellers, this.jail));
	}

	public void doJob() throws CantArrestException {
		Random rand = new Random();
		for(int i = 0 ; i < travellers.size() ; i++){
			Traveller p = travellers.get(i);
			int officerIndex = rand.nextInt(customsOfficers.size());
			CustomsOfficer c = customsOfficers.get(officerIndex);
			c.control(p);
			travellers.remove(p);
		}
	}
	
	public List<Traveller> getTravellers() {
		return travellers;
	}

	public List<CustomsOfficer> getCustomsOfficers() {
		return customsOfficers;
	}

}
