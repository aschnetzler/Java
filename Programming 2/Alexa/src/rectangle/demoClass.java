package rectangle;

public class demoClass {
	public static void main(String[] arg) {
		//Example
		Rectangle box = new Rectangle();
		box.setLength(10.0);
		box.setWidth(5.0);
		box.getArea();
		System.out.println(box.getArea());
		//Bedroom
		Rectangle bedroom= new Rectangle();
		bedroom.setLength(12.0);
		bedroom.setWidth(12.0);
		System.out.println(bedroom.getArea());
		//Kitchen
		Rectangle kitchen= new Rectangle();
		kitchen.setLength(11.0);
		kitchen.setWidth(10.0);
		System.out.println(kitchen.getArea());
		//Den
		Rectangle den= new Rectangle();
		den.setLength(8.0);
		den.setWidth(9.0);
		System.out.println(den.getArea());
	}
		public boolean isSquare(){
			return (this.length = this.width);

}