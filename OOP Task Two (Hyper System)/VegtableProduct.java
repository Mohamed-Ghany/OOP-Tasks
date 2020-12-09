
public class VegtableProduct extends Product {
	//set the mouse pointer on "VegtableProduct" then select "Add unimplemented method" so will add the override	


//Data Field
 private double count;
 private String expiryDate;
 
//Constructors :
	public VegtableProduct(double count, String expiryDate , String name, double price) {
		super();
		this.count = count;
		this.expiryDate = expiryDate;
		this.name = name;
		this.price = price;
	}
 
//Create Methods [ using the override] & Setter and getter 
	@Override
	double calculatePrice() {  //method to calculate price
		// TODO Auto-generated method stub
		return count * price;
	}

	@Override
	void printProductDetails() { // method to print vegetables Details
		// TODO Auto-generated method stub
		System.out.println("This Vegatbles product and its Name is "+name+
				"\n The Expiry date is "+expiryDate+"\n The Count is  "+count+
				"\n The Price is "+ calculatePrice());
	}


	public double getCount() {
		return count;
	}


	public void setCount(double count) {
		this.count = count;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
