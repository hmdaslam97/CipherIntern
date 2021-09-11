package TA;

import java.util.Scanner;

public class TrianglePattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello everyone!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of Columns");
		int x=scan.nextInt();		
		printEquilateralTriangle1(x);
		printAlphabetTriangel2(x);
	}
	
//	Printing First Triangle
	public static void printEquilateralTriangle1(int x)
	{
		System.out.println("First Triangle");
		int c=x-1,d=1,z=1;
		for(int i=1;i<=x;i++)
		{
			for(int j=0;j<=c;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=d;k++)
			{
				if(k==1 || i==1 ||k==d || k%2!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			c--;
			d+=2;
		}
		System.out.println();
	}
	
//	Printing Second Triangle
	public static void printAlphabetTriangel2(int x)
	{
		System.out.println("Second Triangle");
		int c=x+x;
		char alphabets='A';
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(alphabets+++" ");
			}
			System.out.println();
			c-=2;
		}
	}
}
