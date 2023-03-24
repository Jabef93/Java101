package duke.choice;

class ShopApp {

	public static void main(String[] args) {
		final double TAX = 0.2;
		
		System.out.println("Bienvenido a Duke Choice App");
		
		Customer c1 = new Customer();
		c1.name = "Pinky";
		c1.size = "S";
		System.out.println("El nombre del cliente es: "+c1.name);
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		Clothing item3 = new Clothing();
		Clothing item4 = new Clothing();
		
		item1.description = "Blue Jacket"; item1.price = 20.9; item1.size = "M";
		item2.description = "Orange T-Shirt"; item2.price = 10.5; item2.size = "S";
		item3.description = "Green Scarf"; item3.price = 5; item3.size = "S";
		item4.description = "Blue T-Shirt"; item4.price = 10.5; item4.size = "S";
		
		
//		System.out.println("Item1, "+item1.description+", "+item1.price+", "+item1.size);
//		System.out.println("Item2, "+item2.description+", "+item2.price+", "+item2.size);
		
		Clothing[] items = {item1, item2, item3, item4};
		
		double total = 0;
//		total = (item2.price * 2 + item1.price)*(1+tax);
//		System.out.println("Total: "+total);
//		
//		total = (items[1].price * 2 + items[0].price)*(1+tax);
//		System.out.println("Total (con arrays): "+total);
		
		for (Clothing clothing : items) {
			if (total > 15) {
				break;
			}
			if (c1.size == clothing.size) {
				System.out.println("clothing, "+clothing.description+", "+clothing.price+", "+clothing.size);
				total += clothing.price;
			}
		}
		total = total * (1 + TAX);
		System.out.println("Total clothing price: "+ total);
		
		int measurement = 3;
		switch (measurement) {
			case 1, 2, 3:
				c1.size = "S";
				break;
			case 4, 5, 6:
				c1.size = "M";
				break;
			case 7, 8, 9:
				c1.size = "L";
				break;
			default:
				c1.size = "XL";
		}
		System.out.println("Tamaño cliente 1: "+c1.size);
		
	}

}
