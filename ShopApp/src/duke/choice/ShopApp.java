package duke.choice;

class ShopApp {

	public static void main(String[] args) {
		final double tax = 0.2;
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a Duke Choice App");
		
		Customer c1 = new Customer();
		c1.name = "Pinky";
		System.out.println("El nombre del cliente es: "+c1.name);
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		item1.description = "Blue Jacket"; item1.price = 20.9; item1.size = "M";
		item2.description = "Orange T-Shirt"; item2.price = 10.5; item2.size = "S";
		
		System.out.println("Item1, "+item1.description+", "+item1.price+", "+item1.size);
		System.out.println("Item2, "+item2.description+", "+item2.price+", "+item2.size);
		
		double total;
		total = (item2.price * 2 + item1.price)*(1+tax);
		System.out.println("Tatal: "+total);
	}

}
