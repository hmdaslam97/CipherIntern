package TA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Budget : ");
		int budget=scan.nextInt();

		List<String> grocery=new ArrayList<String>();
		int count=0;
		
		while(true)
		{
			System.out.println("1.Add an Item\n2.Exit\nEnter your Choice : ");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1: 
				
				
				System.out.println("Enter product :");
				scan.nextLine();
				String product=scan.nextLine();
				
				
				System.out.println("Enter quantity :");
				String quantity=scan.nextLine();
				
				System.out.println("Enter Price :");
				int price=scan.nextInt();
				
				String list=product+"\t\t"+quantity+"\t\t"+price;
				
				grocery.add(count++, list);
				if(budget>=price)
				{
					budget-=price;
					System.out.println("Amount left : "+budget);
					
				}
				else
				{
					System.out.println("Can't Buy the product ###(because budget left is "+budget+")");
					break;
				}
				break;
			
			
			default:
				System.out.println("Product name\tQuantity\tPrice");
				for(int i=0;i<grocery.size();i++)
				{
					System.out.println(grocery.get(i));
				}
				
				System.exit(0);
			}
		}
		
	}
}
