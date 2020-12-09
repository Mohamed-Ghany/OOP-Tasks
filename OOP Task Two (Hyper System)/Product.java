
public abstract class Product {

	protected String name;
	protected double price;
	
	abstract double calculatePrice();
	abstract void printProductDetails();
	
//Setter & Getter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
