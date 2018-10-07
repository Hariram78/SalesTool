package ca.demo.SalesTool;

/*Represent a sales data for a given period*/
public class SalesData {

	int data[] = {0,4,42};
	
	
	public void display()
	{
		int sum=0;
		System.out.println("data in array");
		for(int i=0;i<data.length;i++) {
			
			
			System.out.println(data[i]);
			sum +=i;
		}
			System.out.println("Sum is " + sum);
	
	}
}
