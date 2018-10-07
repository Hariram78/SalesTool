package ca.demo.SalesTool;


/*Represent a sales data for a given period*/
public class SalesData {

	int data[] = {-1,0,4,42,84};
	
	
	public void display()
	{
		int sum=0;
		System.out.println("data in array");
		for(int i : data ){
			
			
			System.out.println(i);
			sum +=i;
		}
			System.out.println("Sum is " + sum);
	
	}
}
