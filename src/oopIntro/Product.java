package oopIntro;

public class Product {

	int id;
	String carBrand;
	String carModel;
	double carPrice;
	
	public Product() {
		System.out.println("hey");
	}

	public Product(int id, String carBrand, String carModel, double carPrice) {
		this.id = id;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carPrice = carPrice;
	}

	
}
