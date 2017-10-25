package stockFB;

public class stock {
	// Attributes
	private String symbol;
	private double openPrice;
	private double price;
	private String name;
	private double previousClose;
	private String date;
	private String time;
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the openPrice
	 */
	public double getOpenPrice() {
		return openPrice;
	}
	/**
	 * @param openPrice the openPrice to set
	 */
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the previousClose
	 */
	public double getPreviousClose() {
		return previousClose;
	}
	/**
	 * @param previousClose the previousClose to set
	 */
	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * @param symbol
	 * @param openPrice
	 * @param price
	 * @param name
	 * @param previousClose
	 * @param date
	 * @param time
	 */
	public stock(String symbol, double openPrice, double price, String name,
			double previousClose, String date, String time) {
		super();
		this.symbol = symbol;
		this.openPrice = openPrice;
		this.price = price;
		this.name = name;
		this.previousClose = previousClose;
		this.date = date;
		this.time = time;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "facebook [symbol=" + symbol + ", price=" + price + "]";
	}
	/**
	 * 
	 */
	public stock() {
		super();
	}
	public double getVariation(){
		return (this.openPrice- this.price); 
	}
	

	// Methods
		
}
