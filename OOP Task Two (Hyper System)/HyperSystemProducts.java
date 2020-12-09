import javax.swing.JOptionPane;

public class HyperSystemProducts {

	public static void main(String[] args) {
		
String name =""; //Declare name variable with initial string
double price= 0.0; //Declare price variable with initial 0 value
String priceString =""; //Declare priceString variable with initial 0 value to use it when convert price from string to double
		
		boolean validEntry = false;  // relating to the Looping of 1st Entry [userEntry] , if Entered valid option it'll loop so that customer enter a valid option
		boolean validProductSelection = false; //Related to the looping of products entry [productType]	

        //Create basic Array with name -"products" - using "Product Class" for items count with initial value = 1
		Product [] products = new Product [1];

//pop-up message for the user have the menu [ add product - delete product - show all products ]
		String userEntry = JOptionPane.showInputDialog(null, "\n Welcome Dear Customer...Please enter one of the blow Options: \n (+) To \"Add\" New Product  \n"
				+ " (-) To \"Remove\" Product \n (#) To \"Print\" All Products");
		
		while (!validEntry) { //while Invalid entry 
		
		switch (userEntry) {
		case "+": // 1st Ask user again about items count he need to add
	        //Create Joptionpane asking user to Enter count of products he want [in order to add this count in array]	
         String itemsCountstring =JOptionPane.showInputDialog("Please enter the items Count you will buy :");
         int itemsCount =Integer.parseInt(itemsCountstring); //convert string to Int
       //then update the above Array -"products" - with new items count that user is entered to store it
         products = new Product [itemsCount];
		
         //then create for loop to loop the item count "itemsCount" 
         for (int i = 0; i < products.length; i++) {
			
        	validEntry = true;
 			String productType = JOptionPane.showInputDialog("1-To add \"Vegetable\" product \n "
 					+ "2-To add \"Electronic\" product \n 3-To add \"Clothe\" Product");

 		    switch (productType) {
 			
 			case "1":  //vegetables
 				
 				 name =JOptionPane.showInputDialog("Please enter the vegetable name :");
 				 priceString = JOptionPane.showInputDialog("Please enter the vegetable price :");
 				       price = Double.parseDouble(priceString); // to convert string price to double
 				      
 				String countString = JOptionPane.showInputDialog("Please enter the vegetable count :");
 				      double count = Double.parseDouble(countString); 
 				      
 				String expiryDate = JOptionPane.showInputDialog("Please enter the vegetable Expiry Date :");
 				
 				Product vegetables = new VegtableProduct(count, expiryDate, name, price); //Create object from "VegtableProduct" constructor of "VegtableProduct" class
 				
 				//then 
 				products [i]=vegetables;
 				
 				break;
 				
 			case "2": //Electronic
 				
 				 name =JOptionPane.showInputDialog("Please enter the Electronic product name :");
 				 priceString = JOptionPane.showInputDialog("Please enter the Electronic product price :");
 				       price = Double.parseDouble(priceString); // to convert string price to double
 				      
 				String type = JOptionPane.showInputDialog("Please enter the Electronic product type :");  
 				      
 				String brandName = JOptionPane.showInputDialog("Please enter the Electronic product brandName  :");
 				
 				Product electronic = new ElectronicProduct(type, brandName, name, price); 
 				
 				products [i]=electronic;
 		
 				break;
 				
 			case "3": //Clothe
 				
				 name =JOptionPane.showInputDialog("Please enter the Clothe product name :");
				 priceString = JOptionPane.showInputDialog("Please enter the Clothe product price :");
				       price = Double.parseDouble(priceString); // to convert string price to double
				      
				String size = JOptionPane.showInputDialog("Please enter the Clothe product size :");  
				      
				String color = JOptionPane.showInputDialog("Please enter the Clothe product color  :");
				
				Product clothes = new ElectronicProduct(size, color, name, price); 
				
				products [i]=clothes;
				
				
 				break;
 				
 			default:
 				validProductSelection = false;
 				productType= JOptionPane.showInputDialog("Invalid input..Please Enter Valid Option \n 1-To add \"Vegetable\" product \n " 
 						                +"2-To add \"Electronic\" product \n 3-To add \"Clothe\" Product");
 				break;
 			}
 			
 			}
		
         //then show the menu again after using finished the (+) steps ,so that in case he need to choose another menu option :
         userEntry = JOptionPane.showInputDialog(null, "\n Welcome Dear Customer...Please enter one of the blow Options: \n (+) To \"Add\" New Product  \n"
 				+ " (-) To \"Remove\" Product \n (#) To \"Print\" All Products");
         validEntry = false;
		break;
//============
		case "-": // to remove or delete item 
			validEntry = true;
			
			if (products.length>0) {//if product s Array > 0 decrease it with 1 item as below
			products [products.length-1] = null; 
//			JOptionPane.showMessageDialog(null, "one item is deleted");
			
			}else { // but if products array <= 0 do the below
				JOptionPane.showMessageDialog(null, "There is no items exist");
			}
			//then show the menu again after using finished the (-) steps ,so that in case he need to choose another menu option :
	         userEntry = JOptionPane.showInputDialog(null, "\n Welcome Dear Customer...Please enter one of the blow Options: \n (+) To \"Add\" New Product  \n"
	 				+ " (-) To \"Remove\" Product \n (#) To \"Print\" All Products");
	         validEntry = false;
			
			break;
//============			
		case "#":  // to print all products 
			validEntry = true;
			
			if(products.length>0) { //if products Array > 0 decrease it with 1 item as below
				
				for (int j = 0; j < products.length; j++) { // for loop : that will print the products details with every loop whatever it was vegetables,Clothes...ETC
					
					products[j].printProductDetails();  //use abstract void printProductDetails();
				}
			}else {// but if products array <= 0 do the below
					JOptionPane.showMessageDialog(null, "There is no items to present");
		}
			break;
			
		default:
			validEntry = false; //Related to the Looping in case of invalid entry
			userEntry= JOptionPane.showInputDialog("Invalid input..Please Enter Valid Option \n (+) To \"Add\" New Product  \n"
					+ " (- ) To \"Remove\" Product \n (#) To \"Print\" All Products");
			
			break;
		
		}
	
	}
	}
}

