package binary.search.tree;

public class CitizensBinarySearchTree {

	CitizenNode root;
	
	public void addCitizen(Citizen newCitizen) {
		if(root == null) {
			root =  new CitizenNode(newCitizen);
			return;
		}
		
		addCitizen(root, newCitizen);
	}
	
	private void addCitizen(CitizenNode node, Citizen newCitizen) {
		
		if(node == null) {
			return;
		}
		
		if(newCitizen.id > node.citizen.id) {
			if(node.rigth == null) {
				node.rigth = new CitizenNode(newCitizen);
			}
			else {
				addCitizen(node.rigth, newCitizen);
			}
		}
		else {
			if(node.left == null) {
				node.left = new CitizenNode(newCitizen);
			}
			else {
				addCitizen(root.left, newCitizen);
			}
		}		
	}
	
	public Citizen search(int id) {
		return search(root, id);
	}
	
	private Citizen search(CitizenNode node, int id) {
		
		if(node == null) {
			return null;
		}
		
		if(node.citizen.id == id){
			return node.citizen;
		}
		
		if(node.citizen.id < id) {
			return search(node.rigth, id);
		}
		
		return search(node.left, id);
	}
}
