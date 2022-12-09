
	import java.util.*;

	// Item class will extend Store class?
	class Item extends Stores{
		
		// values will be used from Order class 
		
		
		public static void createItem(String item, int itemNumber) {
			Scanner input = new Scanner(System.in);
			String again;// continue to add items to hash map 
			
			
			HashMap<String , Integer> itemList = new HashMap<>();// hash map to store item names and numbers
			
			do {
	        	System.out.print("Enter an item name:");
	        	item= input.nextLine();
	            System.out.print("Enter an item number:");
	            itemNumber = input.nextInt();
	            
	            if ( itemList.containsValue(itemNumber)) { // checking if store number is unique
	        	  System.out.println("Item number is not unique. Please try again");
	   
	            	}// end of if statement
	           else {
	        	 System.out.println("Item name and number created successfully");
	           
	            
	        	 itemList.put(item, itemNumber);  // adding user input to hash map 

	           		} // end of else statement 
	            
	            
	           
	           System.out.println(itemList);
	            
	            
	            System.out.print("Would you like to log another item name and number?");
	            input.nextLine();
	            again= input.nextLine();
	            
			}// end of do statement 
	     
			while (again.equalsIgnoreCase("yes"));
			
			// if answer is no either call displayStores method or createItem method
		

		
		}
		
		
		
		
		
		public void display_item() {// optional
			
		}
		
		
		
		
		public void addItemsToStore(String name, int storeNumber,String item, int itemNumber) {
			
			
		
			
		}
		
		
		public void displayStoreItems() { // optional
			
		}

		
		
		
		
		
			
		
	}


