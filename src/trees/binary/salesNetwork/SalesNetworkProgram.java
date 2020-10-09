package trees.binary.salesNetwork;

public class SalesNetworkProgram {

	public static void main(String[] args) {
		
		SalesNetworkTree salesNetworkTree = new SalesNetworkTree();
		salesNetworkTree.membershipInitialFee = 1000;
		salesNetworkTree.membershipDiscountPercentaje = 10;
		salesNetworkTree.commissionProfitPercentaje = 25;
		
		SellerNode maria = new SellerNode();
		maria.sellerName = "Maria";
		SellerNode luis = new SellerNode();
		luis.sellerName = "Luis";
		SellerNode pedro = new SellerNode();
		pedro.sellerName = "Pedro";
		maria.left = luis;
		maria.right = pedro;
		
		SellerNode pepito = new SellerNode();
		pepito.sellerName = "Pepito";
		pedro.left = pepito;
		
		SellerNode carlitos = new SellerNode();
		carlitos.sellerName = "Carlitos";
		pepito.right = carlitos;
		
		salesNetworkTree.root = maria;
		
		float balance = salesNetworkTree.balance(maria);
		System.out.println("Maria's Balance: " + balance);
		
		float totalBalance = salesNetworkTree.totalNetworkBalance(maria);
		System.out.println("Total balance: " + totalBalance);
		
		float smallestBalance = salesNetworkTree.getSmallestBalance(maria);
		System.out.println("Smallest balance: " + smallestBalance);
		
		float longestBalance = salesNetworkTree.getLongestBalance(maria);
		System.out.println("Longest balance: " + longestBalance);		
	}

}
