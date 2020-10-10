package binary.search.tree;

//Mala solución, really bad solution.
public class NaiveCitizenSearch {
	
	Citizen[] citizens = new Citizen[100];
	int citizensCount = 0;
	
	public void addCitizen(Citizen citizen) {
		citizens[citizensCount] = citizen;
		citizensCount++;
	}
	
	public Citizen search(int id) {
		Citizen result = null;
		for(int i=0; i<citizensCount; i++) {
			if(citizens[i].id == id) {
				result = citizens[i];
			}
		}
		
		return result;
	}
}
