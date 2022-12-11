import java.util.*;


 class Orders extends Item{
	 
	 static Scanner input = new Scanner(System.in);
	 
	 private static String order;
	 public String getOrder() {
		 return order;
	 }
	 public void setOrder(String newOrder) {
		 this.order=newOrder;
	 }
	 
	 
	 public static void startOrder() {
		 
		 System.out.println("Please enter a name for your order: ");
		 order= input.nextLine();
		 
		 
		 
		
		 System.out.println("What is the name of the store where the order will be placed?");
		 String order3=input.nextLine();
		 	if (order3.equalsIgnoreCase(name)) {
		 		System.out.println("What item will be included in the order?");
		 	}else {
		 		System.out.println("Store does not exist");
		 	}
		 	String order2=input.nextLine();
		 	if (!listOfItems.contains(order2)) {
		 		System.out.println("Item does not exist");
		 		}
		 		else {
		 			System.out.println();
		 			Orders done = new Orders();
		 			done.displayOrder(null);
		 		
		 	}
		 
		
	 

}
	 private void displayOrder(String storeName) {
		 System.out.println("Enter the name of your store to display your order.");
		 String complete = input.nextLine();
		 if (complete.equalsIgnoreCase(name)) {
			 System.out.println("Store name:" +name+"\n"+"Order Name: "+order+"\n"+"Items: "+listOfItems+"\n"+"Quantity: "+storeItems2);
		 }
		 
		 
		 
	 }
 
 
 
 }
 
 
 
 
