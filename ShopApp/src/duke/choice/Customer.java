package duke.choice;

public class Customer {
	private String name;
	private String size;
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
	/**
	 * @param size the size to set
	 */
	public void setSize(int measurement) {
		switch (measurement) {
		case 1, 2, 3:
			setSize("S");
			break;
		case 4, 5, 6:
			setSize("M");
			break;
		case 7, 8, 9:
			setSize("L");
			break;
		default:
			setSize("XL");
		}
	}

}
