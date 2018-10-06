package ca.demo.SalesTool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
	}
	
	
	public static void displayGreeting()
	{
		System.out.println("HELLO HAPPY SALES PEOPLE!");
		System.out.println("THIS APP SHOWS SALES DATA");
		
		
		System.out.println("Test 1 for Sales tool");
		System.out.println(("Test 2 for Sales tool"));
	}
}
