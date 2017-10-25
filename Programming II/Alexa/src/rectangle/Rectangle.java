package rectangle;

public class Rectangle {
	// Attributes
			private double length;
			private double width;

		// Constructor
		// GETS and SETs
		// Methods
		public void setLength(double len){
				this.length =len;
		}
		public double getLength(){
				return this.length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getArea(){
			return this.length * this.width;
		}
		public double getPerimeter(){
			return (this.length * 2) +(this.width * 2);
		}
					
		}


