package duke.choice;

class ShopApp {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a Duke Choice App");
		
		Customer c1 = new Customer();
		c1.setName("Pinky");
		c1.setSize(3);
		System.out.println("El nombre del cliente es: "+c1.getName());
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		Clothing item3 = new Clothing();
		Clothing item4 = new Clothing();
		
		item1.setDescription("Blue Jacket"); item1.setPrice(20.9); item1.setSize("M");
		item2.setDescription("Orange T-Shirt"); item2.setPrice(10.9); item2.setSize("S");
		item3.setDescription("Green Scarf"); item3.setPrice(5); item3.setSize("S");
		item4.setDescription("Blue T-Shirt"); item4.setPrice(10.5); item4.setSize("S");
		
		Clothing[] items = {item1, item2, item3, item4};
//		c1.setSize("L");
		double total = 0;

		for (Clothing clothing : items) {
			if (total > 15) {
				break;
			}
			if (c1.getSize() == clothing.getSize()) {
				System.out.println("clothing, "+clothing.getDescription()+", "+clothing.getPrice()+", "+clothing.getSize());
				total += clothing.getPrice();
			}
		}
		System.out.println("Total clothing price: "+ total);
		System.out.println("Tamaño cliente 1: "+c1.getSize());
	}

}
