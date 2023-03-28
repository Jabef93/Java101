package duke.choice;

public class Clothing {
	private final double MINIMUN_PRICE = 10;
	private final double TAX = 0.2;
	private String description;
	private double price;
	private String size = "M";
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price * (1 + TAX);
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price > MINIMUN_PRICE) {	
			this.price = price;
		}
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
