package trees.binary.salesNetwork;

public class SalesNetworkTree {
	
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	
	SellerNode root;
	
	/*
	 * Sólo calcula comisiones
	 * */
	public float balance(SellerNode node) {
		if(node == null) {
			return 0;		
		}
				
		float leftChildBalance = balance(node.left);
		leftChildBalance = leftChildBalance*(commissionProfitPercentaje/100);
		

		float rightChildBalance = balance(node.right);
		rightChildBalance = rightChildBalance*(commissionProfitPercentaje/100);
				
		float rootBalance = membershipInitialFee - (membershipInitialFee * membershipDiscountPercentaje/100);
		float totalBalance =  
				+ rootBalance
				+ leftChildBalance
				+ rightChildBalance;
		
		node.balance = totalBalance;
		return totalBalance;
	}
	
	public float totalNetworkBalance(SellerNode root) {
		
		if(root == null) {
			return 0;
		}

		return root.balance + totalNetworkBalance(root.left) + totalNetworkBalance(root.right);
	}
	
	//Condition: root can not be null
	public float getSmallestBalance(SellerNode root) {
			
		if(root.left != null) {
			if(root.right != null) {
				return Math.min(balance(root), Math.min(balance(root.left), balance(root.right)));
			}
		}
		
		if(root.right != null) {
			return Math.min(balance(root), balance(root.right));
		}
		
		return balance(root);		
	}

	//Condition: root can not be null
	public float getLongestBalance(SellerNode root) {
		if(root.left != null) {
			if(root.right != null) {
				return Math.max(balance(root), Math.max(balance(root.left), balance(root.right)));
			}
		}
		
		if(root.right != null) {
			return Math.max(balance(root), balance(root.right));
		}
		
		return balance(root);		
	}
	
}
