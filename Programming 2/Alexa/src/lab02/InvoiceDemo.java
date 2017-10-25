package lab02;

public class InvoiceDemo {

	public static void main(String[] args) {
		double total;
		double tax;
		// Set Headings
		System.out.println("Invoice");
		System.out.println("\n" + "Description" + "\t" + "Qty" + "\t" + "Price");
		System.out.println("------------------------------");

		// Instance 1
		InvoiceItem Accomedation = new InvoiceItem();
		Accomedation.setDescription("Accomedation");
		Accomedation.setQuantity(1);
		Accomedation.setDollarAmount(135.50);
		System.out.println(Accomedation.getDescription() + "\t" + Accomedation.getQuantity() + " Night" + "\t"
				+ Accomedation.getDollarAmount());
		total = Accomedation.getDollarAmount();

		// Instance 2
		InvoiceItem Internet = new InvoiceItem();
		Internet.setDescription("Internet");
		Internet.setQuantity(2);
		Internet.setDollarAmount(20.00);
		System.out.println(Internet.getDescription() + "\t" + Internet.getQuantity() + " Days" + "\t"
				+ Internet.getDollarAmount());
		total = total + Internet.getDollarAmount();
		// Instance 3
		InvoiceItem Food = new InvoiceItem();
		Food.setDescription("Food");
		Food.setQuantity(1);
		Food.setDollarAmount(22.50);
		System.out.println(
				Food.getDescription() + "\t" + "\t" + Food.getQuantity() + " Small" + "\t" + Food.getDollarAmount());

		System.out.println("------------------------------");
		total = total + Food.getDollarAmount();
		System.out.println("TOTAL:" + "\t" + "\t" + "\t" + "$" + total);
		tax = (total / 10);
		System.out.println("Tax" + "(10%):" + "\t" + "\t" + "$" + tax);
		System.out.println("\n" + "Thank you for staying with us");
	}

}
