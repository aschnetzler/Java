package lab02;

public class SalesDemo {
	public static void main(String[] args) {
		// Instance 1
		SalesTag USB = new SalesTag();
		USB.setName("PNY -Turbo Plus 128GB USB 3.0 Flash Drive -Silver/Black");
		USB.setModel("P-FD128TBOP-GE");
		USB.setReviewRate(4.7);
		USB.setUnitPrice(29.99);
		USB.setQuantity(3);
		System.out.println("Name: " + USB.getName() + "\n" + "Model: " + USB.getModel() + "\n" + "Review Rate: "
				+ USB.getReviewRate() + "\n" + "Unit Price: " + USB.getUnitPrice() + "\n" + "Quantity: "
				+ USB.getQuantity() + "\n" + "Total Price: " + USB.getTotalPrice());
		// Instance 2
		SalesTag Mouse = new SalesTag();
		Mouse.setName("AmazonBasics 3 Button USB Wired Mouse (Black)");
		Mouse.setModel("MSU0939");
		Mouse.setReviewRate(4.5);
		Mouse.setUnitPrice(6.99);
		Mouse.setQuantity(26);
		System.out.println("\n" + "\n" + "Name: " + Mouse.getName() + "\n" + "Model: " + Mouse.getModel() + "\n"
				+ "Review Rate: " + Mouse.getReviewRate() + "\n" + "Unit Price: " + Mouse.getUnitPrice() + "\n"
				+ "Quantity: " + Mouse.getQuantity() + "\n" + "Total Price: " + Mouse.getTotalPrice());
	}
}
