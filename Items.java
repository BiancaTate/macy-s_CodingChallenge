
	import java.util.*;
	 

	
	class Item extends Stores{
		
		static ArrayList<String> listOfItems;
		
		static Scanner input = new Scanner(System.in);
		
		protected static HashMap<String , Integer> itemList;
		public HashMap<String,Integer> getHashmap() {
			return itemList;
		}
		 public void setHashmap(HashMap<String, Integer> itemList) {
		        this.itemList = itemList;
		    }
		
		public static String name;
		public static int storeItems2;
		
		
		
		
		public static void createItem(String item, int itemNumber) {
			
			String again;// continue to add items to hash map 
			
			
			itemList = new HashMap<>();// hash map to store item names and numbers together
			
			System.out.println("CREATE ITEMS:");
			System.out.println();
			
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
	            
	            
	           
	         
	            
	            System.out.print("Would you like to log another item name and number?");
	            input.nextLine();
	            again= input.nextLine();
	            
			}// end of do statement 
	     
			while (again.equalsIgnoreCase("yes"));
			
			// if answer is no either call displayStores method or createItem method
			
			System.out.println();
			Item continues= new Item();
			continues.display_item();
		

		
		}
		
		
		
		
		
		private void display_item() {// optional
			if (itemList.isEmpty()) {
				System.out.println("No stores found");
			}
			else {
				
			
			System.out.println("Here are your list of items: " + itemList);
			}
			
			System.out.println();
			Item continues= new Item();
			continues.addItemsToStore(null, 0, null, 0);
			
		}
		
		
		
		
		public void addItemsToStore(String item, int itemNumber,String name, int storeNumber) {
			
			System.out.println("ADD ITEMS TO STORE:");
			System.out.println();
			
			System.out.println("What store would you like to add items to? ");
			name= input.nextLine();
			if (!create.containsKey(name)){
				System.out.println("Store does not exist.");// checking to see if store has been created
			}
			else {
			
			this.name=name;
			
			System.out.println("Please choose an item to add to store " + name + ".");
			
			 
			 listOfItems = new ArrayList<String>(); // item list to add to store and to check for duplicates
			
			 
			 do {
			
			 
			 item = input.nextLine();
			 if (listOfItems.contains(item)) {
				 System.out.println("This item is already in the store.");
				 
			 }
			 else{
				 System.out.println("Item name added to " + name + " .");
				 listOfItems.add(item);
				 
			 	}
			 System.out.print("Would you like to log another item name?");
	         item= input.nextLine();
			 }
			
			 
			 while (item.equalsIgnoreCase("yes"));
			
			 System.out.println();
			 Item dsi = new Item();
			 dsi.displayStoreItems(null,0);
			} // end of first else statement 
		
		}
		
		// if item is not in list throw an exception
		
		
		
		public void displayStoreItems(String storeItems, int storeItems2) { // optional
			
			
			System.out.println("Please enter store name and item number");
			storeItems= input.nextLine();
			storeItems2=input.nextInt();
			this.storeItems2=storeItems2;
			
			if(storeItems.equalsIgnoreCase(name)||itemList.containsValue(storeItems2)) {
			
			System.out.println("Store name: " +name +" and Items: " +  listOfItems  );  
			
			
			}
			
			else {
				System.out.println("Item/Store not found");
			}
			
			 
			Orders order= new Orders();
			order.startOrder();
			
			 
			
		}
		
		

		
		
		
		
		
			
		
	}


