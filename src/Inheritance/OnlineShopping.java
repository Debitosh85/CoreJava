package Inheritance;

public class OnlineShopping {
	
	protected String name;
	protected double price;
	
	
	public OnlineShopping (String name,double price )
	{
		this.name = name;
		this.price = price ;
	}
	
	public void displayInfo()
	{
		System.out.println("Name of product is :"+ name);
		System.out.println("Price of the product is :"+price);
	}
	
	public int calculateTotalCost(int quantity)
	{
		int  totalCost = (int)  price * quantity;
		
		return totalCost;
	}
	
}
	
	
	class Electronic extends OnlineShopping
	{
		private String brand;
		
		public Electronic(String name,double price,String brand)
		{
			super(name,price);
			this.brand = brand;
			
		}
		
		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Brand name is :"+brand);
		}
	}
	
	class Clothing extends OnlineShopping
	{
		private String size;
		
		public Clothing (String name,double price,String size)
		{
			super(name,price);
			this.size = size;
		}
		
		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Size is :"+size);
		}
	}
	
	
	
	


