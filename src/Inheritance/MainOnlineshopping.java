package Inheritance;

public class MainOnlineshopping {

	public static void main(String[] args) {
		
		Electronic Elect = new Electronic("coil",8999,"usha");
		
//		Elect.calculateTotalcost(4);
		
		System.out.println("Total Electrical cost is "+ Elect.calculateTotalCost(5));
		Elect.displayInfo();
		
		System.out.println("-----------------------------");
		
		Clothing cloth = new Clothing("Louis Vuitton",7000,"M");
		System.out.println("Total clothing cost is " +cloth.calculateTotalCost(6));
		cloth.displayInfo();
		
		
		
		

	}

}
