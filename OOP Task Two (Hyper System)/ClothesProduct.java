
public class ClothesProduct extends Product {

//Data Field / attributes 	
private String size;
private String color;
	
//Constructors :
public ClothesProduct(String size, String color , String name, double price) {
	this.size = size;
	this.color = color;
	this.name = name;
	this.price = price;
}

//Methods [override] & Getter/Setter methods	
	@Override
	double calculatePrice() {
		//price will be differentiated in case of XXL & XXXL [ in case of xxl or xxxl the case = price *1.4 , if else will take the normal price ,
		//so we'll use ternary operator >> [ ( condition) ?  : ] if the condition achieved will take the value before colon but if didn't will take the value after colon 
		return (size.toLowerCase().equals("xxl") || size.toLowerCase().equals("xxxl")) ? price *1.4 : price;  // ternary Operator
	}

	@Override
	void printProductDetails() {
		System.out.println("This Clothes product and its Name is "+name+
				"\n The Size is "+size+"\n The Color is  "+color+
				"\n The Price is "+ calculatePrice());
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
