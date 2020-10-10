package binary.search.tree;

import java.lang.annotation.Native;

public class NaiveCitizenSearchProgram {
	
	public static void main(String[] args) {
		
		NaiveCitizenSearch ncs = new NaiveCitizenSearch();		
		Citizen c1 = new Citizen(35, "Pepito 1");		
		ncs.addCitizen(c1);
		Citizen c2 = new Citizen(14, "Pepito 2");
		ncs.addCitizen(c2);
		Citizen c3 = new Citizen(91, "Pepito 3");
		ncs.addCitizen(c3);
		Citizen c4 = new Citizen(27, "Pepito 4");
		ncs.addCitizen(c4);
		Citizen c5 = new Citizen(8765, "Pepito 5");
		ncs.addCitizen(c5);
		
		Citizen searchResult = ncs.search(910);
		if(searchResult == null) {
			System.out.println("Citizen not found");
		}
		else {
			System.out.println("Citizen found. Name: " + searchResult.name);
		}		
	}
	
}
