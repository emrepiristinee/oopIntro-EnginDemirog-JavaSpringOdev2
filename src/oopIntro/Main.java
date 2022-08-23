package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Mercedes", "AMG335", 3000);
		Product product2 = new Product(2, "BMW", "E250", 2500);
		Product product3 = new Product(3, "Audi", "A7", 3000);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.carBrand + " " + product.carModel + " " + product.carPrice);
		}

		ProductManager productmanager = new ProductManager();
		productmanager.addToCart(product1);
	}

}
