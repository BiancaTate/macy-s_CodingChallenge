import java.util.*;

	public class Stores {
		
		private HashMap<String , Integer> create = new HashMap<>();
		
		public HashMap<String,Integer> getHashmap() {
			return create;
		}
		 public void setHashmap(HashMap<String, Integer> create) {
		        this.create = create;
		    }
		
		public static void createStore(String name, int storeNumber) {
			Scanner input = new Scanner(System.in);
			String again;
			
			
			HashMap<String , Integer> create = new HashMap<>();// hash map to store name with number values
		        

		        
				do {
		        	System.out.print("Enter a store name:");
		            name = input.nextLine();
		            System.out.print("Enter a store number:");
		            storeNumber = input.nextInt();
		            
		            if (create.containsValue(storeNumber)) { // checking if store number is unique
		        	  System.out.println("Store number is not unique. Please try again");
		   
		            	}// end of if statement
		           else {
		        	 System.out.println("Store name and number created successfully");
		           
		            
		        	 create.put(name, storeNumber);  // adding user input to hash map 

		           		} // end of else statement 
		            
		            
		           
		           System.out.println(create);
		            
		            
		            System.out.print("Would you like to log another store name and number?");
		            input.nextLine();
		            again= input.nextLine();
		            
				}// end of do statement 
		     
				while (again.equalsIgnoreCase("yes"));
				
				
				// if answer is no either call displayStores method or createItem method
				
				
				
				
				System.out.println();
				Item next= new Item();
				next.createItem(null,0);
			

			
			
			
		}
		public void displayStores() {/// optional 
			
			// print the store number by having user type in store name 
			// get hash map value from the key 
			
			System.out.println("Please verify that store name and number have been created");
			System.out.println("Enter store name");
		
			
		}
		


		
		
		
			
		

	}


