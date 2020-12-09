
public class ElectronicProduct extends Product{

//Data field / attributes 
	
private String type;
private String brandName;


//Constructors

public ElectronicProduct(String type, String brandName , String name , double price) {
	
	this.type = type;
	this.brandName = brandName;
	this.name =name;
	this.price =price;
}
//Methods [ override] and getter & setter methods	

	@Override
	double calculatePrice() {
		// TODO Auto-generated method stub
		return price; //As long As electronic will be sold one piece so only return the price & no need to make calculation
	}

	@Override
	void printProductDetails() {  // Method for printing
		// TODO Auto-generated method stub
		System.out.println("This Electronics product and its Name is "+name+
				"\n The Brand Name is "+brandName+"\n The Type is  "+type+
				"\n The Price is "+ calculatePrice());
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}	
	
}
